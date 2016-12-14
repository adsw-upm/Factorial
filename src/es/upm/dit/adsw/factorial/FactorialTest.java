package es.upm.dit.adsw.factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias de Factorial
 * <p>
 * Created by jpuente on 14/12/16.
 */
public class FactorialTest {

    private Factorial F;

    @Before
    public void setUp() throws Exception {
        //F = new FactorialRecursivo();
        F = new FactorialIterativo();
    }

    /**
     * Caso límite
     */
    @Test
    public void test00() {
        assertEquals(1, F.f(0));
    }

    /**
     * Caso límite
     */
    @Test
    public void test01() {
        assertEquals(1, F.f(1));
    }

    /**
     * Caso normal
     */
    @Test
    public void test05() {
        assertEquals(120, F.f(5));
    }

    /**
     * Argumentos incorrectos
     */
    @Test(expected = IllegalArgumentException.class)
    public void test11() {
        F.f(-1);
        fail("Debería haber saltado una excepción - no se puede calcular el factorial de un número negativo");
    }
}