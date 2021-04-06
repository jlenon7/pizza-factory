package pizzeria;

import pizzas.Pepperoni;
import pizzas.Portuguese;
import pizzas.PortugueseFoz;
import pizzas.FourCheeses;

public class PizzeriaFactory {
    public Portuguese portuguese() {
        return new Portuguese();
    }

    public Pepperoni pepperoni() {
        return new Pepperoni();
    }

    public FourCheeses fourCheeses() {
        return new FourCheeses();
    }

    public PortugueseFoz portugueseFoz() {
        return new PortugueseFoz();
    }
}
