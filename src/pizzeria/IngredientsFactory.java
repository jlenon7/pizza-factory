package pizzeria;

import ingredients.cobertura.Cobertura;
import ingredients.marisco.Marisco;
import ingredients.massa.Massa;
import ingredients.molho.Molho;
import ingredients.pepperoni.Pepperoni;
import ingredients.queijo.Queijo;

import java.util.ArrayList;

public interface IngredientsFactory {
	public Massa criarMassa();
	public Molho criarMolho();
	public Queijo criarQueijo();
	public ArrayList<Cobertura> criarCobertura();
	public Pepperoni criarPepperoni();
	public Marisco criarMarisco();
}
