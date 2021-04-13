package pizzas;

import pizzeria.IngredientsFactory;

public class Pepperoni extends Pizza{
	IngredientsFactory ingredients;

	public Pepperoni(IngredientsFactory ingredients) {
		this.setNome("Pepperoni");

		this.ingredients = ingredients;
	}

	public void preparar() {
		System.out.println("===================================");
		System.out.println("\nPreparando " + this.nome);

		this.massa = ingredients.criarMassa();
		System.out.println("\nMassa: " + this.massa.getNome());

		this.molho = ingredients.criarMolho();
		System.out.println("\nMolho: " + this.molho.getNome());

		this.queijo = ingredients.criarQueijo();
		System.out.println("\nQueijo: " + this.queijo.getNome());
	}
}
