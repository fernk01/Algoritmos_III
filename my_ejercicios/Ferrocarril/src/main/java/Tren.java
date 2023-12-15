public abstract class Tren {

    protected String tipo;
    protected String categoria;

    public Tren(String tipo, String categoria) {
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public abstract double calcularPrecio();
}
