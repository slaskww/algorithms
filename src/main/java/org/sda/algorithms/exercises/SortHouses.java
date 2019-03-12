package org.sda.algorithms.exercises;

import java.math.BigDecimal;
import java.util.*;

import static org.sda.algorithms.exercises.BubbleSort.sortBubble; ///sortowanie statyczne bez tworzenia obiektu klasy BubbleSort

public class SortHouses {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();


        ArrayList<House> houses = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            houses.add(new House(
                    (i + 1),
                    BigDecimal.valueOf(100 + rand.nextInt(333)),
                    40 + rand.nextInt(135),
                    3 + rand.nextInt(8)));
        }

        System.out.println("Before bubbleSort():");
        showTitle();
        showList(houses);

        for (int i = 0; i < 4; i++) {

            System.out.println("Sort by: \ni - id\np - price\ns - size\nr - rooms");
            String c = input.nextLine();

            System.out.println("After bubbleSort():");
            sortByChosen(houses,c);
            showTitle();
            showList(houses);
            System.out.println();
        }
    }


    public static void showTitle(){

        String id = "offer ID";
        String price = "price";
        String size = "size(m2)";
        String rooms = "rooms";
        System.out.println(String.format("%10s %9s %12s %8s", id, price, size, rooms));
    }

    public static void sortByChosen(ArrayList<House> list, String cr){

        switch(cr){

            case "i" : sortBubble(list, Comparator.comparing(House::getOfferNumber)); // sposob 1: korzystamy z metody comparing() z interfejsu Comparator i referencji do metody (przy użyciu operatora ::)
                break;

            case "p" : sortBubble(list, Comparator.comparing(house -> house.getPrice())); //sposob 2: korzystamy z metody comparing() z interfejsu Comparator i i Lambdy i odwolujemy sie do metody z klasy House
                break;

            case "s" : sortBubble(list, (o1, o2) -> Double.compare(o1.getSize(), o2.getSize())); // sposob 3: porownujemy pola przy pomocy met.compare z 'wrappera' Double
                break;

            case "r" : sortBubble(list,(o1, o2) -> o1.getRooms() - o2.getRooms() );
                break;

            default:    System.out.println("Nie ma takiego kryterium.");
                break;

//            Kiedy korzystać z klasy typu Comparator?
//            Klasa typu Comparator będzie szczególnie pomocna gdy:
//
//            nie mamy bezpośredniego dostępu do klasy, której wartości pól chcemy porównywać, i w związku z tym nie jesteśmy w stanie dodać do niej metody compareTo. Wówczas możemy utworzyć osobną klasę typu Comparator lub utworzyć anonimową klasę wewnętrzną w stosownym miejscu,
//                    mamy dostęp do klasy, ale implementuje ona już interfejs Comparable, a my musimy posortować obiekty tej klasy według innego kryterium.
//
        }
    }

    public static void showList(List<House> houses){

        for (House h : houses) {
            System.out.println(h.toString());
        }
        System.out.println();
    }

}

