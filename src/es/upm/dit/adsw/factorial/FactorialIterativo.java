package es.upm.dit.adsw.factorial;

/**
 * Cálculo del factorial mediante un método iterativo
 *
 * Created by jpuente on 14/12/16.
 */
public class FactorialIterativo implements Factorial {

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
