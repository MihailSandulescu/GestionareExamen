package com.mihais.Admitere.Models;

public class Facultate {

    private int numarTotalLocuri;
    private int numarLocuriBuget;
    private int numarCandidatiInscrisi;
    private String nume;
    private String oras;

    public Facultate(){}

    public Facultate(int numarTotalLocuri, int numarLocuriBuget, int numarCandidatiInscrisi, String nume, String oras) {
        this.numarTotalLocuri = numarTotalLocuri;
        this.numarLocuriBuget = numarLocuriBuget;
        this.numarCandidatiInscrisi = numarCandidatiInscrisi;
        this.nume = nume;
        this.oras = oras;
    }

    public int getNumarTotalLocuri() {
        return numarTotalLocuri;
    }

    public void setNumarTotalLocuri(int numarTotalLocuri) {
        this.numarTotalLocuri = numarTotalLocuri;
    }

    public int getNumarLocuriBuget() {
        return numarLocuriBuget;
    }

    public void setNumarLocuriBuget(int numarLocuriBuget) {
        this.numarLocuriBuget = numarLocuriBuget;
    }

    public int getNumarCandidatiInscrisi() {
        return numarCandidatiInscrisi;
    }

    public void setNumarCandidatiInscrisi(int numarCandidatiInscrisi) {
        this.numarCandidatiInscrisi = numarCandidatiInscrisi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }
}
