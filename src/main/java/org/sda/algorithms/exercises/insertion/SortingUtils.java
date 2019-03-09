package org.sda.algorithms.exercises.insertion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortingUtils {


  public static void insertionSort(ArrayList<BoardGame> list){

      //3 1 4 6
      // 3 > 1 to zamiana
      //1 3 4 6

    for(int i = 1; i <  list.size(); i++){

        BoardGame p = list.get(i);
        int  j = i-1;

            while(j >= 0 && list.get(j).getRank() > p.getRank()){

               list.set(j+1, list.get(j));
               j = j-1;
            }
        list.set(j+1, p);
        }
    }

    private static void swapOnList(List<BoardGame> objects, int i, int j) {
        BoardGame tmp = objects.get(i);
        objects.set(i, objects.get(j));
        objects.set(j, tmp);
    }

  }



/*
//3 1 2 6 , k = 1
//1 3 2 6, k = 2
//1 3

    void insertionSort(int arr[], int n)
    {
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];  //1
            j = i-1;  //j=0

       */
/* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position *//*

            while (j >= 0 && arr[j] > key) //czy 3 > 1
            {
                arr[j+1] = arr[j];//1  3
                j = j-1;
            }
            arr[j+1] = key;
        }
    } */
