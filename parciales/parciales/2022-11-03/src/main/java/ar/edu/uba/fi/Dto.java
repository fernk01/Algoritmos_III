package ar.edu.uba.fi;

public class Dto {
    public double calcular(double valorAModificar, int cantiadHojas) {
        if (cantiadHojas > 100) {
            return 0.9 * valorAModificar;
        }

        if (cantiadHojas > 200) {
            return .85 * valorAModificar;
        }

        return valorAModificar;
    }
}
