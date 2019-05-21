package com.mihais.Admitere.Services;

import com.mihais.Admitere.Models.Persoane.Candidat;

import java.io.*;

public class CandidatFileService {

    private static CandidatFileService ourInstance = new CandidatFileService();

    public static CandidatFileService getInstance(){
        return ourInstance;
    }

    private CandidatFileService(){}

    public Candidat readCandidatFromFile(String filePath) {

        Candidat candidat = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            String line = lineNumberReader.readLine();
            String[] data = line.split(",");
            int aux1 = Integer.parseInt(data[1]);
            int aux2 = Integer.parseInt(data[4]);
            candidat = new Candidat(data[0], aux1, data[2], data[3], aux2, data[5]);

            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        return candidat;
    }

    public void writeCandidatToFile(Candidat candidat, String filePath){

        try
        {
            //bufferedwriter in loc de fileWriter pt minimizarea nr de syscalluri
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter  = new BufferedWriter(fileWriter);

            bufferedWriter.write(candidat.getNume());
            bufferedWriter.write(",");
            bufferedWriter.write(Integer.toString(candidat.getVarsta()));
            bufferedWriter.write(",");
            bufferedWriter.write(candidat.getCNP());
            bufferedWriter.write(",");
            bufferedWriter.write(candidat.getEmail());
            bufferedWriter.write(",");
            bufferedWriter.write(Integer.toString(candidat.getCandidatID()));
            bufferedWriter.write(",");
            bufferedWriter.write(candidat.getOras());

            bufferedWriter.close();
        }catch (FileNotFoundException e){
                                            e.printStackTrace();
                                        }
        catch (IOException e){
                                e.printStackTrace();
                             }
    }
}
