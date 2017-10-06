package br.com.ufpb.zoo.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.model.Animal;

public class GravaTest {

	@Test
	public void test() {
		 SistemaZoo sistema = new SistemaZoo();
	     Animal animal = new Animal("cachorro", "Canis lupus", "18/03/2010", "teste");
	     try {
			sistema.cadastrarAnimal(animal);
		} catch (AnimalJaExistenteException | IOException e) {
			e.printStackTrace();
		}
	}

}
