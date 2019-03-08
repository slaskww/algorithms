package org.sda.algorithms.exercises.sorting;

import org.sda.algorithms.house.House;

import java.util.List;
import java.util.function.Function;

public class SortingUtil {

    public static void bubbleSortByHouseSize(int[] numbers){
        for(int j=numbers.length; j > 0; j--){
            for(int i=0; i < j - 1; i++){
                if(numbers[i] > numbers[i+1]){
                    swap(numbers, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
     }

    public static void bubbleSortByHouseSize(List<House> houses) {
        for(int j=houses.size(); j> 0; j--){
            for(int i=0; i < j - 1; i++){
                if(houses.get(i).getSize() > houses.get(i+1).getSize()){
                    swapOnList(houses, i, i+1);
                }
            }
        }
    }

    private static void swapOnList(List<House> objects, int i, int j) {
        House tmp = objects.get(i);
        objects.set(i, objects.get(j));
        objects.set(j, tmp);
    }

    /*
    private static <T> void swapOnList(List<T> objects, int i, int j) {
        T tmp = objects.get(i);
        objects.set(i, objects.get(j));
        objects.set(j, tmp);
    }
    */

    public static void bubbleSort(List<House> houses, Function<House, Integer> function) {
        for(int j=houses.size(); j> 0; j--){
            for(int i=0; i < j - 1; i++){
                if(function.apply(houses.get(i)) > function.apply(houses.get(i+1))){
                    swapOnList(houses, i, i+1);
                }
            }
        }

    }
}
