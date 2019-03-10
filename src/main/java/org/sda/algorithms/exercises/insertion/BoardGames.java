package org.sda.algorithms.exercises.insertion;

import org.sda.algorithms.exercises.sorting.SortingUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BoardGames {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<BoardGame> games  = new ArrayList<>(5);
        games.add(new BoardGame("Game 1", 4.5, new BigDecimal("120.0"), 2, 7));
        games.add(new BoardGame("Game 2", 3.5, new BigDecimal("119.99"), 1, 4));
        games.add(new BoardGame("Game 3", 2.9, new BigDecimal("89.99"), 3, 6));
        games.add(new BoardGame("Game 4", 5.3, new BigDecimal("50"), 1, 6));
        games.add(new BoardGame("Game 5", 4.2, new BigDecimal("199.99"), 2, 5));

        showGames(games);

        SortingUtils.insertionSort(games, BoardGame::getMinPlayers);
        showGames(games);

        SortingUtils.insertionSort(games, new BoardGameComparator.SortByPrice());
        showGames(games);

        String c;
        showInterface();
        while(!(c = input.nextLine()).equals("q")){

            sortByChosen(games, c);
            showGames(games);
            showInterface();
        }
    }

public static void showGames(List<BoardGame> games){

    String name = "[n]ame";
    String rank = "[r]ank";
    String price = "[p]rice";
    String playMax = "[max]players";
    String playMin = "[min]players";
    System.out.println();
    System.out.println(String.format("%14s %8s %8s %14s %8s", name, rank, price, playMin, playMax));

    for (int i = 0; i < games.size(); i++) {
        System.out.println(games.get(i));
    }

}

public static void sortByChosen(ArrayList<BoardGame> list, String choice){

        switch (choice){

            case "n" : SortingUtils.insertionSort(list, new BoardGameComparator.SortByName());
                break;

            case "r" : SortingUtils.insertionSort(list, new BoardGameComparator.SortByRank());
                break;

            case "p" : SortingUtils.insertionSort(list, new BoardGameComparator.SortByPrice());
                break;

            case "max" : SortingUtils.insertionSort(list, Comparator.comparingInt(BoardGame::getMinPlayers));
                break;

            case "min" : SortingUtils.insertionSort(list, (o1, o2) -> o1.getMinPlayers() - o2.getMinPlayers());
                break;

            default:
                System.out.println("Nie ma takiego parametru");
                break;
        }
}

public static void showInterface(){

    System.out.println("\nSort by: \nn = name\nr = rate\np = price\nmin = min number of players\nmax = max number of players\nq = quit \n");
}
}


