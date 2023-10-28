import java.util.List;

public class ServicioAdicional {
    private String nombre;
    private double precio;
    private List<Tramo> tramosPermitidos;

    public ServicioAdicional(String nombre, double precio, List<Tramo> tramosPermitidos) {
        this.nombre = nombre;
        this.precio = precio;
        this.tramosPermitidos = tramosPermitidos;
    }

    public boolean esValido(Tramo tramo) {
        if (!tramosPermitidos.contains(tramo)) {
            return false;
        }

        if (nombre.equals("cucheta coche dormitorio") && tramo.getTipoTren() != TipoTren.NOCTURNO) {
            return false;
        }

        if (nombre.equals("cucheta en compartimiento privado") && tramo.getTipoTren() != TipoTren.NOCTURNO) {
            return false;
        }

        if (nombre.equals("cena a bordo") && tramo.getTipoTren() == TipoTren.ALTA_VELOCIDAD) {
            return false;
        }

        return true;
    }

    public double getPrecio() {
        return precio;
    }
}
