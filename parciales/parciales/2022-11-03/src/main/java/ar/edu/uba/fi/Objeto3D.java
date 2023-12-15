package ar.edu.uba.fi;

public class Objeto3D implements Elemento {
    private double costoPorPoligono;
    private int numeroDePoligonos;
    private double volumenImpreso;

    public Objeto3D(double costoPorPoligono, int numeroDePoligonos, double volumenImpreso) {

        this.costoPorPoligono = costoPorPoligono;
        this.numeroDePoligonos = numeroDePoligonos;
        this.volumenImpreso = volumenImpreso;
    }

    @Override
    public double costoImpresion(int copias) {

        return copias * (numeroDePoligonos * costoPorPoligono);
    }

    public double multiplicarVolumenPor(double costoPorVolumen) {

        return costoPorVolumen * volumenImpreso;
    }
}
