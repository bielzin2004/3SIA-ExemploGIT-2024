package Pessoa;

public class Pessoa {

	//Variáveis de instância
	private String nome;
	private double peso;
	
	//Construtor
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	//Get e Set nome
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Get e Set peso
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
