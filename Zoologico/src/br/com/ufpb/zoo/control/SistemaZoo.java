package br.com.ufpb.zoo.control;

import java.util.HashMap;
import java.util.Map;

import br.com.ufpb.zoo.model.Animal;

public class SistemaZoo {
	private Map<String,Animal> animais;
	
	public SistemaZoo() {
		this.animais = new HashMap<String,Animal>();
	}
	public void adicionaAnimal(Animal m){
		animais.put(m.getNome()+m.getEspecie(), m);
	}
	
}
