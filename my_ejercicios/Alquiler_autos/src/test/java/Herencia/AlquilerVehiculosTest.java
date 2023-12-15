package Herencia;

import org.junit.Assert;
import org.junit.Test;


public class AlquilerVehiculosTest
{
    @Test
    public void testRegistroCherryQQElCostoDeAlquilerPor1DiaEs900() {
        Agencia a = new Agencia();

        a.registrar( new Auto("abc-123", 4, new PlazaBasica() ));
        double valor = a.alquilarDias("abc-123", 1);

        Assert.assertEquals(900, valor, 0.01);
    }

}
