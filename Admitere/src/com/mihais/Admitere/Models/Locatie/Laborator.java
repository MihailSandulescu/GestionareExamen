package com.mihais.Admitere.Models.Locatie;

public class Laborator extends Location {

    private int numarCalculatoare;

    public Laborator() {}

    public Laborator(int id, int etaj, int numarLocuri, int numarCalculatoare) {
        super(id, etaj, numarLocuri);
        this.numarCalculatoare = numarCalculatoare;
    }

    public int getNumarCalculatoare() {
        return numarCalculatoare;
    }

    public void setNumarCalculatoare(int numarCalculatoare) {
        this.numarCalculatoare = numarCalculatoare;
    }
}