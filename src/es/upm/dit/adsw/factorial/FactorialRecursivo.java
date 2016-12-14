package es.upm.dit.adsw.factorial;

/**
 * Cálculo del factorial mediante un método recursivo
 *
 * Created by jpuente on 14/12/16.
 */
public class FactorialRecursivo implements Factorial {

    public long f(int n) {
        if ( n > 0 ) {
            return n * f(n - 1);
        } else if (n == 0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
