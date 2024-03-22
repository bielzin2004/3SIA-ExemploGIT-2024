package Elevador;

import Calculadora.Calculadora;

public class Elevador {

	//Variáveis de instância
	private int id;
	private double cargaMaxima;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	//Construtor
	public Elevador(int id, double cargaMaxima, double cargaAtual, boolean sinalAlerta) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.cargaAtual = cargaAtual;
		this.sinalAlerta = sinalAlerta;
	}

	//Get e Set ID
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//Get e Set Carga Máxima
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	//Get e Set Carga Atual
	public double getCargaAtual() {
		return cargaAtual;
	}
	
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	
	//Get (is) e Set Sinal Alerta
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	
	//Método de entrada no elevador
	public double entrarNoElevador(double peso) {
		
		Calculadora calc = new Calculadora();
		
		cargaAtual = calc.somar(cargaAtual, peso);
		
		return cargaAtual;
	}
	
	//Método para sair do elevador
	public double sairDoElevador(double peso) {
		
		Calculadora calc = new Calculadora();
		
		cargaAtual = calc.subtrair(cargaAtual, peso);
		
		return cargaAtual;
	}
	
	//Método para emitir o sinal de alerta
	public boolean avaliarPeso(double peso) {
		
		if(cargaAtual > 200)
			sinalAlerta = true;
		else
			sinalAlerta = false;
		
		return sinalAlerta;
		
	}
	
}
