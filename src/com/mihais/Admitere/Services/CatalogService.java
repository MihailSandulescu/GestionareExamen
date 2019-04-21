package com.mihais.Admitere.Services;

import com.mihais.Admitere.Models.Catalog;
import com.mihais.Admitere.Models.Examen;
import com.mihais.Admitere.Models.Nota;
import com.mihais.Admitere.Models.Persoane.Candidat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CatalogService {

    private HashSet<Catalog> catalog = new HashSet<>();

    private static CatalogService instance = new CatalogService();

    public static CatalogService getInstance(){
        return instance;
    }

    private CatalogService(){}

    public void addEntry(Catalog c){
        catalog.add(c);
    }

    public void removeEntry(Catalog c){
        catalog.remove(c);
    }

    public void addOnlyCandidat(Candidat c) {

        boolean verify = false;

        for (Catalog x : catalog){
            if(x.equals(new Catalog(c, null))){
                verify = true;
                break;
            }
        }

        if(verify){
            catalog.add(new Catalog(c, null));
        }
    }

    public void addNota(Candidat c, Examen e, Nota n){

        for(Catalog x : catalog){
            if(x.getCandidat().equals(c)){
                x.getRezultate().put(e, n);
                break;
            }
        }
    }

    public void addToateNotele(Candidat c, HashMap <Examen, Nota> m){

        for(Catalog x : catalog){
            if(x.getCandidat().equals(c)){
                x.setRezultate(m);
                break;
            }
        }
    }

    public void updateNota(Candidat c, Examen e, Nota newNota){

        for(Catalog x : catalog){
            if(x.getCandidat().equals(c)){
                x.getRezultate().put(e, newNota);
                break;
            }
        }
    }

    public void removeNota(Candidat c, Examen e){

        for(Catalog x : catalog){
            if(x.getCandidat().equals(c)){
                x.getRezultate().remove(e);
                break;
            }
        }
    }

    public void removeNotaForAll(Examen e){
        catalog.forEach(x -> {x.getRezultate().remove(e);});
    }

    public void removeCandidat(Candidat cdt){

        for(Catalog c : catalog){
            if(c.getCandidat().equals(cdt)){
                catalog.remove(c);
                break;
            }
        }

    }
    
}
