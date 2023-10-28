import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Crear un tramo
        Tramo tramo = new Tramo("Ciudad A", "Ciudad B", TipoTren.ALTA_VELOCIDAD, CategoriaPasaje.PRIMERA, 100.0);

        // Calcular el precio del tramo
        double precioTramo = tramo.calcularPrecio();
        System.out.println("Precio del tramo: " + precioTramo);

        // Crear un servicio adicional
        List<Tramo> tramosPermitidos = new ArrayList<>();
        tramosPermitidos.add(tramo);
        ServicioAdicional servicioAdicional = new ServicioAdicional("Cena a bordo", 20.0, tramosPermitidos);

        // Verificar si el servicio adicional es válido para el tramo
        boolean esValido = servicioAdicional.esValido(tramo);
        System.out.println("¿Es válido el servicio adicional? " + esValido);

        // Crear un pasaje
        Pasaje pasaje = new Pasaje(tramo, 2);
        pasaje.agregarServicioAdicional(servicioAdicional);

        // Calcular el precio del pasaje
        double precioPasaje = pasaje.calcularPrecio();
        System.out.println("Precio del pasaje: " + precioPasaje);

        // Crear un viaje promocional
        List<Pasaje> pasajes = new ArrayList<>();
        pasajes.add(pasaje);
        ViajePromocional viajePromocional = new ViajePromocional(pasajes, 0.8, Vigencia.PERMANENTE);

        // Calcular el precio del viaje promocional
        double precioViajePromocional = viajePromocional.calcularPrecio();
        System.out.println("Precio del viaje promocional: " + precioViajePromocional);

    }
}
