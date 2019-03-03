package org.sda.algorithms.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {


    public static void main(String[] args) {

        Random rand = new Random();
        int[] arrayToSort = new int[10];

        for (int i = 0; i < arrayToSort.length ; i++) {

            arrayToSort[i] = rand.nextInt()% 100;
            System.out.println(arrayToSort[i]);
        }

        sortBubble(arrayToSort);
    }
// 1  -3  7  2  -5

  public static void sortBubble(int[] array){

      for (int i = 0; i < array.length - 1; i++) {


          for (int j = 0; j < array.length-1 ; j++) {

              int temp;

              if (array[j] > array[j+1]){

                  temp = array[j];
                  array[j]= array[j+1];
                  array[j+1]= temp;

              }
          }
      }
      System.out.println(Arrays.toString(array));
  }

}
