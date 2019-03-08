package org.sda.algorithms.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.sda.algorithms.exercises.BubbleSort.sortBubble;

public class SortHouses {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();


        ArrayList<House> houses = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            houses.add(new House(
                    (i + 1),
                    100 + rand.nextInt(333),
                    40 + rand.nextInt(135),
                    3 + rand.nextInt(8)));
        }

        System.out.println("Before bubbleSort():");
        showTitle();
        for (House h : houses) {
            System.out.println(h.toString());
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {

            System.out.println("Sort by: \ni - id\np - price\ns - size\nr - rooms");
            String c = input.nextLine();

            System.out.println("After bubbleSort():");
            showTitle();
            sortBubble(houses,c );
            System.out.println();
        }
    }


    public static void showTitle(){

        String id = "offer ID";
        String price = "price";
        String size = "size(m2)";
        String rooms = "rooms";
        System.out.println(String.format("%10s %9s %12s %8s", id, price, size, rooms));
    }

}

