package org.sda.algorithms.remider;

import java.util.Arrays;
import java.util.List;

public class Zaproszenia {

    public static void main(String[] args){
        String osoba1 = "Jan Kowalski";
        String osoba2 = "Mikołaj Z";
        String osoba3 = "Antoni M";

//        System.out.println("Zapraszam Pana " + osoba1 + " na impreze");
//        System.out.println("Zapraszam Pana " + osoba2 + " na impreze");
//        System.out.println("Zapraszam Pana " + osoba3 + " na impreze");

//        printInvitation(osoba1);
//        printInvitation(osoba2);
//        printInvitation(osoba3);

        List<String> persons = Arrays.asList(osoba1, osoba2, osoba3);

        for(String person: persons){
            printInvitation(person);
        }

        printInvitation(persons);
    }

    public static void printInvitation(String person){
        System.out.println("Zapraszam Pana " + person + " na impreze");
    }

    public static void printInvitation(List<String> persons){
        for(String person: persons) {
            System.out.println("Zapraszam Pana " + person + " na impreze");
        }
    }
}
