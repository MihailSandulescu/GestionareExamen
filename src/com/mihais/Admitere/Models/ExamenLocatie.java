package com.mihais.Admitere.Models;

import com.mihais.Admitere.Models.Locatie.Location;

public class ExamenLocatie {

    private Examen examen;
    private Location locatie;


    public ExamenLocatie(Examen examen, Location locatie){
        this.examen = examen;
        this.locatie = locatie;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Location getLocatie() {
        return locatie;
    }

    public void setLocatie(Location locatie) {
        this.locatie = locatie;
    }
}
