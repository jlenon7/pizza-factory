package pizzeria;

import pizzas.Pizza;
import java.lang.reflect.Method;

public class PizzeriaB extends AbstractPizzeria {
    protected String[] menu() {
        Method[] methods = PizzeriaBFactory.class.getMethods();
        String[] menu = new String[methods.length];

        for (int i = 0; i < methods.length; i++) {
            menu[i] = methods[i].getName();
        }

        return menu;
    }

    protected Pizza createPizza(String type) throws Exception {
        Method method = PizzeriaBFactory.class.getMethod(this.verifyMenu(type));

        return (Pizza) method.invoke(new PizzeriaBFactory());
    }
}
