package Herencia;

public class Bus extends Vehiculo {
    public Bus(String unaPatenteStr) {
        super(unaPatenteStr);
    }

    @Override
    public double alquilar(int unosDias) {
        return 1500 * unosDias + 500;
    }
}
