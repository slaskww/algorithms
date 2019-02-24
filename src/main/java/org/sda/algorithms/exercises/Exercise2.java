package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * mark
 *
 * Stwórz tablicę posiadającą 10 elementów, które są liczbami typu int.
 * Wyświetl w pętli zawartość listy.
 * Następnie odwróć kolejność zapisanych elementów w tablicy.
 * Wyświetl ponownie zawartość.
 */
public class Exercise2 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        CALC_TIME.start();

        // TODO
        // napisz tutaj logike

        //int[] tabOfInts = {1, 2, 3, 4, 5, 6, 7,8, 9, 10};
        int[] tabOfInts = new int[10];



        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {

            System.out.println("podaj  " + (i+1) + " liczbe:");
            if (!input.hasNextInt()) {
                break;
            }
            tabOfInts[i] = input.nextInt();
        }

        printArray(tabOfInts);

        for (int i = 0, j = tabOfInts.length -1; i < j; i++, j--) {

            int temp;
            temp = tabOfInts[i];
            tabOfInts[i] = tabOfInts[j];
            tabOfInts[j] = temp;
        }
        printArray(tabOfInts);

        CALC_TIME.stop();
        CALC_TIME.display();
    }


    /**
     * TODO
     * napisz implementacje ktora wydrukuje liste w konsoli
     */
    private static void printArray(int[] numbers) {

        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
