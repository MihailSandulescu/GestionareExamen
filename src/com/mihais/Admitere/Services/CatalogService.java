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

    public void addOnlyExamen(Examen e) {

        boolean verify = false;

        for (Catalog x : catalog){
            if(x.equals(new Catalog(e, null))){
                verify = true;
                break;
            }
        }

        if(!verify){
            catalog.add(new Catalog(e, null));
        }
    }

    public void addNota(Examen e, Candidat c, Nota n){

        for(Catalog x : catalog){
            if(x.getExamen().equals(e)){
                x.getRezultate().put(c, n);
                break;
            }
        }
    }

    public void addToateNotele(Examen e, HashMap <Candidat, Nota> m){

        for(Catalog x : catalog){
            if(x.getExamen().equals(e)){
                x.setRezultate(m);
                break;
            }
        }
    }

    public void updateNota(Examen e, Candidat c, Nota newNota){

        for(Catalog x : catalog){
            if(x.getExamen().equals(e)){
                x.getRezultate().put(c, newNota);
                break;
            }
        }
    }

    public void removeNota(Examen e, Candidat c){

        for(Catalog x : catalog){
            if(x.getExamen().equals(e)){
                x.getRezultate().remove(c);
                break;
            }
        }
    }

    public void removeNotaForAll(Examen e){
        catalog.forEach(x -> {if(x.getExamen().equals(e)){ catalog.remove(x); }});
    }

    public void removeCandidat(Candidat cdt){

        for(Catalog c : catalog){
            if(c.getRezultate().containsKey(cdt)){
                c.getRezultate().remove(cdt);
            }
        }
    }
    
}
