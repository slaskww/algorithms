package org.sda.algorithms.exercises.insertion;

import java.util.Comparator;

public class BoardGameComparator {

    public static class SortByName implements Comparator<BoardGame> {
        @Override
        public int compare(BoardGame o1, BoardGame o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class SortByRank implements Comparator<BoardGame>{

        @Override
        public int compare(BoardGame o1, BoardGame o2) {
            //  return (o1.getRank() < o2.getRank()) ? -1 : (o1.getRank() > o2.getRank()) ? 1 : 0;
            return Double.compare(o1.getRank(), o2.getRank());
        }
    }

    public static class SortByPrice implements Comparator<BoardGame>{
        @Override
        public int compare(BoardGame o1, BoardGame o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    }

    public static class SortByMaxPlayers implements Comparator<BoardGame>{
        @Override
        public int compare(BoardGame o1, BoardGame o2) {
            return Integer.compare(o1.getMaxPlayers(), o2.getMaxPlayers());
        }
    }

    public static class SortByMinPlayers implements Comparator<BoardGame>{

        @Override
        public int compare(BoardGame o1, BoardGame o2) {
            return Integer.compare(o1.getMinPlayers(), o2.getMinPlayers());
        }
    }
}
