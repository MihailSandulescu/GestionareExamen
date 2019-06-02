package com.mihais.Admitere.Services;

import com.mihais.Admitere.Models.Facultate;
import com.mihais.Admitere.Models.Locatie.Location;
import com.mihais.Admitere.Models.Materie;
import com.mihais.Admitere.Models.Persoane.Candidat;
import com.sun.security.ntlm.Client;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseService{

    private static DatabaseService instance = new DatabaseService();

    private Connection connection = null;

    private DatabaseService(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pao?serverTimezone=UTC","root", "root");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static DatabaseService getInstance(){ return instance;  }

    public void closeDatabaseConnection(){
        try{
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Candidat> getTotiCandidati(){
        ArrayList<Candidat> candidati = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from candidati");

            while (resultSet.next()) {
                Candidat cnd = new Candidat(resultSet.getString("nume"),
                                            resultSet.getInt("varsta"),
                                            resultSet.getString("CNP"),
                                            resultSet.getString("email"),
                                            resultSet.getInt("id"),
                                            resultSet.getString("oras")
                                           );
                candidati.add(cnd);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return candidati;
    }

    public ArrayList<Facultate> getToateFacultatile() {
        ArrayList<Facultate> facultati = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from facultati");

            while (resultSet.next()) {
                Facultate fac = new Facultate(resultSet.getInt("numarTotalLocuri"),
                                              resultSet.getInt("numarLocuriBuget"),
                                              resultSet.getInt("numarCandidatiInscrisi"),
                                              resultSet.getString("nume"),
                                              resultSet.getString("oras")
                );
                facultati.add(fac);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return facultati;
    }
}
