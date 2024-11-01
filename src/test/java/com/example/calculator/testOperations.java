package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testOperations {

    private final CalculatorService calculatorService;


    testOperations(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Test
    public void multiplyTest(){
        int actual = calculatorService.multiply(3, 4);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        int actual = calculatorService.divide(10, 2);
        int expected = 5;
        try {
            calculatorService.divide(10, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Деление на ноль недопустимо", e.getMessage());
        }
        assertEquals(expected, actual);
    }

    @Test
    public void minusTest(){
        int actual = calculatorService.minus(3, 4);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void plusTest(){
        int actual = calculatorService.add(5, 5);
        int expected = 10;
        assertEquals(expected, actual);
    }
}
