package animal;

import interfaces.Domesticado;
import interfaces.Predador;
import interfaces.PresaCachorro;
import interfaces.PresaGato;

public class Gato extends Felino implements Predador<PresaGato>, PresaCachorro, Domesticado {

	public Gato(Integer velocidade) {
		super(velocidade); 
	}

	@Override
	public String emitirSom() {
		return "miau miau";
	}

}
