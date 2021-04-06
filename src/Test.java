import pizzas.Pizza;
import pizzeria.Pizzeria;

public class Test {
	public static void main(String[] args) throws Exception {

		Pizzeria pizzeria = new Pizzeria();
		Pizza pizza = pizzeria.orderPizza("portuguese");
		
		System.out.println("João Ordered " + pizza.getNome());
	}
}
