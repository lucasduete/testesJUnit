package io.github.lucasduete.exceptions;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException() {
        super("O Numero e Negativo ou 0");
    }

    public InvalidNumberException(String msg) {
        super(msg);
    }
}
