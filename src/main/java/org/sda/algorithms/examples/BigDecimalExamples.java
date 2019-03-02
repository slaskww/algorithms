package org.sda.algorithms.examples;

import java.math.BigDecimal;

public class BigDecimalExamples {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("56.90");
        BigDecimal otherBigDecimal = new BigDecimal("1.1");

        BigDecimal result = bigDecimal.multiply(otherBigDecimal);
        System.out.println(result);

        float first = 56.90f;
        float second = 1.1f;
        System.out.println(first * second);

        int liczba = 6;
        BigDecimal liczbaDoPorownania = new BigDecimal(liczba);
        int compareResult = bigDecimal.compareTo(liczbaDoPorownania);

        System.out.println("Wynik porównania");
        System.out.println(compareResult);

        //-------------------------------------
        //-------Przyklady---------------------

        BigDecimal sto = new BigDecimal("100");
        BigDecimal dziesiec = new BigDecimal("10");

        int czyStoJestWiekszeOdDziesiec = sto.compareTo(dziesiec);
        System.out.println(czyStoJestWiekszeOdDziesiec);

        int czyDziesiecJestWiekszeOdStu = dziesiec.compareTo(sto);
        System.out.println(czyDziesiecJestWiekszeOdStu);

        if(czyStoJestWiekszeOdDziesiec > 0){
            System.out.println("Tak jest wieksze");
        } else {
            System.out.println("Jest mniejsze");
        }
    }
}
