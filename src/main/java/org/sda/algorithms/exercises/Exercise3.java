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

        System.out.println("Ile przykladow chcesz sprawdzic?");
        int liczbaPrzykladow = scanner.nextInt();

        List<Integer> liczbyDoSprawdzenia = new ArrayList<>();
//        int[] tablicaLiczbyDoSprawdzenia = new int[liczbaPrzykladow];

        for(int i=0; i < liczbaPrzykladow; i++){
            System.out.println("Podaj przyklad nr " + i);
            int liczba = scanner.nextInt();
            liczbyDoSprawdzenia.add(liczba);
        }

        CALC_TIME.start();

        for(int liczba: liczbyDoSprawdzenia){
            boolean prime = isPrime(liczba);
            if(prime){
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    public static boolean isPrime(int number) {

        for(int i= 2; i < number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
