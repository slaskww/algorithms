package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List<String> listOfNames = new ArrayList<>();
        try {

            /**
             * TODO
             * Tutaj umieść kod odpowiedzialny za pobieranie imion
             */
            listOfNames = setNames();
            System.out.println("w try");

        } finally {
            scanner.close();
        }

        CALC_TIME.start();

        /**
         * TODO
         * Tutaj umieść kod odpowiedzialny za wyświetlenie imion
         */

        for (String s : listOfNames) {
            System.out.println(s);

        }
        CALC_TIME.stop();
        CALC_TIME.display();
    }


    public static List<String> setNames() {
        Scanner input = new Scanner(System.in);

        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextLine();
        }
        return new ArrayList<>(Arrays.asList(array));

     /*
        List<String> names = new ArrayList<>(5);
        int i = 1;
        for (String s : names) { //It won't work. ArrayList 'names' is empty
           System.out.println("Podaj imie " + i);
           String st = input.nextLine();
           s.concat(st);
           i++;
        }*/
        //return names;
    }

}
