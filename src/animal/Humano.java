package animal;

import java.util.List;

import interfaces.Domesticado;
import interfaces.Predador;
import interfaces.PresaHumano;

public class Humano extends Primata implements Predador<PresaHumano>{

	private String nome;
	private Integer idade;

	private List<Domesticado> animalDomesticado;
	
	public Humano(){
		
	}
	
	public Humano(Integer velocidade) {
		super(velocidade);
	}

	@Override
	public String emitirSom() {
		return "Oi!";
	}
	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public List<Domesticado> getAnimalDomesticado() {
		return animalDomesticado;
	}

	public void setAnimalDomesticado(List<Domesticado> animalDomesticado) {
		this.animalDomesticado = animalDomesticado;
	}

	
}
