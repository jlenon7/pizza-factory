import pizzas.Pizza;
import pizzeria.PizzeriaA;
import pizzeria.PizzeriaB;

public class Test {
	public static void main(String[] args) throws Exception {

		PizzeriaA pizzeriaA = new PizzeriaA();
		Pizza portuguese = pizzeriaA.orderPizza("portuguese");
		
		System.out.println("João Ordered " + portuguese.getNome());

		PizzeriaB pizzeriaB = new PizzeriaB();
		Pizza fourCheeses = pizzeriaB.orderPizza("fourCheeses");

		System.out.println("João Ordered " + fourCheeses.getNome());
	}
}
