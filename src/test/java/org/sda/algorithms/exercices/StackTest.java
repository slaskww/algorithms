package org.sda.algorithms.exercices;


import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    @Test
    public void testStackSize(){
        Integer integer = 34;

        Stack stack = new Stack();
        stack.push(integer);

        assertThat(stack.size()).isEqualTo(1);
    }
}
