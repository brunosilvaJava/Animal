package interfaces;

import animal.Animal;

public interface Presa {

	default boolean fugir(Predador predador){
		
		Animal pred = (Animal) predador;
		Animal presa = (Animal) this;
		
		if(presa.getVelocidade() >= pred.getVelocidade()){			
			System.out.println("O "+this.toString()+" fugiu do "+pred.toString()+": "+presa.emitirSom());
			return true;
		}

		return false;
		
	}
	
}
