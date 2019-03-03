package org.sda.algorithms.exercises;

import java.util.ArrayList;
import java.util.Random;

import static org.sda.algorithms.exercises.BubbleSort.sortBubble;

public class SortHouses {


    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<House> houses = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            houses.add(new House(100 + rand.nextInt(150),
                    50 + rand.nextInt(70),
                    2 + rand.nextInt(8)));
        }

        System.out.println("Before bubbleSort:");
        for (House h : houses) {
            System.out.println(h.toString());
        }
        System.out.println("After bubbleSort:");
        sortBubble(houses);

    }
}
