package org.sda.algorithms.examples;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;

        Random random = new Random();
        System.out.println(random.nextInt(max - min) + 1 + min) ;
        System.out.println(random.nextInt(max - min) + 1 + min);
        System.out.println(random.nextInt(max - min) + 1 + min);
        System.out.println(random.nextInt(max - min) + 1 + min);
    }
}
