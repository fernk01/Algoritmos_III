public class Nocturno extends Tren {

    public Nocturno() {
        super("Tren nocturno", "Segunda");
    }

    @Override
    public double calcularPrecio() {
        return 50;
    }
}