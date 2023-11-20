import static org.junit.Assert.*;
import org.junit.Test;

public class SalamandraTest {

        @Test
        public void testCalcularCostoCombustion() throws Exception {
            Salamandra salamandra = new Salamandra();

            Quebracho quebracho = new Quebracho(1);
            Pino pino = new Pino(1);
            ResinaPlastica resina = new ResinaPlastica(1);

            salamandra.agregarCombustible(quebracho);
            salamandra.agregarCombustible(pino);
            salamandra.agregarCombustible(resina);

            assertEquals(1750, salamandra.calcularCosto(), 0.01);

        }

        @Test
        public void testCalcularContaminacion() throws Exception {
            Salamandra salamandra = new Salamandra();

            Quebracho quebracho = new Quebracho(1);
            Pino pino = new Pino(1);
            ResinaPlastica resina = new ResinaPlastica(1);

            salamandra.agregarCombustible(quebracho);
            salamandra.agregarCombustible(pino);
            salamandra.agregarCombustible(resina);

            assertEquals(160, salamandra.calcularContaminacion(), 0.01);

        }
}