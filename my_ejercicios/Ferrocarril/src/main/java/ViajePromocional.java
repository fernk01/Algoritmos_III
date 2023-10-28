import java.util.List;

public class ViajePromocional {
    private List<Pasaje> pasajes;
    private double precioPromocional;
    private Vigencia vigencia;

    public ViajePromocional(List<Pasaje> pasajes, double precioPromocional, Vigencia vigencia) {
        this.pasajes = pasajes;
        this.precioPromocional = precioPromocional;
        this.vigencia = vigencia;
    }

    public double calcularPrecio() {
        double precioFinal = 0;

        for (Pasaje pasaje : pasajes) {
            precioFinal += pasaje.calcularPrecio();
        }

        precioFinal *= precioPromocional;

        return precioFinal;
    }
}