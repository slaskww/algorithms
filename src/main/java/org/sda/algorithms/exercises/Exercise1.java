package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * mark
 * <p>
 * Exercise:
 * W pętli pobierz od użytkownika 5 imion. Wykorzystaj do tego listę.
 * Następnie wyświetl w konsoli zapisane imiona na liście.
 */
public class Exercise1 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            /**
             * TODO
             * Tutaj umieść kod odpowiedzialny za pobieranie imion
             */
        }
        finally {
            scanner.close();
        }

        CALC_TIME.start();

        /**
         * TODO
         * Tutaj umieść kod odpowiedzialny za wyświetlenie imion
         */

        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
