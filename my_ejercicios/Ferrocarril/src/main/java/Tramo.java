public class Tramo {

    protected String origen;
    protected String destino;
    protected Tren tren;

    public Tramo(String origen, String destino, Tren tren) {
        this.origen = origen;
        this.destino = destino;
        this.tren = tren;
    }

    public double calcularPrecio() {
        return tren.calcularPrecio();
    }
}