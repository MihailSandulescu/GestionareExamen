package com.mihais.Admitere.Models;

public class Nota implements Comparable<Nota>{

    private double value;

    public Nota(){}

    public Nota(int value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nota)) return false;
        Nota nota = (Nota) o;
        return this.value == nota.getValue();
    }

    @Override
    public int hashCode() {
        int cod = 17;
        cod *= 31 + Double.hashCode(this.value);
        return cod;
    }

    @Override
    public int compareTo(Nota nota){
        return Double.compare(this.value, nota.value);
    }
}
