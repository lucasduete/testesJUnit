package io.github.lucasduete.exceptions;

public class InvalidChangeStateException extends RuntimeException {

    public InvalidChangeStateException() {

        super("Estado Ja Esta Definido");
    }

    public InvalidChangeStateException(String msg) {

        super(msg);
    }
}
