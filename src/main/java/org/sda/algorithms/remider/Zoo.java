package org.sda.algorithms.remider;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fox fox = new Fox();

        System.out.println("What does the cat say?");
        cat.sound();
        System.out.println("What does the dog say?");
        dog.sound();
        System.out.println("What does the fox say?");
        fox.sound();

        // Not very efficient ...

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Fox();

        // Now we have 3 animals, maybe We could put them in one place?

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        // adding each animal could be also siplified
        animals = Arrays.asList(animal1, animal2, animal3);

        // TODO
        // Let's animal talk!
        for (Animal animal : animals) {
            System.out.println("What does the animal say?");
            animal.sound();
        }

        System.out.println("iterator");
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()){
            Animal animal = animalIterator.next();
            animal.sound();
        }

        System.out.println(animalIterator.hasNext());
        animalIterator.next();

    }
}
