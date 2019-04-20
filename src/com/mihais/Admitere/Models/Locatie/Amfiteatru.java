package com.mihais.Admitere.Models.Locatie;

public class Amfiteatru extends Location {

    private String nume;

    public Amfiteatru() {}

    public Amfiteatru(int id, int etaj, int numarLocuri, String nume) {
        super(id, etaj, numarLocuri);
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
