package animal;

public class Rato extends Roedor {

	public Rato(Integer velocidade) {
		super(velocidade);
	}

	@Override
	public String emitirSom() {
		return "sicss sicss";
	}

}
