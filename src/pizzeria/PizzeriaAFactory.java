package pizzeria;

import pizzas.Pepperoni;
import pizzas.Portuguese;

public class PizzeriaAFactory {
    public Portuguese portuguese() {
        return new Portuguese();
    }

    public Pepperoni pepperoni() {
        return new Pepperoni();
    }
}
