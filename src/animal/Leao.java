package animal;

import interfaces.Predador;
import interfaces.PresaLeao;

public class Leao extends Felino implements Predador<PresaLeao> {

	public Leao(Integer velocidade) {
		super(velocidade);
	}

	@Override
	public String emitirSom() {
		return "RUUAAAAAUUUARR";
	}

}
