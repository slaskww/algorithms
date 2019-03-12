package org.sda.algorithms.lambda.introduction;

import org.sda.algorithms.lambda.introduction.objects.Robot;

import java.util.Optional;
import java.util.Random;

public class ExampleOptionalUsage {

    private static final Random RANDOM = new Random();

    private static Optional<Robot> getRandom() {
        if (RANDOM.nextBoolean()) {
            Robot robot = new Robot("Alfa", RANDOM.nextBoolean(),
                    RANDOM.nextBoolean(), RANDOM.nextBoolean());
            return Optional.of(robot);
        }
        return Optional.empty();
    }

    private static Robot getRandomRobot(){
        if(RANDOM.nextBoolean()){
            Robot robot = new Robot("Alfa", RANDOM.nextBoolean(),
                    RANDOM.nextBoolean(), RANDOM.nextBoolean());
            return robot;
        }
        return null;
    }

    public static void main(String[] args) {

//        Example 1
        System.out.println("Example 1");
        getRandom().ifPresent(System.out::println);

//        Example 2
        System.out.println("Example 2");
        System.out.println(getRandom().map(Robot::getName).orElse("Nie ma robota"));

//        Example 3
        System.out.println("Example 3");
        String name = RANDOM.nextBoolean() ? "Example" : null;
        Optional.ofNullable(name).ifPresent(System.out::println);

//        getRandom().orElseGet(() -> new Robot(""))


//        Example 1
        System.out.println("Example 1");
        System.out.println(getRandomRobot());

//        Example 2
        System.out.println("Example 2");
        Robot robot = getRandomRobot();
        if(robot != null){
            System.out.println(robot.getName());
        } else {
            System.out.println("Nie ma robota");
        }

//        Example 3
        System.out.println("Example 3");

        robot = getRandomRobot();
        if(robot != null){
            System.out.println(robot.getName());
        }

    }
}
