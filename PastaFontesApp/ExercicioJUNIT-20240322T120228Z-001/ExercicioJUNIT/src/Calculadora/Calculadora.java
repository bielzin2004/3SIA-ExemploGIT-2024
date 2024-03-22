package Calculadora;

public class Calculadora {

	//Variável de instância
	private double resultado;
	
	//Método de soma
	public double somar(double valor1, double valor2) {
		
		resultado = valor1 + valor2;
		
		return resultado;
	}
	
	//Método de subtração
	public double subtrair(double valor1, double valor2) {
		
		resultado = valor1 - valor2;
		
		return resultado;
	}
	
}
