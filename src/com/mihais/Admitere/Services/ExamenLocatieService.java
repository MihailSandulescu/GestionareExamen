package com.mihais.Admitere.Services;

import com.mihais.Admitere.Models.Examen;
import com.mihais.Admitere.Models.ExamenLocatie;
import com.mihais.Admitere.Models.Locatie.Location;

import java.util.ArrayList;

public class ExamenLocatieService {

    private ArrayList<ExamenLocatie> examLoc = new ArrayList<>();

    private static ExamenLocatieService instance = new ExamenLocatieService();

    public static ExamenLocatieService getInstance(){ return instance; }

    private ExamenLocatieService(){}

    public void addEntry(ExamenLocatie el){
        examLoc.add(el);
    }

    public void removeEntry(ExamenLocatie el){
        examLoc.remove(el);
    }

    public void printExamLocation(Examen e){
        examLoc.forEach(entity -> {if(entity.getExamen().equals(e)){System.out.println(entity.getLocatie().toString());}});
    }

    public void printExamsInLocation(Location l){
        examLoc.forEach(entity -> {if(entity.getLocatie().equals(l)){System.out.println(entity.getExamen().toString());}});
    }
}
