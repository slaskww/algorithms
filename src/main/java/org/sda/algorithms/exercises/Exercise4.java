package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który oblicza sumę pojawiających się na wejściu liczb.
 * Wejście:
 * Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość
 * małych liczb całkowitych (z zakresu -100..100). Poszczególne liczby zostaną,
 * rozdzielone znakiem nowej linii.
 * Wyjście:
 * Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja
 * jest równa sumie i-pierwszych wczytanych z wejścia liczb.
 * Poszczególne liczby należy rozdzielić znakami nowej linii.
 * <p>
 * Sign EOF => use CTRL + D
 */
public class Exercise4 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj ile liczb chcesz sprawdzic?");
        int liczbaPrzykladow = scanner.nextInt();

        List<Integer> liczbyDoZsumowania = new ArrayList<>();

        for(int i=0; i< liczbaPrzykladow; i++){
            System.out.println("Podaj kolejna liczbe");
            int liczba = scanner.nextInt();
            liczbyDoZsumowania.add(liczba);
        }

        CALC_TIME.start();

        int sum = 0;
        for(int liczba: liczbyDoZsumowania){
            sum += liczba;
//            sum = sum + liczba;
            System.out.println(sum);
        }

        int sum2 = 0;
        for(int i =0; i < liczbyDoZsumowania.size(); i++){
            int liczba = liczbyDoZsumowania.get(i);
            sum2 += liczba;
            System.out.println(sum2);
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
