package com.example.ejercicioDevops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class OperacionControllerTest {
	
	OperacionController OpC = new OperacionController();
	
	
	@Test
	void testSumar() {
		int resultado = OpC.sumar(3, 2);
        assertEquals(5, resultado);
        assertNotEquals(4, resultado);
	}

	@Test
	void testMultiplicar() {
		int resultado = OpC.multiplicar(2, 3);
        assertEquals(6, resultado);
        assertNull(null);
        assertNotNull(resultado);
	}

}
