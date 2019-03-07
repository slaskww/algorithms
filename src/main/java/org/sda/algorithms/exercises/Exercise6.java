package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.awt.*;
import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który sprawdzi czy podany rok
 * jest przestępny czy nie.
 * Wejście:
 * W pierwszej linii wejścia znajduje się liczba całkowida D (1 <= D <= 5 )
 * oznaczająca liczbę przypadków do rozwiązania. Opis każdego
 * przypadku składa się z jednej linii - rok r ∈ ℕ
 * Wyjście:
 * Dla każdego przestępnego roku słowo TAK; NIE w p.p.
 */
public class Exercise6 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę przypadków  (od 1 do 5)");
        int cases = input.nextInt();

        int[] years = new int[cases];

        for (int i = 0; i < years.length; i++) {
            System.out.println("podaj " + (i+1) + " rok");
            years[i] = input.nextInt();
        }




        CALC_TIME.start();

        for (int i = 0; i < years.length; i++) {

            if((isLeapYear(years[i]))){
                System.out.println("rok " + years[i] + " jest przestępny");

            } else {
                System.out.println("rok " + years[i] + " nie jest przestępny");

            }
        }


        CALC_TIME.stop();
        CALC_TIME.display();
    }

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){

            return true;
        }

        return false;
    }
}
