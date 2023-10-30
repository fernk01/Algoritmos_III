import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Date;

public class PiscinaTest {
    @Test
    public void testPiscina() {
        Piscina piscina = new Piscina();
        Propietario propietario = new Propietario();

        piscina.puedeUsar(propietario, 5, new Date());

    }

}