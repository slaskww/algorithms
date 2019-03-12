package org.sda.algorithms.exercises;

import org.sda.algorithms.remider.Animal;
import org.sda.algorithms.remider.Cow;

import java.util.ArrayList;
import java.util.List;

public class StackExamples {

    public static void main(String[] args) {
        Cow cow = new Cow();
        String someString = "cos";

        Stack animalStack = new Stack();
        List<Animal> animals = new ArrayList<>();

        animalStack.push(cow);
//        animalStack.push(someString);

        animals.add(cow);
//        animals.add(someString)
    }
}
