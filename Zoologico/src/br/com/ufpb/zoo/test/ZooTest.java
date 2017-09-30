package br.com.ufpb.zoo.test;

import org.junit.Test;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Endereco;
import br.com.ufpb.zoo.model.Funcionario;
import static org.junit.Assert.*;

public class ZooTest {
    @Test
    public void test() {
        SistemaZoo sistema = new SistemaZoo();
        Animal animal = new Animal("cachorro", "Canis lupus", "18/03/2010", "teste");
        Endereco end = new Endereco("rua aride", "55900", "BA", "rT", "12", "casa");
        Funcionario f = new Funcionario("joao", "joao@", "123123", "123123", "99545622", end, "alimentador", "....");
        try {
            sistema.adicionaAnimal(animal);
        } catch (AnimalJaExistenteException ex) {
            fail();
        }
    }
}
