package org.sda.algorithms.errors.other;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Error2 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
        removeOddFromList(integers);
        for (int i = 0; i < integers.size(); i++) {

            System.out.println(integers.get(i));
        }

    }

    /**
     * Usuwa nieparzyste liczby z listy
     */
    public static void removeOddFromList(List<Integer> numbers){
        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            //System.out.println(i.next());
            Integer next = i.next();
            if(next % 2 == 1) {
                System.out.println(next);
                numbers.remove(next);
        }
      /*  for (Integer currentValue : numbers.iterator())
            System.out.println(currentValue);
            if(currentValue % 2 == 1) {
                numbers.remove(currentValue);
            }*/
        }
    }
}
//https://javastart.pl/baza-wiedzy/baza-wiedzy/wyjatki/concurrentmodificationexception