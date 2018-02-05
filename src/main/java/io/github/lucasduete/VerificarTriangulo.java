package io.github.lucasduete;

import io.github.lucasduete.exceptions.InvalidNumberException;

public class VerificarTriangulo {

    public boolean verificaExistencia(int a, int b, int c) {

        if ((a <= 0) || (b <= 0) || c <= 0)
            throw new InvalidNumberException("Tamanho dos Lados Invalidos");

        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;

        return false;
    }

    public String classificaTriangulo(int a, int b, int c) {

        if ((a <= 0) || (b <= 0) || c <= 0)
            throw new InvalidNumberException("Tamanho dos Lados Invalidos");

        if (verificaExistencia(a,b,c)) {
            if ((a == b) && (b == c)) {
                return "Triângulo Equilátero";
            } else if ((a != b) && (a != c) && (b != c)) {
                return "Triângulo Escaleno";
            } else {
                return "Triângulo Isóceles";
            }
        }

        return "Nao e um Triângulo";
    }
}
