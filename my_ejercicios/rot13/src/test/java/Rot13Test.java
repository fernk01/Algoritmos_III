import org.junit.Test;

import static org.junit.Assert.*;

public class Rot13Test {
    @Test
    public void testRot13() {
        // arrange
        char cadena = 'a';
        char esperada = 'n';

        // act
        char resultado = Rot13.cifrar(cadena);

        // assert
        assertEquals(esperada, resultado);
    }
}