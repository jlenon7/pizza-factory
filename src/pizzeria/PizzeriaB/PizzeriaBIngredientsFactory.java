package pizzeria.PizzeriaB;

import ingredients.cobertura.Alho;
import ingredients.cobertura.Cebola;
import ingredients.cobertura.Cobertura;
import ingredients.marisco.Marisco;
import ingredients.marisco.MariscoCongelado;
import ingredients.massa.Massa;
import ingredients.massa.MassaFina;
import ingredients.molho.Molho;
import ingredients.molho.MolhoDeTomate;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.PepperoniFatiado;
import ingredients.queijo.Mussarela;
import ingredients.queijo.Queijo;
import pizzeria.IngredientsFactory;

import java.util.ArrayList;

public class PizzeriaBIngredientsFactory implements IngredientsFactory {
    @Override
    public Massa criarMassa() {
        return new MassaFina();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoDeTomate();
    }

    @Override
    public Queijo criarQueijo() {
        return new Mussarela();
    }

    @Override
    public ArrayList<Cobertura> criarCobertura() {
        ArrayList<Cobertura> cobertura = new ArrayList<Cobertura>();

        cobertura.add(new Alho());
        cobertura.add(new Cebola());
        return cobertura;
    }

    @Override
    public Pepperoni criarPepperoni() {
        return new PepperoniFatiado();
    }

    @Override
    public Marisco criarMarisco() {
        return new MariscoCongelado();
    }
}
