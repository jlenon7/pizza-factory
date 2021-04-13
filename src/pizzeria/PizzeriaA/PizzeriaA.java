package pizzeria.PizzeriaA;

import pizzas.Pizza;
import pizzeria.AbstractPizzeria;

import java.lang.reflect.Method;

public class PizzeriaA extends AbstractPizzeria {
	protected String[] menu() {
		Method[] methods = PizzeriaAFactory.class.getMethods();
		String[] menu = new String[methods.length];

		for (int i = 0; i < methods.length; i++) {
			menu[i] = methods[i].getName();
		}

		return menu;
	}

	protected Pizza createPizza(String type) throws Exception {
		Method method = PizzeriaAFactory.class.getMethod(this.verifyMenu(type));

		return (Pizza) method.invoke(new PizzeriaAFactory());
	}
}
