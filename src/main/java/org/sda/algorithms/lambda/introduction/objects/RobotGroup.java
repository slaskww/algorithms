package org.sda.algorithms.lambda.introduction.objects;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class RobotGroup {

    public static List<Robot> getRobotGroup() {
        List<Robot> robotGroup = new ArrayList<>();
        robotGroup.add(new Robot("AWT", true, false, true));
        robotGroup.add(new Robot("Wicket", false, false, false));
        robotGroup.add(new Robot("Angular", true, true, true));
        robotGroup.add(new Robot("Iridium", false, true, true));
        robotGroup.add(new Robot("Spring", false, true, false));
        robotGroup.add(new Robot("Hibernate", true, true, false));
        return robotGroup;
    }

    public static void main(String[] args) {

        List<Robot> robotGroup = getRobotGroup();

        // Wykorzystanie wcześniej stworzonej klasy
        print(robotGroup, new CheckIfDancer());
        System.out.println();

        // klasa anonimowa, utworzona w miejscu wykorzystania
        // Anonimowa ponieważ nie ma nazwy i nie istnieje w innym miejscu
        print(robotGroup, new Checker<Robot>() {
            @Override
            public boolean check(Robot robot) {
                return robot.isRunner();
            }
        });
        System.out.println();

        print(robotGroup, Robot::isSinger);
        System.out.println();

        print(robotGroup, robot -> robot.getName().contains("a"));
        System.out.println();
    }

    public static void print(List<Robot> robotList, Checker<Robot> checker) {
        for (Robot robot : robotList) {
            if (checker.check(robot)) {
                System.out.println(robot);
            }
        }
        System.out.println();
    }
}
