import pizzas.Pizza;
import pizzeria.PizzeriaA.PizzeriaA;
import pizzeria.PizzeriaB.PizzeriaB;

public class Test {
	public static void main(String[] args) throws Exception {
		PizzeriaA pizzeriaA = new PizzeriaA();
		Pizza portuguese = pizzeriaA.orderPizza("portuguese");
		
		log("João Ordered " + portuguese.getNome());

		PizzeriaB pizzeriaB = new PizzeriaB();
		Pizza fourCheeses = pizzeriaB.orderPizza("fourCheeses");

		log("João Ordered " + fourCheeses.getNome());
	}

	public static void log(String message) {
		System.out.println(message);
	}
}
