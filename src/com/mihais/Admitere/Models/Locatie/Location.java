package com.mihais.Admitere.Models.Locatie;

import java.util.Objects;

public class Location {

    protected int id;
    protected int etaj;
    protected int numarLocuri;

    public Location() {
    }

    public Location(int id, int etaj, int numarLocuri) {
        this.id = id;
        this.etaj = etaj;
        this.numarLocuri = numarLocuri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        return "Sala " +
                etaj +
                id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        int cod = 17;
        cod *= 31 + Integer.hashCode(this.id);
        return cod;
    }
}
