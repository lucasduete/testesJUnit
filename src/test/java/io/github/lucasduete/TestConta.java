package io.github.lucasduete;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestConta {

    @Test
    public void testSacarTrue() {
        Conta conta = new Conta(1, "Lucas", 250.90, 600.00);

        assertTrue(conta.sacar(100));
    }

    @Test
    public void testSacarFalse() {
        Conta conta = new Conta(1, "Lucas", 250.12, 600.0);

        assertFalse(conta.sacar(400));
    }

    @Test
    public void testDepositarPadrao() {
        Conta conta = new Conta(1, "Lucas", 320, 600);

        assertTrue(conta.depositar(400));
    }

    @Test
    public void testDepositar0() {
        Conta conta = new Conta(1, "Lucas", 302, 500);

        assertFalse(conta.depositar(0));
    }

    @Test
    public void testDepositarNegativo() {
        Conta conta = new Conta(1, "Lucas", 302, 500);

        assertFalse(conta.depositar(-100));
    }

    @Test
    public void testTransferirTrue() {
        Conta remetente = new Conta(1, "Lucas", 300, 600);
        Conta destinatario = new Conta(2, "Torvalds", 0, 10000);

        assertTrue(remetente.transferir(destinatario, 150));
    }

    @Test
    public void testTransferirRemetentePobre() {
        Conta remetente = new Conta(1, "Lucas", 150, 600);
        Conta destinatario = new Conta(2, "Torvalds", 0, 10000);

        assertFalse(remetente.transferir(destinatario, 500));
    }

    @Test
    public void testTranferirNegativo() {
        Conta remetente = new Conta(1, "Lucas", 150, 600);
        Conta destinatario = new Conta(2, "Torvalds", 0, 10000);

        assertFalse(remetente.transferir(destinatario, -250));
    }

    @Test
    public void testComprarCreditoTrue() {
        Conta conta = new Conta(1, "Lucas", 200, 600);

        assertTrue(conta.comprarNoCredito(400));
    }

    @Test
    public void testComprarCredito0() {
        Conta conta = new Conta(1, "Lucas", 200, 600);

        assertFalse(conta.comprarNoCredito(0));
    }

    @Test
    public void testComprarCreditoAcimaLimite() {
        Conta conta = new Conta(1, "Lucas", 200, 500);

        assertFalse(conta.comprarNoCredito(1000));
    }

    @Test
    public void testComprarCreditoNegativo() {
        Conta conta = new Conta(1, "Lucas", 200, 600);

        assertFalse(conta.comprarNoCredito(-250));
    }
}
