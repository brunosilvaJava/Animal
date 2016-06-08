package interfaces;

import animal.Animal;

public interface Predador<T extends Presa> {

	default boolean cacar(T presa){
		
		Animal predador = (Animal) this;
		
		if(!presa.fugir(this)){
			System.out.println("O "+this.toString()+" capturou o "+presa.toString()+": "+predador.emitirSom());
			return true;
		}
		
		return false;
	}
	
}
