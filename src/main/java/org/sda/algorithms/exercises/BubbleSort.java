package org.sda.algorithms.exercises;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSort {


    public static void main(String[] args) {



       /* Random rand = new Random();
        int[] arrayToSort = new int[10];

        System.out.print("[");
        for (int i = 0; i < arrayToSort.length ; i++) {

            arrayToSort[i] = rand.nextInt()% 100;
            System.out.print(arrayToSort[i] + " ");*/

        Random rand = new Random();

        ArrayList<House> houses = new ArrayList<>();

        for (House h: houses) {
            h = new House(120 +  rand.nextInt()% 50, 70 +  rand.nextInt()% 50, 1 +  rand.nextInt()% 5);
        }


        sortBubble(houses);
    }
// 1  -3  7  2  -5
//-5  -3  1  2   7

  public static void sortBubble(ArrayList<House>[] arrays){

      for (int i = 0; i < arrays.length - 1; i++) {


          for (int j = 0; j < arrays.length -1 ; j++) {

              int temp;

              if (arrays. > array[j+1]){

                  temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;

              }
          }
      }

      System.out.println(Arrays.toString(array));
  }

}
