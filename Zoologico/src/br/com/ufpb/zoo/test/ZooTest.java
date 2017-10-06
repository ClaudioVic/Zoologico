/*package br.com.ufpb.zoo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Endereco;
import br.com.ufpb.zoo.model.Funcionario;

public class ZooTest {
    @Test
    public void test() {
    	
    	 * 
    	 * Teste de cadastro
    	 * 
    	 * 
        SistemaZoo sistema = new SistemaZoo();
        Animal animal = new Animal("cachorro", "Canis lupus", "18/03/2010", "teste");
        Endereco end = new Endereco("rua aride", "55900", "BA", "rT", "12", "casa");
        Funcionario f = new Funcionario("joao", "joao@", "123123", "123123", "99545622", end, "alimentador", "....");
        try {
          //  sistema.cadastrarAnimal(animal);
        } catch (AnimalJaExistenteException ex) {
            fail();
            ex.printStackTrace();
        }
        try {
			sistema.cadastrarFuncionario(f);
		} catch (FuncionarioJaExistenteException e) {
			fail();
			e.printStackTrace();
		}
        //
        //Cadastrar o mesmo animal , test
        //
        try {
			sistema.cadastrarAnimal(animal);
			fail();
		} catch (AnimalJaExistenteException e) {
			System.err.println(e.getMessage());
		}
        try {
			sistema.cadastrarFuncionario(f);
			fail();
		} catch (FuncionarioJaExistenteException e) {
			System.err.println(e.getMessage());
		}
        
         * 
         * Verificação das listas
         * 
         *  
        assertEquals(sistema.getAllAnimais().size(),1);
        assertEquals(sistema.getAllFuncionarios().size(),1);
        
    }
}
*/