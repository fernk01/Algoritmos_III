public class Tramo {
    private String ciudadOrigen;
    private String ciudadDestino;
    private TipoTren tipoTren;
    private CategoriaPasaje categoriaPasaje;
    private double precio;

    public Tramo(String ciudadOrigen, String ciudadDestino, TipoTren tipoTren, CategoriaPasaje categoriaPasaje, double precio) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.tipoTren = tipoTren;
        this.categoriaPasaje = categoriaPasaje;
        this.precio = precio;
    }

    public double calcularPrecio() {
        double precioFinal = precio;

        if (tipoTren == TipoTren.ALTA_VELOCIDAD) {
            precioFinal *= 1.5;
        } else if (tipoTren == TipoTren.NOCTURNO) {
            precioFinal *= 1.2;
        } else if (categoriaPasaje == CategoriaPasaje.PRIMERA) {
            precioFinal *= 1.5;
        }

        return precioFinal;
    }

    public TipoTren getTipoTren() {
        return tipoTren;
    }
}

