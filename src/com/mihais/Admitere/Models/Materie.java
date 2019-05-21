package com.mihais.Admitere.Models;

import java.io.Serializable;

public class Materie implements Serializable {

    private String nume;

    public Materie(){}

    public Materie(String nume){
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
