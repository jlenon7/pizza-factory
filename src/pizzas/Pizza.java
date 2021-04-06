package pizzas;

import java.util.ArrayList;

public abstract class Pizza {
	protected String nome;
	protected String massa;
	protected String molho;
	protected ArrayList<String> cobertura = new ArrayList<String>();
	
	public void preparar() {
		System.out.println("Preparando a pizza " + this.nome);
		System.out.println("\nMassa: " + this.massa);
		System.out.println("\nMolho: " + this.molho);
		System.out.println("\nCobertura: ");

		for (String s : this.cobertura) {
			System.out.println("\n +" + s);
		}
	}

	public void assar() {
		System.out.println("Assando a pizza " + this.nome);
	}
	
	public void cortar() {
		System.out.println("Cortando a pizza " + this.nome);
	}
	
	public void embalar() {
		System.out.println("Embalando a pizza "+ this.nome);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
