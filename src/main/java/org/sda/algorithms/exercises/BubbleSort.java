package org.sda.algorithms.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class BubbleSort {


    public static <T> void sortBubble(List<T> list, Comparator<T> comparator) {



        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - 1; j++) {


               // if (arrays.get(j).getSize() > arrays.get(j + 1).getSize()) {
                if (comparator.compare(list.get(j), list.get(j+1)) > 0) {
                    swap(list, j, j+1);

                }
            }
        }

    }
                public static <T> void swap(List<T> list, int i, int j){

                    T temp = list.get(i);
                    list.set(i,  list.get(j)); //replace element j with j+1
                    list.set(j, temp);
                }

}
