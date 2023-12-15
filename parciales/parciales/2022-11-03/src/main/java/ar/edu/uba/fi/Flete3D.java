package ar.edu.uba.fi;

public class Flete3D implements Despacho {
    private double costoPorKm;
    private double costoPorVolumen;
    private Objeto3D objeto;

    public Flete3D(double costoPorKm, double costoPorVolumen, Objeto3D objeto) {

        this.costoPorKm = costoPorKm;
        this.costoPorVolumen = costoPorVolumen;
        this.objeto = objeto;
    }

    @Override
    public double costo(double distancia) {
        return distancia * costoPorKm + objeto.multiplicarVolumenPor(costoPorVolumen);
    }
}
