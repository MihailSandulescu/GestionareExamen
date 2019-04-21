package com.mihais.Admitere.Services;

import com.mihais.Admitere.Comparators.CandidatCNPComparator;
import com.mihais.Admitere.Models.Persoane.Candidat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public void removeCandidat(Candidat cnd){ candidati.remove(cnd);}

    public Candidat getCandidatByCNP(String CNP){
        for( Candidat c : candidati){
            if(c.getCNP().equals(CNP)){
                return c;
            }
        }
        return null;
    }

    public Candidat getCandidatById(int id){
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

    public List<Candidat> getCandidatiSortedByCNP() {
        ArrayList<Candidat> candidatiSortati = (ArrayList<Candidat>) this.candidati.clone();
        candidatiSortati.sort(new CandidatCNPComparator());
        return candidatiSortati;
    }
}
