package org.sda.algorithms.exercises;

import org.sda.algorithms.exercises.insertion.BoardGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Exercise12 {

    public static List<BoardGame> GAMES = Arrays.asList(
            new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
            new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
            new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
            new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
            new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
            new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
            new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
            new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
            new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
            new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
    );

    public static void main(String[] args) {

        List<BoardGame> wybraneGry = new ArrayList<>();

        // Korzystając z pętli i intrukcji warunkowych wpisz do listy wybraneGry
        // wszystkie gry z listy GAMES które
        // pozwolają na grę w więcej niż 4 osoby,
        // mają ocenę wyższą niż 8,
        // kosztują mniej niż 150 zł


        // Przykład od prowadzącego


        // 1. wypisz wszystkie gry dla minimum dwóch graczy


        // 2. Posortuj wody wg ceny


        // 3. Wypisz najtańszą wodę


        // 4. Wypisz najdroższą wodę


        // 5. Podaj średnią punktacje wszystkich gier

        // 6. Wypisz kwotę do zapłaty za wszystkie gry po jednej sztuce (suma)

        // 7. Wypisz najdroższą grę wśród gier z ocena powyzej 8

        // 8. Wypisz najtansza gre ze wszystkich gier dla maksymalnie 5 graczy

        // 9. Wypisz 3 gry ktore maja najgorsze oceny




    }
}
