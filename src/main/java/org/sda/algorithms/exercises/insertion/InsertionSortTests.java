package org.sda.algorithms.exercises.insertion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertionSortTests {

    public static void main(String[] args) {

        List<BoardGame> boardGames = new ArrayList<>();
        boardGames.add(new BoardGame("GTA", 4, new BigDecimal("90.1"), 3, 10));

        BoardGame boardGame1 = new BoardGame();
        boardGame1.setName("Szachy");
        boardGame1.setScore(3);
        boardGame1.setPrice(new BigDecimal("50"));
        boardGame1.setMinimalPlayers(2);
        boardGame1.setMaximumPlayers(2);
        boardGames.add(boardGame1);

        boardGames.add(new BoardGame("Jakaś gra", 6, new BigDecimal("40"), 3, 90));
        boardGames.add(new BoardGame("Następna gra", 1, new BigDecimal("45"), 2, 90));

        print(boardGames);
        System.out.println();
        SortingUtil.insertionSortByScore(boardGames);
        print(boardGames);
        System.out.println();

        SortingUtil.insertionSort(boardGames, BoardGame::getMinimalPlayers);
        print(boardGames);
        System.out.println();

        System.out.println("Po cenie");
        SortingUtil.insertionSort(boardGames, new BoardGameByPriceComparator());
        print(boardGames);
        System.out.println();

        System.out.println("Po ocenie");
        SortingUtil.insertionSort(boardGames, new BoardGameByScoreComparator());
        print(boardGames);
        System.out.println();


        System.out.println("Po minimalnej liczbie graczy");
        SortingUtil.insertionSort(boardGames, new Comparator<BoardGame>() {

            @Override
            public int compare(BoardGame o1, BoardGame o2) {
                return o1.getMinimalPlayers() - o2.getMinimalPlayers();
            }
        });
        print(boardGames);
        System.out.println();

        System.out.println("Po minimalnej liczbie graczy");
        SortingUtil.insertionSort(boardGames, (o1, o2) -> o1.getMinimalPlayers() - o2.getMinimalPlayers());
        print(boardGames);
        System.out.println();

    }

    public static void print(List<BoardGame> boardGames){
        for(BoardGame boardGame: boardGames){
            System.out.println(boardGame);
//            System.out.println(boardGame.toString());
        }
    }
}
