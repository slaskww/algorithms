package org.sda.algorithms.exercises.insertion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortingUtils  {



  public static <T> void insertionSort(List<T> list, Function<T, Integer> function){

    for(int i = 1; i <  list.size(); i++){

        T p = list.get(i);
        int  j = i-1;

            while(j >= 0 && function.apply(list.get(j)) > function.apply(p)){

            function.apply(list.set(j+1, list.get(j)));
               j = j-1;
            }
        function.apply(list.set(j+1, p));
        }
    }

    public static <T> void insertionSort(ArrayList<T> list, Comparator<T> comparator){

        for(int i = 1; i <  list.size(); i++){

            T p = list.get(i);
            int  j = i-1;

            while(j >= 0 && comparator.compare(list.get(j), p) > 0){
                System.out.println(comparator.compare(list.get(j), p));

                list.set(j+1, list.get(j));
                j = j-1;
            }
            list.set(j+1, p);
        }
    }
  }


