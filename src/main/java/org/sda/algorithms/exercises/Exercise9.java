package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm rekurencyjny, który wyliczy silnię dla danego n
 * <p>
 * Niech n będzie nieujemną liczbą całkowitą. Liczbę n! definiuje się następująco.
 * Jeśli n ≤ 1, to n! = 1. Dla n > 1, n! jest równe iloczynowi wszystkich liczb od 1 do n,
 * czyli n! = 1 * 2 * ... * n. Na przykład 4! = 1*2*3*4 = 24.
 * Wejście:
 * W pierwszej linii wejścia znajduje się jedna liczba całkowita D (1≤D≤15),
 * oznaczająca liczbę przypadków do rozważenia. Opis każdego przypadku składa się
 * z jednej linii, w której znajduje się jedna nieujemna liczba całkowita n (0  ≤  n ≤ 15).
 * Wyjście:
 * Dla każdego przypadku z wejścia Twój program powinien wypisać w osobnej linii jego n!.
 */
public class Exercise9 {

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Ile liczb chcesz policzyć? ");
        try (Scanner scanner = new Scanner(System.in)) {
            int value = scanner.nextInt();
            for (int i = 0; i < value; i++) {
                numbers.add(scanner.nextInt());
            }
        }


        CALC_TIME.start();

        System.out.println();
        System.out.println("Wersja z for");

        for (Integer e : numbers) {

            int silnia   =   1;
            for (int i = 1; i <= e; i++) {
                silnia *= i;
            }
            System.out.println(silnia);
        }

        System.out.println("Wersja z metodą silnia()");

        for (Integer numb : numbers) {
            System.out.println(silnia(numb));
        }

        System.out.println("Wersja z petlą strumieni"); //zrobic  wersje bez fora


        for (int i = 0; i < numbers.size(); i++) {

           IntStream
                    .rangeClosed(1, numbers.get(i))
                    .reduce((left, right) -> left * right)
                    .ifPresent(System.out::println);

        }

        System.out.println("Wersja ze strumieniem, bez pętli");

      //  List<Integer> silnie =

                numbers
                .stream()
                .peek(integer -> IntStream.range(1,  integer+1))
                .reduce((left, right) -> left * right)
                .map(integer -> "silnia" + integer)

                .ifPresent(System.out::println);



        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static long silnia(int value) {
        
        int silnia;
        if (value == 1) {
            return  silnia = 1;
        }
        
        else {

            return value * silnia(value - 1) ;
        }
        
    }
}

