package es.upm.dit.adsw.factorial;

/**
 * Interfaz genérica para realizar distintas versiones del cálculo del factorial
 *
 * Created by jpuente on 14/12/16.
 */
public interface Factorial {

    /**
     * Calcular factorial de un número entero
     *
     * @param n entero positivo
     * @return n!
     * @throws IllegalArgumentException si n es negativo
     */
    public long f(int n);

}
