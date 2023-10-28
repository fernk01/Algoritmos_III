import org.junit.Test;

import static org.junit.Assert.*;

public class ItinerarioTest {
    @Test
    public void test01UnItinerarioConUnTramoDeColectivoDeberiaCostarElPrecioFijoDelColectivo() {
        Colectivo colectivo = new Colectivo(5);
        Tramo tramo = new Tramo("A", "B", colectivo);
        Itinerario itinerario = new Itinerario();
        itinerario.agregarTramo(tramo);

        assertEquals(5, itinerario.calcularCostoTotal(), 0);
    }

    @Test
    public void test02UnItinerarioConUnTramoDeOmnibusInterurbanoDeberiaCostarElPrecioDelTramo() {
        OmnibusInterurbano omnibus = new OmnibusInterurbano(10);
        Tramo tramo = new Tramo("A", "B", omnibus);
        Itinerario itinerario = new Itinerario();
        itinerario.agregarTramo(tramo);

        assertEquals(10, itinerario.calcularCostoTotal(), 0);
    }

    @Test
    public void test03UnItinerarioConDosTramosDeColectivoDeberiaCostarLaSumaDeLosPreciosFijosDeLosColectivos() {
        Colectivo colectivo1 = new Colectivo(5);
        Colectivo colectivo2 = new Colectivo(10);
        Tramo tramo1 = new Tramo("A", "B", colectivo1);
        Tramo tramo2 = new Tramo("B", "C", colectivo2);
        Itinerario itinerario = new Itinerario();
        itinerario.agregarTramo(tramo1);
        itinerario.agregarTramo(tramo2);

        assertEquals(15, itinerario.calcularCostoTotal(), 0);
    }


}