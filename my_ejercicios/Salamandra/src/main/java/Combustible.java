public abstract class Combustible {

    private double precio;
    private int peso;

    public Combustible(double precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKilos() {
        return peso;
    }

    public abstract int getContaminacion();

}