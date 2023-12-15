public class Comun extends Tren {

    public Comun() {
        super("Tren común", "Segunda");
    }

    @Override
    public double calcularPrecio() {
        return 20;
    }
}