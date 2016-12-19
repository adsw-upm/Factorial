package es.upm.dit.adsw.factorial;

import java.util.Random;

/**
 * Medidas de tiempos para distintas implementaciones
 *
 * Created by jpuente on 19/12/16.
 */
public class Medidor {

    private static final Random RANDOM = new Random();
    private static final Factorial FI = new FactorialIterativo();
    private static final Factorial FR = new FactorialRecursivo();

    /**
     * Main
     *
     * @param args args[0] : Número de veces que se ejecuta la función
     */
    public static void main(String[] args) {

        int veces = Integer.parseInt(args[0]);

        long t0 = System.nanoTime();
        for (int repeat = 0; repeat < veces; repeat++) {
            int n = RANDOM.nextInt(1000);
            long fi = FI.factorial(n);
        }
        long t1 = System.nanoTime();

        System.out.println("Factorial iterativo: " + (t1 - t0));

        t0 = System.nanoTime();
        for (int repeat = 0; repeat < veces; repeat++) {
            int n = RANDOM.nextInt(1000);
            long fi = FR.factorial(n);
        }
        t1 = System.nanoTime();

        System.out.println("Factorial recursivo: " + (t1 - t0));

    }


}
