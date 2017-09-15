package br.com.ufpb.zoo.test;

import org.junit.Test;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.model.Animal;

public class ZooTest {

	@Test
	public void test() {
		SistemaZoo sistema = new SistemaZoo();
		Animal animal = new Animal("cachorro","Canis lupus","18/03/2010","teste");
		sistema.adicionaAnimal(animal);
		
	}

}
