package com.mihais.Admitere.Services;

import com.mihais.Admitere.Comparators.FacultateInscrieriComparator;
import com.mihais.Admitere.Models.Facultate;

import java.util.ArrayList;
import java.util.Collections;

public class FacultateService {

    private ArrayList<Facultate> facultati = new ArrayList<>();

    private static FacultateService instance = new FacultateService();

    public static FacultateService getInstance(){
        return instance;
    }

    private FacultateService(){}

    public void addFacultate(Facultate facultate){
        facultati.add(facultate);
    }

    public void removeFacultate(Facultate fac){ facultati.remove(fac);  }

    public Facultate getFacultateByNume(String nume){
        for( Facultate f : facultati){
            if(f.getNume().equals(nume)){
                return f;
            }
        }
        return null;
    }


    public ArrayList<Facultate> getToateFacultatile(){
        return facultati;
    }

    public ArrayList<Facultate> getFacultatiDinOrasul(String oras){

        ArrayList <Facultate> facultatiOras = new ArrayList<>();

        facultati.forEach(entity -> {if(entity.getOras().equals(oras)){facultatiOras.add(entity);}});

        return facultatiOras;
    }

    public ArrayList<Facultate> getFacultatiSortedByInscrieri() {
        ArrayList<Facultate> facultatiSortate = (ArrayList<Facultate>) this.facultati.clone();
        facultatiSortate.sort(new FacultateInscrieriComparator());
        return facultatiSortate;
    }
}
