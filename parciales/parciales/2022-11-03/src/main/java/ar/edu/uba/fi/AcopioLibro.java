package ar.edu.uba.fi;

public class AcopioLibro implements Despacho {
    private double costoPorPagina;
    private Libro libro;

    public AcopioLibro(double costoPorPagina, Libro libro) {
        this.costoPorPagina = costoPorPagina;
        this.libro = libro;
    }

    @Override
    public double costo(double distancia) {
        return libro.cantidadHojasPor(costoPorPagina);
    }
}
