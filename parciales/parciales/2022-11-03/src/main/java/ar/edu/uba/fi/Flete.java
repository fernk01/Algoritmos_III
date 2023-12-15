package ar.edu.uba.fi;

public class Flete implements Despacho {
    private double costoPorKm;

    public Flete(double costoPorKm) {

        this.costoPorKm = costoPorKm;
    }

    @Override
    public double costo(double distancia) {

        return distancia * costoPorKm;
    }

}
