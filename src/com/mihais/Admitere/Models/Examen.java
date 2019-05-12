package com.mihais.Admitere.Models;

import com.mihais.Admitere.Models.Persoane.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Examen {

    private Profesor profSupraveghetor;
    private Materie disciplina;
    private String ora;
    private String data;
    private String durata;

    public Examen(){}

    public Examen(Profesor profSupraveghetor, Materie disciplina, String ora, String data, String durata){
        this.profSupraveghetor = profSupraveghetor;
        this.disciplina = disciplina;
        this.ora = ora;
        this.data = data;
        this.durata = durata;
    }

    public Profesor getProfSupraveghetor() {
        return profSupraveghetor;
    }

    public void setProfSupraveghetor(Profesor profSupraveghetor) {
        this.profSupraveghetor = profSupraveghetor;
    }

    public Materie getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Materie disciplina) {
        this.disciplina = disciplina;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Examen)) return false;
        Examen examen = (Examen) o;
        return profSupraveghetor.getCNP().equals(examen.getProfSupraveghetor().getCNP()) &&
                disciplina.getNume().equals(examen.getDisciplina().getNume());
    }

    @Override
    public int hashCode() {
        int rezultat = 17;
        rezultat *= 31 + profSupraveghetor.getCNP().hashCode();
        rezultat *= 31 + disciplina.getNume().hashCode();
        return rezultat;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "disciplina=" + disciplina.getNume() +
                ", data=" + data +
                '}';
    }
}
