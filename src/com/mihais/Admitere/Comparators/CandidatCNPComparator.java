package com.mihais.Admitere.Comparators;

import com.mihais.Admitere.Models.Persoane.Candidat;

import java.util.Comparator;

public class CandidatCNPComparator implements Comparator<Candidat>{

    @Override
    public int compare(Candidat a , Candidat b){
        return a.getCNP().compareTo(b.getCNP());
    }
}
