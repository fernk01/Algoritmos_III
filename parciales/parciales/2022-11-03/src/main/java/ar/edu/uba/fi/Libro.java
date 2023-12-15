package ar.edu.uba.fi;

public class Libro implements Elemento {
    private final Dto dto;
    private int cantiadHojas;
    private Hoja hoja;
    private double costoEncuadernacion;

    public Libro(int cantiadHojas, Hoja hoja) {

        this.costoEncuadernacion = 50.0;
        this.cantiadHojas = cantiadHojas;
        this.hoja = hoja;

        this.dto = new Dto();
    }

    @Override
    public double costoImpresion(int copias) {

        return dto.calcular(hoja.costoImpresion(cantiadHojas) + costoEncuadernacion,
                cantiadHojas);
    }

    public double cantidadHojasPor(double costoPorPagina) {

        return costoPorPagina * cantiadHojas;
    }
}
