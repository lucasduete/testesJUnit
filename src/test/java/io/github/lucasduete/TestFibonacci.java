package io.github.lucasduete;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFibonacci {

    @Test
    public void testCalcFibonacci6() {

        assertEquals(8, Fibonacci.calcFibonacci(6));
    }

    @Test
    public void testCalcFibonacci10() {

        assertEquals(55, Fibonacci.calcFibonacci(10));
    }

    @Test
    public void testCalcFibonacci11() {

        assertEquals(89, Fibonacci.calcFibonacci(11));
    }
}
