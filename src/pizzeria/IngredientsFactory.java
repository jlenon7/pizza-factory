package factories;

import ingredientes.cobertura.Cobertura;
import ingredientes.marisco.Marisco;
import ingredientes.massa.Massa;
import ingredientes.molho.Molho;
import ingredientes.pepperoni.Pepperoni;
import ingredientes.queijo.Queijo;

import java.util.ArrayList;

public interface IngredientsFactory {
	public Massa criarMassa();
	public Molho criarMolho();
	public Queijo criarQueijo();
	public ArrayList<Cobertura> criarCobertura();
	public Pepperoni criarPepperoni();
	public Marisco criarMarisco();
}
