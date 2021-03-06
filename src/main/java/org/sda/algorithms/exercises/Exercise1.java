package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * mark
 * <p>
 * Exercise:
 * W pętli pobierz od użytkownika 5 imion. Wykorzystaj do tego listę.
 * Następnie wyświetl w konsoli zapisane imiona na liście.
 */
public class Exercise1 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        try {

            /**
             * TODO
             * Tutaj umieść kod odpowiedzialny za pobieranie imion
             */
            listOfNames = setNames();
            System.out.println("w try");

        } finally {
            scanner.close();
        }

        CALC_TIME.start();

        /**
         * TODO
         * Tutaj umieść kod odpowiedzialny za wyświetlenie imion
         */

        for (String s : listOfNames) {
            System.out.println(s);

        }

        /**
         * TODO
         * Tutaj umieść kod odpowiedzialny za wyświetlanie wszystkich imion zaczynających się na A - wyświetl od tyłu
         */
        System.out.println("\nnames start with 'A', backwards\n");
        getReverse(listOfNames);

        System.out.println("+++");
        for (String s : listOfNames) {
            System.out.println(s);

        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }


    public static List<String> setNames() {
        Scanner input = new Scanner(System.in);

        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextLine();
        }
        return new ArrayList<>(Arrays.asList(array));

     /*
        List<String> names = new ArrayList<>(5);
        int i = 1;
        for (String s : names) { //It won't work. ArrayList 'names' is empty
           System.out.println("Podaj imie " + i);
           String st = input.nextLine();
           s.concat(st);
           i++;
        }*/
        //return names;
    }

  public static void getReverse(List<String> ls){


      List<String> reverseList = new ArrayList<>();

      for (int i = 0; i < ls.size(); i++) {
         // char[] cArray = new char[]{};
          char[] cArray = ls.get(i).toCharArray();

          if (Character.toUpperCase(cArray[0]) == 'A'){
              for (int j = 0, k = cArray.length -1; j < k; j++, k--) {
                  char temp = cArray[j];
                  cArray[j] = cArray[k];
                  cArray[k] = temp;
              }
              System.out.println(new String(cArray));
          }
      }

  }

}
