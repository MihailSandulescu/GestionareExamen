package com.mihais.Admitere.Models;

import com.mihais.Admitere.Models.Persoane.Candidat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.lang.StringBuffer;

public class Catalog {

    private Examen examen;
    private HashMap<Candidat , Nota> rezultate;

    public Catalog(){}

    public Catalog(Examen e, HashMap<Candidat , Nota> r){
        this.examen = e;
        this.rezultate = r;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen exam) {
        this.examen = exam;
    }

    public HashMap<Candidat, Nota> getRezultate() {
        return rezultate;
    }

    public void setRezultate(HashMap<Candidat, Nota> rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog)) return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(getExamen(), catalog.getExamen());
    }

    @Override
    public int hashCode() {
        int rezultat = 17;
        rezultat *= 31 + this.examen.hashCode();
        return rezultat;
    }

    @Override
    public String toString() {
        StringBuffer str =  new StringBuffer();
        str.append("Examen: " + examen.getDisciplina().getNume() + "\n| ");
        Iterator<Candidat> it = rezultate.keySet().iterator();
        while(it.hasNext()){
            Candidat key = it.next();
            Nota value = rezultate.get(key);
            str.append(key.getNume() + " , " + value.getValue() + " | ");
        }
        return str.toString();

    }
}
