package org.sda.algorithms.examples;

import java.io.IOException;

public class ExceptionThrow {

    public static void main(String[] args) {

    }

    // Oblugujemy wyjatek
    public static void przyklad1(){
        try {
            someMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Przerzucamy go dalej, niech ktos inny sie martwi
    public static void przyklad2() throws IOException {
        someMethod();
    }

    //metoda ktora rzuca wyjątek
    public static void someMethod() throws IOException {
        throw new IOException();
    }

}
