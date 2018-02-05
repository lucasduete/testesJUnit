package io.github.lucasduete;

import io.github.lucasduete.exceptions.InvalidChangeStateException;
import io.github.lucasduete.exceptions.InvalidNumberException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAviao {

    @Test
    public void testLigarAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.ligar();

        assertTrue(aviao.isLigado());
    }

    @Test(expected = InvalidChangeStateException.class)
    public void testLigarAviaoLigado() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.ligar();
    }

    @Test
    public void testDesligarAviaoLigado() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.desligar();

        assertFalse(aviao.isLigado());
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testDesligarAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.desligar();
    }

    @Test
    public void testAceleraAviaoLigado() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.acelerar();

        assertTrue(aviao.getVelocidade()>0);
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testAceleraAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.acelerar();
    }

    @Test
    public void testDesaceleraAviaoVoando() {
        Aviao aviao = new Aviao();

        aviao.ligar();

        aviao.acelerar();
        aviao.voar();
        aviao.acelerar();

        double velAntes = aviao.getVelocidade();

        aviao.desacelerar();
        double velDepois = aviao.getVelocidade();

        assertTrue(velAntes > velDepois);
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testDesaceleraAviaoParado() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.desacelerar();
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testDesaceleraAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.desacelerar();
    }

    @Test
    public void testVoarAviaoLigadoParado() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.acelerar();
        aviao.voar();

        assertTrue(aviao.isVoando());
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testVoarAviaoLigadoVoando() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.acelerar();
        aviao.voar();

        aviao.voar();
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testVoarAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.voar();
    }

    @Test
    public void testPousarAviaoLigadoVoando() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.acelerar();
        aviao.voar();

        aviao.pousar();
        assertFalse(aviao.isVoando());
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testPousarAviaoLigadoParado() {
        Aviao aviao = new Aviao();

        aviao.ligar();

        aviao.pousar();
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testPousarAviaoLigadoMovimentandoSolo() {
        Aviao aviao = new Aviao();

        aviao.ligar();
        aviao.acelerar();

        aviao.pousar();
    }

    @Test (expected = InvalidChangeStateException.class)
    public void testPousarAviaoDesligado() {
        Aviao aviao = new Aviao();

        aviao.pousar();
    }
}
