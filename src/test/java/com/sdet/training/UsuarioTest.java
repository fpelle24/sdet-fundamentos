package com.sdet.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void testEsMayorDeEdad() {
        Usuario usuario = new Usuario("Juan", 20);
        assertTrue(usuario.esMayorDeEdad());
    }

    @Test
    void testNoEsMayorDeEdad() {
        Usuario usuario = new Usuario("Pedro", 15);
        assertFalse(usuario.esMayorDeEdad());
    }

    @Test
    void testGetNombre() {
        Usuario usuario = new Usuario("Lucía", 25);
        assertEquals("Lucía", usuario.getNombre());
    }

    @Test
    void testGetEdad() {
        Usuario usuario = new Usuario("Sofía", 30);
        assertEquals(30, usuario.getEdad());
    }
}