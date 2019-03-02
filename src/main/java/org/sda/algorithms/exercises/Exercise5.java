package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj  algorytm, który dla podanej kwoty poda
 * w jaki sposób można wypłacać ją najmniejszą liczbą banknotów i monet.
 * Wejście:
 * W pierwszej linii wejścia znajduje się jedna liczba całkowita D (1 ≤ D ≤ 5),
 * oznaczająca liczbę przypadków do rozważenia. Opis każdego przypadku składa się
 * z jednej linii (np, 50,32).
 * Wyjście:
 * Dla każdego przypadku z wejścia.
 * Twój program powinien wypisać w osobnych liniach liczbę użytych banknotów/monet oraz ich nominał.
 */
public class Exercise5 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    private static final BigDecimal[] NOMINALS = {
            BigDecimal.valueOf(500.0),
            BigDecimal.valueOf(200.0),
            BigDecimal.valueOf(100.0),
            BigDecimal.valueOf(50.0),
            BigDecimal.valueOf(20.0),
            BigDecimal.valueOf(10.0),
            BigDecimal.valueOf(5.0),
            BigDecimal.valueOf(2.0),
            BigDecimal.valueOf(1.0),
            BigDecimal.valueOf(0.50),
            BigDecimal.valueOf(0.20),
            BigDecimal.valueOf(0.10),
            BigDecimal.valueOf(0.05),
            BigDecimal.valueOf(0.02),
            BigDecimal.valueOf(0.01)
    };

    public static void main(String[] args) {

        System.out.println("Podaj wartosc");
        BigDecimal kwota = scanner.nextBigDecimal();

        CALC_TIME.start();

        String result = value(kwota);
        System.out.println(result);

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    /**
     * TODO
     * metoda powinna wyswietlic zwrocic wynik jak tekst
     * Przykładowy tekst:
     * Wyniki:
     * Kwota503.46:
     * 1x 500.0
     * 1x 2.0
     * 1x 1.0
     * 2x 0.2
     * 1x 0.05
     * 1x 0.01
     */
    private static String value(BigDecimal value) {
        // value = 1100
//        String text = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (BigDecimal nominal : NOMINALS) {
            BigDecimal divideResult = value.divide(nominal, 0, RoundingMode.FLOOR);
            // pierwsze przejscie petli, nominal = 500, devideResult = 2
            value = value.subtract(nominal.multiply(divideResult)); // 1100 - (500 * 2) = 100

            if(divideResult.compareTo(BigDecimal.ZERO) > 0) {
                stringBuilder.append(divideResult);
                stringBuilder.append("x ");
                stringBuilder.append(nominal);
                stringBuilder.append("\n");
            }

//            text = text + divideResult + " " + nominal;
        }
        return stringBuilder.toString();
    }

    /**
     * 1100
     * nominal = 500, devideResult = 2
     * 1100 - (500 * 2) = 100
     *
     * 100
     * nominal = 200, devideResult = 0
     * 100 - (200 * 0) = 100
     *
     * 100
     * nominal = 100, devideResult = 1
     */
}
