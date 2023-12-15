package Herencia;

import java.lang.String;

public abstract class Vehiculo {
    private final String unaPatenteStr;

    public Vehiculo(String unaPatenteStr) {
        this.unaPatenteStr = unaPatenteStr;
    }

    boolean sos(String unaPatenteStr) {
        return unaPatenteStr.equals(this.unaPatenteStr);
    }

    abstract double alquilar(int unosDias);

    public boolean sos(Vehiculo vehiculo) {
        return this.unaPatenteStr.equals(vehiculo.unaPatenteStr);
    }
}