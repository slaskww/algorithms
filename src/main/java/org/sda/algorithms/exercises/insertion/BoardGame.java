package org.sda.algorithms.exercises.insertion;

import java.math.BigDecimal;

public class BoardGame implements Comparable<BoardGame> {

    private String name;
    private double rank;
    private BigDecimal price;
    private int minPlayers;
    private int maxPlayers;

    public BoardGame(String name, double rank, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rank = rank;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public double getRank() {
        return rank;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @Override
    public String toString() {
        return  String.format("%-20s %7.2f %9.2f %8d %11d",name,rank ,price, minPlayers, maxPlayers);
    }

    @Override
    public int compareTo(BoardGame o) {
        int result = this.getPrice().compareTo(o.getPrice());
        if(result == 0){
            return Double.compare(this.getScore(), o.getScore());
        }
        return result;
    }
}
