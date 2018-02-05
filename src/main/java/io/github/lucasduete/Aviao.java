package io.github.lucasduete;

import io.github.lucasduete.exceptions.InvalidChangeStateException;

public class Aviao {

    private boolean ligado;
    private boolean voando;
    private float potencia;
    private float velocidade;

    private int FORCA_AVIAO = 237;

    public Aviao() {
        ligado = false;
        voando = false;
        potencia = 1237;
        velocidade = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isVoando() {
        return voando;
    }

    public float getPotencia() {
        return potencia;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void ligar() {

        if (!ligado)
            ligado = true;
        else
            throw new InvalidChangeStateException("O Aviao Ja Esta Ligado");
    }

    public void desligar() {

        if (ligado) {
            if (voando) {
                throw new InvalidChangeStateException("O Aviao Esta Voando, Nao e Possivel Desligar");
            } else {
                ligado = false;
            }
        } else {
            throw new InvalidChangeStateException("O Aviao Ja Esta Desligado");
        }

    }

    public void acelerar() {

        if (!ligado)
            throw new InvalidChangeStateException("O Aviao Esta Desligado");

        velocidade = velocidade + (potencia / FORCA_AVIAO);
    }

    public void desacelerar() {

        if (!ligado)
            throw new InvalidChangeStateException("O Aviao Esta Desligado");

        if (velocidade <= 0)
            throw new InvalidChangeStateException("O Aviao Ja Esta Parado");

        velocidade = velocidade - (potencia / FORCA_AVIAO);
    }

    public void voar() {

        if (!ligado)
            throw new InvalidChangeStateException("O Aviao Esta Desligado");

        if (!voando)
            voando = true;
        else
            throw new InvalidChangeStateException("O Aviao Ja Esta Voando");
    }

    public void pousar() {

        if (!ligado)
            throw new InvalidChangeStateException("O Aviao Esta Desligado");

        if (voando)
            voando = false;
        else
            throw new InvalidChangeStateException("O Aviao Ja Foi Pousado");
    }
}
