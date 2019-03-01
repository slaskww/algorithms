package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który wyliczy n-ty wyraz ciągu Fibonacciego.
 * Wejście:
 * W pierwszej linii wejścia znajduje się jedna liczba całkowita D (1≤D≤30),
 * oznaczająca liczbę przypadków do rozważenia. Opis każdego przypadku składa się z jednej linii,
 * w której znajduje się jedna nieujemna liczba całkowita n (0  ≤  n ≤ 15).
 * Wyjście:
 * Dla każdego przypadku z wejścia Twój program powinien wypisać w osobnej linii wyraz ciągu.
 */
public class Exercise11 {

    private static CalcTime CALC_TIME = new CalcTime();

    private static HashMap<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {

        List<Long> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ile liczb chcesz sprawdzić?");
            int value = scanner.nextInt();
            System.out.println("Podaj " + value + " liczby");
            while (value > 0) {
                numbers.add(scanner.nextLong());
                value--;
            }
        }

        CALC_TIME.start();

        System.out.println("Wyniki:");

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static long fibonacci(long value) {
        return 0;
    }
}
