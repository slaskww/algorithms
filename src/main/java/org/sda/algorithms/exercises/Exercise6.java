package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

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

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int year = scanner.nextInt();

        CALC_TIME.start();

        if(isLeapYear(year)){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
