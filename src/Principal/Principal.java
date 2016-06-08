package Principal;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cachorro;
import animal.Felino;
import animal.Gato;
import animal.Humano;
import animal.Rato;
import interfaces.Domesticado;
import interfaces.PresaGato;

public class Principal {

	public static void main(String[] args) {
		
		Gato gato = new Gato(15);
		Cachorro cachorro = new Cachorro(15);
		Rato rato = new Rato(15);
		Humano humano = new Humano();
		
		Animal a = gato;
		Felino f = (Felino) a;	
		PresaGato pg = rato; // = (PresaGato) cachorro;
		
		/*
		boolean b; 
		
		System.out.println(gato instanceof Animal); // true
		System.out.println(cachorro instanceof Animal); // true
		System.out.println(a instanceof Canino); // false
		System.out.println(gato instanceof Felino); // true
		System.out.println(f instanceof Gato); // true
		System.out.println(humano instanceof Primata); // true
		//System.out.println(humano instanceof Felino); // true
		
		
		// Interface

		System.out.println(pg instanceof Cachorro); // false - SEM ERRO DE COMPILAÇÃO
		System.out.println(cachorro instanceof PresaGato); // true - SEM ERRO DE COMPILAÇÃO
		System.out.println(rato instanceof PresaGato); // true
		
		
		*/
		gato.cacar(rato);
		cachorro.cacar(gato);
		
		List<Domesticado> animaisDomesticados = new ArrayList<Domesticado>();
		
		animaisDomesticados.add(gato);
		animaisDomesticados.add(cachorro);
		
		humano.setAnimalDomesticado(animaisDomesticados);
		
		System.out.print("\nAnimais domésticos: ");
		
		for (Domesticado domesticado : animaisDomesticados) {
			
			System.out.print(domesticado.toString() + " - ");
			
		}
		
		
		
	}

}
