package com.mihais.Admitere.Models.Persoane;

import java.io.Serializable;

public abstract class Persoana implements Serializable {

    protected String nume;
    protected int varsta;
    protected String CNP;
    protected String email;

    public Persoana() {}

    public Persoana(String nume, int varsta, String CNP, String email){
        this.nume = nume;
        this.varsta = varsta;
        this.CNP = CNP;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return this.getCNP().equals(persoana.getCNP());
    }

    @Override
    public int hashCode() {
        //metoda preluata din Effective Java (item 9)
        int cod = 17;
        cod *= 31 + CNP.hashCode();
        return cod;
    }
}
