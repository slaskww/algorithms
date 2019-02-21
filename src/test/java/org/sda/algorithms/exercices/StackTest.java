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

    @Test
    public void testGettingObjectFromStack(){
        Integer integer = 34;
        String someValue = "value";

        Stack stack = new Stack();
        stack.push(integer);
        stack.push(someValue);

        assertThat(stack.size()).isEqualTo(2);

        Object result = stack.pop();

        assertThat(result).isEqualTo(someValue);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testFull(){
        Stack stack = new Stack();

        for(int i=0; i<10; i++){
            stack.push(i);
        }

        assertThat(stack.size()).isEqualTo(10);
        assertThat(stack.isFull()).isEqualTo(true);

    }

    @Test
    public void testAddMoreThanStackSize(){
        Stack stack = new Stack();

        for(int i=0; i<11; i++){
            stack.push(i);
        }

        assertThat(stack.size()).isEqualTo(10);
        assertThat(stack.isFull()).isEqualTo(true);

    }
}
