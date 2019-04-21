package com.mihais.Admitere.Models;

import com.mihais.Admitere.Models.Persoane.Candidat;
import java.util.HashMap;
import java.util.Objects;

public class Catalog {

    private Candidat candidat;
    private HashMap<Examen , Nota> rezultate;

    public Catalog(){}

    public Catalog(Candidat c, HashMap<Examen , Nota> r){
        this.candidat = c;
        this.rezultate = r;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public HashMap<Examen, Nota> getRezultate() {
        return rezultate;
    }

    public void setRezultate(HashMap<Examen, Nota> rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog)) return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(getCandidat(), catalog.getCandidat());
    }

    @Override
    public int hashCode() {
        int rezultat = 17;
        rezultat *= 31 + this.candidat.hashCode();
        return rezultat;
    }

}
