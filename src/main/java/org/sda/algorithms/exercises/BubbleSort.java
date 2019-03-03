package org.sda.algorithms.exercises;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSort {



  public static void sortBubble(ArrayList<House> arrays){

      for (int i = 0; i < arrays.size() - 1; i++) {

          for (int j = 0; j < arrays.size() -1 ; j++) {

              House temp;

              if (arrays.get(j).getSize() > arrays.get(j+1).getSize()){

                  temp = arrays.get(j);
                  arrays.set(j,arrays.get(j+1)); //replace element j with j+1
                  arrays.set(j+1,temp );

              }
          }
      }

      for (House h:arrays) {
          System.out.println(h.toString());
      }
  }

}
