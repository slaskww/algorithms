package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.sda.algorithms.exercises.Exercise6.isLeapYear;


public class LeapYearTest {

    @Test
    public void testisLeapYear(){


        assertThat(isLeapYear(1804)).isEqualTo(true);
        assertThat(isLeapYear(2028)).isEqualTo(true);
        assertThat(isLeapYear(2380)).isEqualTo(true);
        assertThat(isLeapYear(2296)).isEqualTo(true);

    }

    @Test
    public void testNotLeapYear(){


        assertThat(isLeapYear(1805)).isEqualTo(false);
        assertThat(isLeapYear(2163)).isEqualTo(false);
        assertThat(isLeapYear(2381)).isEqualTo(false);
        assertThat(isLeapYear(2399)).isEqualTo(false);

    }

}
