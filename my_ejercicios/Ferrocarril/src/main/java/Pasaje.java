import java.util.ArrayList;
import java.util.List;

public class Pasaje {
    private Tramo tramo;
    private List<ServicioAdicional> serviciosAdicionales;
    private int cantidadPasajeros;

    public Pasaje(Tramo tramo, int cantidadPasajeros) {
        this.tramo = tramo;
        this.serviciosAdicionales = new ArrayList<>();
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void agregarServicioAdicional(ServicioAdicional servicioAdicional) {
        if (servicioAdicional.esValido(tramo)) {
            serviciosAdicionales.add(servicioAdicional);
        }
    }

    public double calcularPrecio() {
        double precioFinal = tramo.calcularPrecio();

        for (ServicioAdicional servicioAdicional : serviciosAdicionales) {
            precioFinal += servicioAdicional.getPrecio();
        }

        precioFinal *= cantidadPasajeros;

        return precioFinal;
    }
}
