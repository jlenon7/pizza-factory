package pizzas;

import ingredients.marisco.Marisco;
import ingredients.massa.Massa;
import ingredients.molho.Molho;
import ingredients.queijo.Queijo;

import java.util.ArrayList;

public abstract class Pizza {
	protected String nome;
	protected Massa massa;
	protected Molho molho;
	protected Queijo queijo;
	protected Marisco marisco;
	protected Pepperoni pepperoni;
	protected ArrayList<String> cobertura = new ArrayList<String>();

	public abstract void preparar();

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
