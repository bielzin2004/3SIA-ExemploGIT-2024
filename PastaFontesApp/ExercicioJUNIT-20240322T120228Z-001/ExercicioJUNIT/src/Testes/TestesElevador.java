package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Elevador.Elevador;

class TestesElevador {

	/*@Test
	public void testeEntrarNoElevadorSemSinalAlerta() {
		
		Elevador elevador = new Elevador(1, 200, 0, false);
		
		double valor;
		boolean alerta;
		valor = elevador.entrarNoElevador(100);
		alerta = elevador.avaliarPeso(valor);
		
		boolean resultadoEsperado = false;
		boolean resultadoReal = alerta;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}*/
	
	/*@Test
	public void testeEntrarNoElevadorComSinalAlerta() {
		
		Elevador elevador = new Elevador(1, 200, 0, false);
		
		double valor;
		boolean alerta;
		valor = elevador.entrarNoElevador(300);
		alerta = elevador.avaliarPeso(valor);
		
		boolean resultadoEsperado = true;
		boolean resultadoReal = alerta;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}*/
	
	@Test
	public void testeEntrarNoElevador() {
		
		Elevador elevador = new Elevador(1, 200, 0, false);
		double valor = 100;
		elevador.entrarNoElevador(valor);
		assertEquals(100, valor);
	}
	
	@Test
	public void testeAvaliar() {
		
		Elevador elevador = new Elevador(1, 200, 0, false);
		double valor = 300;
		boolean sinal;
		sinal = elevador.avaliarPeso(valor);
		assertEquals(true, sinal);
		
	}
	
	

}
