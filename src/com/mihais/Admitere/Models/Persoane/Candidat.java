package com.mihais.Admitere.Models.Persoane;

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
}
