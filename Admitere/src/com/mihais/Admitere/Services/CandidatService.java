package com.mihais.Admitere.Services;

import com.mihais.Admitere.Models.Persoane.Candidat;

import java.util.ArrayList;

public class CandidatService {

    private ArrayList<Candidat> candidati = new ArrayList<>();

    private static CandidatService instance = new CandidatService();

    public static CandidatService getInstance(){
        return instance;
    }

    private CandidatService(){}

    public void addCandidat(Candidat cnd){
        candidati.add(cnd);
    }

    public Candidat getCandidat(String CNP){
        for( Candidat c : candidati){
            if(c.getCNP().equals(CNP)){
                return c;
            }
        }
        return null;
    }

    public Candidat getCandidat(int id){
        for( Candidat c : candidati){
            if(c.getCandidatID() == id){
                return c;
            }
        }
        return null;
    }

    public ArrayList<Candidat> getTotiCandidatii(){
        return candidati;
    }

    public ArrayList<Candidat> getCandidatiDinOrasul(String oras){
        ArrayList <Candidat> candidatiOras = new ArrayList<>();

        candidati.forEach(entity -> {if(entity.getOras().equals(oras)){candidatiOras.add(entity);}});

        return candidatiOras;
    }

    


}
