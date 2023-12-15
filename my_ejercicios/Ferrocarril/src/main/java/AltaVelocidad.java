public class AltaVelocidad extends Tren {

    public AltaVelocidad() {
        super("Tren de alta velocidad", "Primera");
    }

    @Override
    public double calcularPrecio() {
        return 100;
    }
}