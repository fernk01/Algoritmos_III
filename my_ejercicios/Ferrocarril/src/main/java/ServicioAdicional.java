public abstract class ServicioAdicional {

    protected String nombre;
    protected double precio;

    public ServicioAdicional(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract boolean esCompatibleCon(Tren tren);
}