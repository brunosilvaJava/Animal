package animal;

import interfaces.Domesticado;
import interfaces.Predador;
import interfaces.PresaCachorro;

public class Cachorro extends Canino implements Predador<PresaCachorro>, Domesticado {

	public Cachorro(Integer velocidade) {
		super(velocidade);
	}

	@Override
	public String emitirSom() {
		return "Au Au Au";
	}

}
