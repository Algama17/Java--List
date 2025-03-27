package com.alberto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

class AppTest {
    private GestorDiasSemanas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDiasSemana();
    }

    @Test
    void testCrearListaDias(){
        gestor.testCrearListaDias()
        List<String> dias = gestor.obtenerDiasSemana();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
    }

}
