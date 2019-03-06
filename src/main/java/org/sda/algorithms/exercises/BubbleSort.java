package org.sda.algorithms.exercises;

import org.sda.algorithms.house.House;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {

        //-------------- Sortowanie liczb

        int[] numbers = new int[]{4,56,7,89,2};

        printTable(numbers);
        SortingUtil.bubbleSortByHouseSize(numbers);
        printTable(numbers);

        System.out.println();
        //-------------- Sortowanie domów

        // Przygotowanie danych

        House house1 = new House("Duży dom");
        house1.setPrice(500000);
        house1.setSize(200);
        house1.setRooms(7);

        House house2 = new House("Domek");
        house2.setPrice(350000);
        house2.setSize(150);
        house2.setRooms(5);

        House house3 = new House("Rudera");
        house3.setPrice(10000);
        house3.setSize(210);
        house3.setRooms(8);

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);

        System.out.println("Domy przed sortowaniem");
        printHouses(houses);
        System.out.println();


        System.out.println("Sortowannie po rozmiarze, wersja 1");
        SortingUtil.bubbleSortByHouseSize(houses);
        printHouses(houses);
        System.out.println();
        //-------------- Sortowanie domów po dowolnym polu

        System.out.println("Sortowannie po cenie, wersja 2");
        SortingUtil.bubbleSort(houses, House::getPrice);
        printHouses(houses);

        System.out.println();
        System.out.println("Sortowannie po rozmiarze, wersja 2");
        SortingUtil.bubbleSort(houses, House::getSize);
        printHouses(houses);

    }

    public static void printTable(int[] numbers){
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printHouses(List<House> houses){
        for(House house: houses){
            System.out.println(house.toString());
        }
    }

}
