package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który oblicza sumę pojawiających się na wejściu liczb.
 * Wejście:
 * Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość
 * małych liczb całkowitych (z zakresu -100..100). Poszczególne liczby zostaną,
 * rozdzielone znakiem nowej linii.
 * Wyjście:
 * Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja
 * jest równa sumie i-pierwszych wczytanych z wejścia liczb.
 * Poszczególne liczby należy rozdzielić znakami nowej linii.
 * <p>
 * Sign EOF => use CTRL + D
 */
public class Exercise4 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO
        // Pobierze od uzytkownika informacje ile przykladow chce sprawdzic
        // Pobierz liczby

        CALC_TIME.start();

        // Rozwiazanie

        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
