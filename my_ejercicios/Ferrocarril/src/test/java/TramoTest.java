import org.junit.Test;

import static org.junit.Assert.*;

public class TramoTest {

    @Test
    public void calcularPrecio() {
        // Crear un tramo
        Tramo tramo = new Tramo("Ciudad A", "Ciudad B", TipoTren.ALTA_VELOCIDAD, CategoriaPasaje.PRIMERA, 100.0);

        // Calcular el precio del tramo
        double precioTramo = tramo.calcularPrecio();

        assertEquals(225.0, precioTramo, 0.0);
    }

    @Test
    public void calcularPrecio2() {

    }
}