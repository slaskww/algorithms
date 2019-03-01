package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
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

        // Jaka struktura danych jest najlepsza dla mojego problemu?
        // struktura danych ktora bedzie dobra do przechowania imion
        List<String> imiona = new ArrayList<>();

        try {

            // od 0 do 4 mamy 5 wartości
            // 0 1 2 3 4
            // dopóki i jest mniejsze od 5
            System.out.println("Podaj 5 imion");

            for (int i = 0; i < 5; i++) {
                // scanner zwraca kolejny wpisany tekst
                // od razu dodajemy go do listy
                imiona.add(scanner.next());

                /*
                String s = scanner.next();
                imiona.add(s);
                */
            }

        } finally {
            scanner.close();
        }

        CALC_TIME.start();

        for(String name: imiona){
            System.out.println(name);

//            podpowiedz
            char[] znaki = name.toCharArray();
        }

//        System.out.println(imiona);



        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
