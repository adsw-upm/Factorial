package es.upm.dit.adsw.factorial;

/**
 * Cálculo del factorial mediante un método iterativo
 * <p>
 * Created by jpuente on 14/12/16.
 */
public class FactorialIterativo implements Factorial {

    /**
     * Calcular factorial de un número entero
     *
     * @param n entero positivo
     * @return n!
     * @throws IllegalArgumentException si n es negativo
     */
    public long f(int n) {
        if (n < 0)
            throw new IllegalArgumentException();

        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
