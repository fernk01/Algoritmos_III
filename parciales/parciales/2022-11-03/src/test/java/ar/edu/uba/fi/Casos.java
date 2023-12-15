package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Casos {

    @Test
    public void Caso1() {
        Flete f = new Flete(5.0);
        Hoja h = new Hoja(0.1);
        Trabajo t = new Trabajo(h, f);

        assertEquals(5.0 * 15 + 0.1 * 45, t.costoImpresionEnvio(45, 15));
    }

    @Test
    public void Caso2() {
        Hoja h = new Hoja(.1);
        Libro l = new Libro(155, h);
        AcopioLibro a = new AcopioLibro(5.0, l);
        Trabajo t = new Trabajo(l, a);

        assertEquals(
                5.0 * 155 /* costo de acopio por página */ +
                        (0.9 * (0.1 * 155 + 50)) /* costo de impresión */,
                t.costoSinEnvio(1));
    }

    @Test
    public void Caso3() {
        Objeto3D o = new Objeto3D(0.1, 8000, 50);
        Flete3D f = new Flete3D(7, 4, o);
        Trabajo t = new Trabajo(o, f);

        assertEquals(
                ((7.0 * 90) + (4 * 50)) /* costo de acopio por página */ +
                        (0.1 * 8000) /* costo de impresión */,
                t.costoImpresionEnvio(1, 90));
    }
}
