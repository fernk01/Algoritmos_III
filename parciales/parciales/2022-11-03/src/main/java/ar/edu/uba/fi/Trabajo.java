package ar.edu.uba.fi;

public class Trabajo {
    private Elemento elemento;
    private Despacho despacho;

    public Trabajo(Elemento elemento, Despacho despacho) {

        this.elemento = elemento;
        this.despacho = despacho;
    }

    public double costoImpresionEnvio(int copias, double distancia) {
        double costoImpresion = elemento.costoImpresion(copias);
        double costoDespacho = despacho.costo(distancia);

        return costoDespacho + costoImpresion;
    }

    public double costoSinEnvio(int copias) {

        return costoImpresionEnvio(copias, 1);
    }
}
