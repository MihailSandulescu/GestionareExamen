package com.mihais.Admitere.Comparators;

import com.mihais.Admitere.Models.Facultate;
import java.util.Comparator;

public class FacultateInscrieriComparator implements Comparator<Facultate> {

    @Override
    public int compare(Facultate a, Facultate b){
        return a.getNumarCandidatiInscrisi()  - b.getNumarCandidatiInscrisi();
    }
}
