package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który odszukuje, na której pozycji w tablicy
 * znajduje się dana liczba. Wyznacz jego klasę złożoności,
 * zastanów się ile wynosi złożoność optymistyczna, pesymistyczna i średnia.
 * Wejście:
 * Na wejście programu podany zostanie zbiór liczb oraz liczba,
 * którą należy wyszukać. Każda liczba ze zbioru zostanie rozdzielona przecinkiem.
 * Wyjście:
 * Pozycja liczby w tablicy; jeśli nie znaleziono to zwróć -1
 */
public class Exercise7 {

    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        int[] values;
        int search;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczby (oddzielone przecinkiem): ");
            String[] numbers = scanner.nextLine().split(",");
            System.out.println("Jakie liczby szukasz?");
            search = scanner.nextInt();

            values = new int[numbers.length];
            for(int i=0; i< numbers.length; i++){
                values[i] = Integer.valueOf(numbers[i]);
            }

        }

        CALC_TIME.start();

        int result = findPosition(values, search);
        System.out.println(result);

        CALC_TIME.stop();
        CALC_TIME.display();

    }

    private static int findPosition(int[] values, int search) {
        for(int i=0; i< values.length; i++){
            if(values[i] == search){
                return i + 1;
            }
        }
        return -1;
    }
}
