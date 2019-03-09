package org.sda.algorithms.exercises.insertion;

import java.util.List;
import java.util.function.Function;


public class SortingUtil {


    public static void insertionSortByScore(List<BoardGame> boardGames){
        for(int i = 1; i < boardGames.size(); i++){
            BoardGame nonSortedBoradGame = boardGames.get(i);
            boardGames.set(i, null);
            int j = i - 1;
            while (j >= 0 && boardGames.get(j).getScore() > nonSortedBoradGame.getScore()){
                boardGames.set(j+1, boardGames.get(j));
                j--;
            }

            boardGames.set(j + 1, nonSortedBoradGame);

        }
    }

    public static <T> void insertionsSort(List<T> objects, Function<T, Integer> tIntegerFunction) {
        for (int i = 1; i < objects.size(); i++) {
            T nonSorted = objects.get(i);
            objects.set(i, null);
            int j = i-1;
            while (j >=0 && tIntegerFunction.apply(objects.get(j)) > tIntegerFunction.apply(nonSorted)){
                objects.set(j+1,objects.get(j));
                j--;
            }

            objects.set(j + 1, nonSorted);
        }
    }
}
