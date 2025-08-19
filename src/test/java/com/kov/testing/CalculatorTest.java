package com.kov.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        int a = 2;
        int b = 2;

        int result = calculator.add(a,b);

        assertEquals(4, result, "correct is 4");
    }

    @Test
    public void testSub(){
        int a = 5;
        int b = 2;

        int result = calculator.sub(a,b);

        Assertions.assertEquals(3, result, "correct is 3");
    }

    @Test
    public void testDivArithmeticException(){
        int a = 5;
        int b = 0;

        int result = calculator.div(a,b);

        assertEquals(ArithmeticException.class, result, "correct is -1");
    }

}
