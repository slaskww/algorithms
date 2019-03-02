package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Napisz program, który sprawdza czy liczba jest pierwsza.
 * Wejśćie:
 * W pierwszej linii 𝑛 ∈ ℕ - liczba testów, w kolejnych liniach n liczb z przedziału [1…100000]
 * <p>
 * Wyjście:
 * Dla każdej liczby słowo TAK, jeśli pierwsza; NIE w p.p.
 */
public class Exercise3 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO
        // Pobierze od uzytkownika informacje ile przykladow chce sprawdzic
        System.out.println("Ile liczb chcesz sprawdzić");
        int numbers = scanner.nextInt();

        // Pobierz liczby

        List<Integer> numbersToTest = new ArrayList<Integer>();

        for (int i = 0; i<numbers; i++) {
            System.out.println("Podaj liczbe: ");
            int n  =  scanner.nextInt();
            numbersToTest.add(n);
        }

        CALC_TIME.start();

        // TODO
        // Sprawdz czy liczba jest pierwsza uzywajac metody isPrime

        for (int i: numbersToTest) {
            System.out.print(i + ": ");
            System.out.println(isPrime(i));
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    // TODO
    // zaimplementuj metode ktora zwroci true dla kazdej liczby pierwszej
    // i false dla innych
    public static boolean isPrime(int number) {

        double sqrtNumb = Math.sqrt(number);

        if (number ==  1){
            return false;
        }

        if (number  ==  2){

            return true;
        }


        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i <= sqrtNumb; i+=2 ){

                  if (number % i == 0)
                      return false;
                }

        return true;
    }
}
