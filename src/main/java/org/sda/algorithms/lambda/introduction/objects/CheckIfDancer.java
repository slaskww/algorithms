package org.sda.algorithms.lambda.introduction.objects;

/**
 */
public class CheckIfDancer implements Checker<Robot> {

    @Override
    public boolean check(Robot robot) {
        return robot.isDancer();
    }
}
