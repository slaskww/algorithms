/*
package org.sda.algorithms.exercises.insertion;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class SortingUtil {


    public static void insertionSortByScore(List<BoardGame> boardGames){
        for(int i = 1; i < boardGames.size(); i++){

            //wyciagamy puerwszy element na prawo od uporzadkowanej czesci listry
            // przy pierwszym przejsciu uporzadkowana lista to pierwszy (o indeksie zero) element
            // wiec pierwszy nieuporzadkowany to element o indeksie 1
            BoardGame nonSortedBoradGame = boardGames.get(i);
            boardGames.set(i, null);
            int j = i - 1;

            // porownujemy nie posortowany element tak dlugo az znajdziemy mniejszy element z lewej strony
            while (j >= 0 && boardGames.get(j).getScore() > nonSortedBoradGame.getScore()){
                // jezeli element z lewej strony jest wiekszy wstawiamy go z prawej strony
                boardGames.set(j+1, boardGames.get(j));
                j--;
            }

            // petla while zakonczy sie gdy znajdziemy pierwszyy element z lewej strony
            // ktory bedzie mniejszy
            // wstawiamy w ostatnie wolne miejsce element ktory chcielismy posortowac
            boardGames.set(j + 1, nonSortedBoradGame);

        }
    }

    public static <T> void insertionSort(List<T> objects, Function<T, Integer> tIntegerFunction) {
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

    public static <T> void insertionSort(List<T> objects, Comparator<T> comparator) {
        for (int i = 1; i < objects.size(); i++) {
            T nonSorted = objects.get(i);
            objects.set(i, null);
            int j = i-1;

//            while (j >=0 && tIntegerFunction.apply(objects.get(j)) > tIntegerFunction.apply(nonSorted)){
            while (j >=0 && comparator.compare(objects.get(j), nonSorted) > 0){
                objects.set(j+1,objects.get(j));
                j--;
            }

            objects.set(j + 1, nonSorted);
        }
    }
}
*/
