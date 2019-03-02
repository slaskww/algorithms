package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

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

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] innySposob = new int[10];
        innySposob[0] = 1;
        innySposob[1] = 2;

        int[] kolejnaTablica = new int[10];
        for(int i=0; i < 10; i++){
            kolejnaTablica[i] = i;
        }

        System.out.println("Pierwsze wypisanie");
        printArray(numbers);

        CALC_TIME.start();

//        int[] tmp = new int[10];
        int[] tmp = new int[numbers.length];
        // zaczynamy od indeksu 9

//        for(int i = 0; i < 10; i++){
        for(int i = 0; i < numbers.length; i++){
            tmp[i] = numbers[9 - i];
            tmp[i] = numbers[numbers.length - 1 - i]; // uniwersalne dla kazdej tablicy
        }

        numbers = tmp;

        System.out.println("Po odwróceniu");
        printArray(numbers);

        CALC_TIME.stop();
        CALC_TIME.display();
    }


    /**
     * TODO
     * napisz implementacje ktora wydrukuje liste w konsoli
     */
    private static void printArray(int[] numbers) {
        for(int i: numbers){
            System.out.println(i);
        }
    }
}
