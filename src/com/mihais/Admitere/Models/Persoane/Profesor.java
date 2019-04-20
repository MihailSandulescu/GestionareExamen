package com.mihais.Admitere.Models.Persoane;

import com.mihais.Admitere.Models.Materie;

public class Profesor extends Persoana {

    private Materie materiePredata;

    public Profesor(){ super(); }

    public Profesor(String nume, int varsta, String CNP, String email, String materie){
        super(nume, varsta, CNP, email);
        this.materiePredata = new Materie(materie);
    }

    public String getMateriePredata() {
        return materiePredata.getNume();
    }

    public void setMateriePredata(String materie) {
        this.materiePredata.setNume(materie);
    }
}
