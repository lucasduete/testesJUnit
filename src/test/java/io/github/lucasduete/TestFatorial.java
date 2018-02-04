package io.github.lucasduete;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFatorial {


    @Test
    public void testeFatorial5() {
        long x = Fatorial.calcFatorial(5);
        assertEquals(120, x);
    }

    @Test
    public void testeFatorial10() {
        long x = Fatorial.calcFatorial(10);
        assertEquals(3628800, x);
    }

    @Test
    public void testeFatorial20() {
        long x = Fatorial.calcFatorial(20);
        long esperado = Long.parseLong("2432902008176640000");
        assertEquals(esperado, x);
    }
}
