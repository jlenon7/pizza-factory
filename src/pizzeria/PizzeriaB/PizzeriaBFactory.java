package pizzeria.PizzeriaB;

import pizzas.FourCheeses;
import pizzas.PortugueseFoz;
import pizzeria.IngredientsFactory;

public class PizzeriaBFactory {
    public FourCheeses fourCheeses() {
        return new FourCheeses(new PizzeriaBIngredientsFactory());
    }

    public PortugueseFoz portugueseFoz() {
        return new PortugueseFoz(new PizzeriaBIngredientsFactory());
    }
}
