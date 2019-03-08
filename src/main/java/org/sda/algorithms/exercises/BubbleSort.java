package org.sda.algorithms.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class BubbleSort {


    public static void sortBubble(ArrayList<House> arrays, String c) {

        double[] fieldToSort = new double[arrays.size()];

        switch(c){

            case  "i" :
                for (int i = 0; i<arrays.size(); i++){
                    fieldToSort[i] = arrays.get(i).getOfferNumber();
                }
                break;

            case  "p" :
                        for (int i = 0; i<arrays.size(); i++){
                        fieldToSort[i] = arrays.get(i).getPrice();
                        }
                    break;

            case  "s" :
                        for (int i = 0; i<arrays.size(); i++){
                        fieldToSort[i] = arrays.get(i).getSize();
                        }
                    break;

            case  "r" :
                        for (int i = 0; i<arrays.size(); i++){
                        fieldToSort[i] = arrays.get(i).getRooms();
                        }
                    break;

            default:
                System.out.println("Nie ma kryterium o identyfikatorze " + c);
                return;
        }


        for (int i = 0; i < arrays.size() - 1; i++) {

            for (int j = 0; j < arrays.size() - 1; j++) {

                House temp;

               // if (arrays.get(j).getSize() > arrays.get(j + 1).getSize()) {
                if (fieldToSort[j] >fieldToSort[j+1]) {

                    double dTemp = fieldToSort[j];
                    fieldToSort[j] = fieldToSort[j +1];
                    fieldToSort[j+1] = dTemp;

                    temp = arrays.get(j);
                    arrays.set(j, arrays.get(j + 1)); //replace element j with j+1
                    arrays.set(j + 1, temp);

                }
            }
        }

        for (House h : arrays) {
            System.out.println(h.toString());
        }
    }

}
