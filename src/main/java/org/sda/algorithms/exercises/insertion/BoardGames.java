package org.sda.algorithms.exercises.insertion;

import org.sda.algorithms.exercises.sorting.SortingUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BoardGames {


    public static void main(String[] args) {

        ArrayList<BoardGame> games  = new ArrayList<>(5);
        games.add(new BoardGame("Game 1", 4, new BigDecimal("120.0"), 2, 7));
        games.add(new BoardGame("Game 2", 3, new BigDecimal("119.99"), 1, 4));
        games.add(new BoardGame("Game 3", 2, new BigDecimal("89.99"), 3, 6));
        games.add(new BoardGame("Game 4", 5, new BigDecimal("50"), 1, 6));
        games.add(new BoardGame("Game 5", 4, new BigDecimal("199.99"), 2, 5));


        for (int i = 0; i < games.size(); i++) {

            System.out.println(games.get(i).getName() + " " + games.get(i).getRank());


        }
        SortingUtils.insertionSort(games);

        for (int i = 0; i < games.size(); i++) {

            System.out.println(games.get(i).getName() + " " + games.get(i).getRank());

        }


    }



}
