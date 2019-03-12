package org.sda.algorithms.exercises;

import org.sda.algorithms.exercises.insertion.BoardGame;
import org.sda.algorithms.exercises.insertion.BoardGameComparator;
import org.sda.algorithms.exercises.insertion.BoardGames;
import org.sda.algorithms.exercises.insertion.SortingUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
//CRID/CRUD
///ddos
///ctrl shift n
public class Exercise12 {

    public final static List<BoardGame> GAMES = Arrays.asList(
            new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
            new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
            new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
            new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
            new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
            new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
            new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
            new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
            new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
            new BoardGame("The Castles of Burg", 8.12, new BigDecimal("129.95"), 2, 4)
    );

    public static void main(String[] args) {

        List<BoardGame> wybraneGry = new ArrayList<>();

        // Korzystając z pętli i intrukcji warunkowych wpisz do listy wybraneGry
        // wszystkie gry z listy GAMES które
        // pozwolają na grę w więcej niż 4 osoby,
        // mają ocenę wyższą niż 8,
        // kosztują mniej niż 150 zł



        for (int i = 0; i < GAMES.size(); i++) {
            if (GAMES.get(i).getMaxPlayers() > 4 && GAMES.get(i).getRank() > 8 && GAMES.get(i).getPrice().compareTo(new BigDecimal("150")) < 0 ){

                wybraneGry.add(GAMES.get(i));
            }
        }


        // Przykład od prowadzącego

        List<BoardGame>  list =  GAMES
                .stream()
                .filter(BoardGame -> BoardGame.getMaxPlayers() > 4)
                .filter(BoardGame -> BoardGame.getRank() > 8)
                .filter(BoardGame -> BoardGame.getPrice().compareTo(new BigDecimal("150")) < 0)
                .collect(Collectors.toList());

        Stream<BoardGame> boardGameStream = GAMES.stream();
        Stream<BoardGame> onyForMoreThan4Pplayers = boardGameStream.filter(BoardGame -> BoardGame.getRank() > 8);

        BoardGames.showGames(list);
        System.out.println();


// 1. wypisz wszystkie gry dla minimum dwóch graczy

       list =  GAMES
                .stream()
                .filter(boardGame -> boardGame.getMinPlayers() >= 2)
               // .forEach(boardGame -> System.out.println(boardGame));
                .collect(Collectors.toList());
                //.ifPresent(System.out::println);

        //.collect(Collectors.toList());

        System.out.println(" 1. wypisz wszystkie gry dla minimum dwóch graczy");
        BoardGames.showGames(list);
        System.out.println();


// 2. Posortuj gry wg ceny


        list = GAMES
                .stream()
                .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .collect(Collectors.toList());

        System.out.println(" 2. Posortuj gry wg ceny");
        BoardGames.showGames(list);
        System.out.println();

// 3. Wypisz najtańszą wodę


        list = GAMES
                .stream()
                .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
              //.sorted(Comparator.comparing(BoardGame::getPrice))
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("3. Wypisz najtańszą grę");
        BoardGames.showGames(list);
        System.out.println();

// 4. Wypisz najdroższą wodę


        BoardGame mostExpensiveGame = GAMES
                .stream()
                //.max(new BoardGameComparator.SortByPrice())
                //.max((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .max(Comparator.comparing(BoardGame::getPrice))
                .get();

        System.out.println("4. Wypisz najdroższą grę");
        BoardGames.showGame(mostExpensiveGame);
        System.out.println();

// 5. Podaj średnią punktacje wszystkich gier


        double averageScore = GAMES
                .stream()
                .mapToDouble(BoardGame::getRank)
                .average()
                .getAsDouble();

        System.out.print("5. Podaj średnią punktacje wszystkich gier: ");
        System.out.printf("% .2f", averageScore);
        System.out.println();
        System.out.println();

// 6. Wypisz kwotę do zapłaty za wszystkie gry po jednej sztuce (suma)


        BigDecimal cost = GAMES
                .stream()
                .map(BoardGame::getPrice)
                .reduce(BigDecimal::add)
              //.reduce((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2))
                .get();

        System.out.print("6. Wypisz kwotę do zapłaty za wszystkie gry po jednej sztuce (suma): ");
        System.out.println(cost);
        System.out.println();

// 7. Wypisz najdroższą grę wśród gier z ocena powyzej 8

        BoardGame mostExpensiveTopGame = GAMES
                .stream()
                .filter(boardGame -> boardGame.getRank() > 8)
                .max(Comparator.comparing(BoardGame::getPrice))
                .get();

        System.out.println("7. Wypisz najdroższą grę wśród gier z ocena powyzej 8");
        BoardGames.showGame(mostExpensiveTopGame);
        System.out.println();


// 8. Wypisz najtansza gre ze wszystkich gier dla maksymalnie 5 graczy

        BoardGame cheapestFor5Pplayers = GAMES
                .stream()
                .filter(boardGame -> boardGame.getMaxPlayers() <= 5)
                .min(Comparator.comparing(BoardGame::getPrice))
                .get();


        System.out.println("8. Wypisz najtansza gre ze wszystkich gier dla maksymalnie 5 graczy");
        BoardGames.showGame(cheapestFor5Pplayers);
        System.out.println();

// 9. Wypisz 3 gry ktore maja najgorsze oceny

        list = GAMES
                .stream()
                .sorted(Comparator.comparing(BoardGame::getRank))
               // .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("9. Wypisz 3 gry ktore maja najgorsze oceny");
        BoardGames.showGames(list);
        System.out.println();


// 10. Wypisz 3 gry ktore maja najlepsze oceny
        int size = GAMES.size();
        list = GAMES
                .stream()
                .sorted(Comparator.comparing(BoardGame::getRank).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("10. Wypisz 3 gry ktore maja najlepszee oceny");
       // showList(list);
        BoardGames.showGames(list);
        System.out.println();
    }
}


