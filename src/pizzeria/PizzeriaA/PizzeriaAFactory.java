package pizzeria.PizzeriaA;

import pizzas.Pepperoni;
import pizzas.Portuguese;

public class PizzeriaAFactory {
    public Portuguese portuguese() {
        return new Portuguese(new PizzeriaAIngredientsFactory());
    }

    public Pepperoni pepperoni() {
        return new Pepperoni(new PizzeriaAIngredientsFactory());
    }
}
