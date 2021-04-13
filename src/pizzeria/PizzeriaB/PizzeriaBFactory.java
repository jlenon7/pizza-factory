package pizzeria.PizzeriaB;

import pizzas.FourCheeses;
import pizzas.PortugueseFoz;

public class PizzeriaBFactory {
    public FourCheeses fourCheeses() {
        return new FourCheeses();
    }

    public PortugueseFoz portugueseFoz() {
        return new PortugueseFoz();
    }
}
