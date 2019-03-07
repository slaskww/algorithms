package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        int iterator = 0;
        for (int i = 0; i < 10 ; i++) {

            System.out.println("give no. " + (i + 1) + ":");

            if (!input.hasNextInt()) {
                if(input.hasNext("r")) { //if typed r, reverse elements in array
                    for (int j = 0, k = iterator - 1; j < k ; j++, k--) {
                        int temp = tabOfInts[j];
                        tabOfInts[j] = tabOfInts[k];
                        tabOfInts[k] = temp;
                    }
                    break;
                }
                break;
            }
            iterator++;
            tabOfInts[i] = input.nextInt();
        }
        printArray(tabOfInts, iterator);

    /*    for (int i = 0, j = tabOfInts.length -1; i < j; i++, j--) {

            int temp;
            temp = tabOfInts[i];
            tabOfInts[i] = tabOfInts[j];
            tabOfInts[j] = temp;
        }
        printArray(tabOfInts,tabOfInts.length);*/

        CALC_TIME.stop();
        CALC_TIME.display();
    }


    /**
     * TODO
     * napisz implementacje ktora wydrukuje liste w konsoli
     */
    private static void printArray(int[] numbers, int iter) {

        for (int i = 0; i < iter; i++ )
            System.out.println(numbers[i]);
        }
    }

