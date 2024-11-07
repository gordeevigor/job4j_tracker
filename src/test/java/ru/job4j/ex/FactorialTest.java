package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    void whenArgumentMinus5ThenException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    factorial.calc(-5);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    void whenArgument0Then1() {
        Factorial factorial = new Factorial();
        int number = 0;
        int expected = 1;
        int result = factorial.calc(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArgument5Then120() {
        Factorial factorial = new Factorial();
        int number = 5;
        int expected = 120;
        int result = factorial.calc(number);
        assertThat(result).isEqualTo(expected);
    }
}