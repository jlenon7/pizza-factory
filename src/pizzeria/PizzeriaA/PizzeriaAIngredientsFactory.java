package factories;

import ingredientes.cobertura.Alho;
import ingredientes.cobertura.Cebola;
import ingredientes.cobertura.Cobertura;
import ingredientes.marisco.Marisco;
import ingredientes.marisco.MariscoCongelado;
import ingredientes.massa.Massa;
import ingredientes.massa.MassaFina;
import ingredientes.molho.Molho;
import ingredientes.molho.MolhoDeTomate;
import ingredientes.pepperoni.Pepperoni;
import ingredientes.pepperoni.PepperoniFatiado;
import ingredientes.queijo.Mussarela;
import ingredientes.queijo.Queijo;

import java.util.ArrayList;

public class PizzeriaAIngredientsFactory implements IngredientsFactory {
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
