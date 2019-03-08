package org.sda.algorithms.lambda.introduction.objects;

/**
 */
public class CheckIfDancer implements Checker {
    @Override
    public boolean check(Robot robot) {
        return robot.isDancer();
    }
}
