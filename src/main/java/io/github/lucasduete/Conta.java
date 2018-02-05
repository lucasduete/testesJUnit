package io.github.lucasduete;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limiteCredito;

    public Conta(int numero, String titular, double saldo, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

    public boolean sacar(double grana) {

        if (saldo >= grana) {
            saldo = saldo - grana;
            return true;
        } else
            return false;
    }

    public boolean depositar(double grana) {

        if (grana <= 0)
            return false;
        else {
            saldo = saldo + grana;
            return true;
        }
    }

    public synchronized boolean transferir(Conta destinatario, double grana) {

        if (grana > 0) {
            if (grana <= saldo) {
                saldo = saldo - grana;
                destinatario.saldo = destinatario.saldo + grana;
                return true;
            }
        }

        return false;
    }

    public boolean comprarNoCredito(double preco) {

        if (preco > 0) {
            if (preco <= limiteCredito) {
                limiteCredito = limiteCredito - preco;
                return true;
            }
        }

        return false;
    }
}
