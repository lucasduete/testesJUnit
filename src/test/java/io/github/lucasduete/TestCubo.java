package io.github.lucasduete;

import io.github.lucasduete.exceptions.InvalidNumberException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCubo {

    @Test
    public void testAreaLadoA3() {
        double x = Cubo.areaDoLado(3);
        double esperado = 9;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testAreaLadoA5() {
        double x = Cubo.areaDoLado(5);
        double esperado = 25;
        assertEquals(esperado, x, 0.01);
    }

    @Test(expected = InvalidNumberException.class)
    public void testAreaLadoA0() {
        double x = Cubo.areaDoLado(0);
        double esperado = 0;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testAreaLateralA3() {
        double x = Cubo.areaLateral(3);
        double esperado = 36;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testAreaLateralA5() {
        double x = Cubo.areaLateral(5);
        double esperado = 100;
        assertEquals(esperado, x, 0.01);
    }

    @Test(expected = InvalidNumberException.class)
    public void testAreaLateralA0() {
        double x = Cubo.areaLateral(0);
        double esperado = 0;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testAreaTotalA3() {
        double x = Cubo.areaTotal(3);
        double esperado = 54;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testAreaTotalA5() {
        double x = Cubo.areaTotal(5);
        double esperado = 150;
        assertEquals(esperado, x, 0.01);
    }

    @Test(expected = InvalidNumberException.class)
    public void testeAreaTotalA0() {
        double x = Cubo.areaTotal(0);
        double esperado = 0;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testVolumeA3() {
        double x = Cubo.volume(3);
        double esperado = 27;
        assertEquals(esperado, x, 0.01);
    }

    @Test
    public void testVolumeA5() {
        double x = Cubo.volume(5);
        double esperado = 125;
        assertEquals(125, x, 0.01);
    }

    @Test(expected = InvalidNumberException.class)
    public void testVolumeA0() {
        double x = Cubo.volume(0);
        double esperado = 0;
        assertEquals(esperado, x, 0.01);
    }
}
