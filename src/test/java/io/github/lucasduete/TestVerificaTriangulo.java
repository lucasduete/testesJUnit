package io.github.lucasduete;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestVerificaTriangulo {

    @Test
    public void testVerificaExistenciaTrianguloValido() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertTrue(verificar.verificaExistencia(5, 6, 10));
    }

    @Test
    public void testVerificaExistenciaTrianguloInvalido() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertFalse(verificar.verificaExistencia(5, 6, 20));
    }

    @Test
    public void testClassificarTrianguloInvalido() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Nao e um Triângulo",
                verificar.classificaTriangulo(5, 6, 20));
    }

    @Test
    public void testClassicarTrianguloEquilatero1() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Triângulo Equilátero",
                verificar.classificaTriangulo(6, 6, 6));
    }

    @Test
    public void testClassificarTrianguloIsoceles1() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Triângulo Isóceles",
                verificar.classificaTriangulo(6, 6, 10));
    }

    @Test
    public void testClassificarTrianguloIsoceles2() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Triângulo Isóceles",
                verificar.classificaTriangulo(6, 10, 6));
    }

    @Test
    public void testClassificarTrianguloIsoceles3() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Triângulo Isóceles",
                verificar.classificaTriangulo(10, 6, 6));
    }

    @Test
    public void testClassificarTrianguloEscaleno() {
        VerificarTriangulo verificar = new VerificarTriangulo();

        assertEquals("Triângulo Escaleno",
                verificar.classificaTriangulo(6, 7, 8));
    }
}
