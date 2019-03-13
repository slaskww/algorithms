package org.sda.algorithms.exercises.insertion;

import org.sda.algorithms.exercises.Exercise12;
import org.sda.algorithms.exercises.House;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Sandbox {

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

        Function<BoardGame, BigDecimal> getPricesOfGames = boardGame -> boardGame.getPrice();

        Stream<BigDecimal> gamesPrices =
                GAMES
                .stream()
                .map(getPricesOfGames)
             //   .forEach(System.out::println);//nie mozna tutaj uzyc foreacha zwracajacego voida. Strumien na wyjsciu ma dac BigDecimale


        gamesPrices.forEach(System.out::println);//tutaj juz mozna skorzystac z foreacha
    }
}
