package org.sda.algorithms.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd(){

        Calculator calculator = new Calculator();

        int firstNumber = 5;
        int secondNumber = 60;

        assertThat(calculator.add(firstNumber, secondNumber)).isEqualTo(65);
    }
}
