package com.mihais.Admitere.Models.Persoane;

import java.util.Objects;

public class Candidat extends Persoana {

    private int candidatID;
    private String oras;

    public Candidat(){ super(); }

    public Candidat(String nume, int varsta, String CNP, String email, int id, String oras){
        super(nume, varsta, CNP, email);
        this.candidatID = id;
        this.oras = oras;
    }

    public int getCandidatID() {
        return candidatID;
    }

    public void setCandidatID(int candidatID) {
        this.candidatID = candidatID;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidat)) return false;
        if (!super.equals(o)) return false;
        Candidat candidat = (Candidat) o;
        return this.candidatID == candidat.getCandidatID() &&
                this.CNP == candidat.getCNP();
    }

    @Override
    public int hashCode() {
        int rezultat = 17;
        rezultat *= 31 + candidatID;
        rezultat *= 31 + this.oras.hashCode();
        return rezultat;
    }
}
