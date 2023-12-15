package ar.edu.uba.fi;

public class Hoja implements Elemento {
    private double costoImpresionUnitario;

    public Hoja(double costoImpresionUnitario) {

        this.costoImpresionUnitario = costoImpresionUnitario;
    }

    @Override
    public double costoImpresion(int copias) {
        return copias * costoImpresionUnitario;
    }
}
