package org.sda.algorithms.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.sda.algorithms.exercises.BubbleSort.sortBubble;

public class SortHouses {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);


        ArrayList<House> houses = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            houses.add(new House(100 + rand.nextInt(333),
                    40 + rand.nextInt(135),
                    3 + rand.nextInt(8)));
        }

        System.out.println("Before bubbleSort:");
        for (House h : houses) {
            System.out.println(h.toString());
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.println("Sort by: \np - price\ns -  size\nr - rooms");
            String c = input.nextLine();

            System.out.println("After bubbleSort:");
            sortBubble(houses,c );
        }
    }
}
