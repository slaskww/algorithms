package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który zakoduje podany ciąg znaków przy pomocy szyfru Cezara.
 * Wejście:
 * Na wejściu pojawi się tekst.
 * Wyjście:
 * Na wyjściu otrzymujemy zaszyfrowany tekst używając Szyfru Cezara tylko
 * dla liter (małych oraz wielkich). Znaki spoza alfabetu powinny
 * pozostać bez zmian.
 */
public class Exercise8 {

    private static final CalcTime CALC_TIME = new CalcTime();

    private static final int CESAR_STEP = -30; //if (CESAR_STEP < 0) CESAR_STEP += 26, if (CESAR_STEP < -26) CESAR_STEP+= 2*26

    public static void main(String[] args) {

        CesarCrypt cesarCrypt = new CesarCrypt();

        String text;
        System.out.println(CesarCrypt.ALPHABET_SIZE);
      //  System.out.println("Podaj tekst do zakodowania");
          System.out.println("Podaj tekst do odkodowania");

        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
        }


        CALC_TIME.start();

        String encoded = cesarCrypt.encodeCesar(text, CESAR_STEP);
        System.out.println(encoded);

       // String decoded = cesarCrypt.decodeCesar(encoded, CESAR_STEP);
       // System.out.println(decoded);

        String decoded = cesarCrypt.decodeCesar(text, CESAR_STEP);
        System.out.println(decoded);

        System.out.println((char) 176);

        CALC_TIME.stop();
        CALC_TIME.display();
    }


}
