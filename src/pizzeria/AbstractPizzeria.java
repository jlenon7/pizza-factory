package pizzeria;
import pizzas.Pizza;

import java.util.Arrays;

public abstract class AbstractPizzeria {
	public Pizza orderPizza(String type) throws Exception {
		Pizza pizza = createPizza(type);

		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}

	public String verifyMenu(String type) throws Exception {
		if (Arrays.asList(this.menu()).contains(type)) {
			return type;
		}

		throw new Exception("Pizza type does not exists!");
	}

	protected abstract String[] menu();
	protected abstract Pizza createPizza(String type) throws Exception;
}
