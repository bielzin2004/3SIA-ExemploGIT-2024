package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;
import Elevador.Elevador;

class TestesCalculadora {

	@Test
	public void testeSomar() {
		
		double numero1 = 1;
		double numero2 = 2;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 3;
		double resultadoReal = calc.somar(numero1, numero2);
	
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	public void testeSubtrair() {
		
		double numero1 = 2;
		double numero2 = 1;
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 1;
		double resultadoReal = calc.subtrair(numero1, numero2);
	
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	

}
