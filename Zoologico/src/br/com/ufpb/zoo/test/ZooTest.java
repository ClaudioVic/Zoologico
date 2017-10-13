package br.com.ufpb.zoo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.exceptions.AmbienteJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.BlocoJaExistenteException;
import br.com.ufpb.zoo.exceptions.CorredorJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.model.Ambiente;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Bloco;
import br.com.ufpb.zoo.model.Corredor;
import br.com.ufpb.zoo.model.Endereco;
import br.com.ufpb.zoo.model.Funcionario;

public class ZooTest {
	@Test
	public void test() {
		Endereco endereco = new Endereco("rua A", "44900-000", "Bahia", "irece", "1120", "casa");

		Funcionario funcionario = new Funcionario("Robson", "robson@hotmail.com", "12345678", "123321321", "999545622",
				endereco, "alimentador", "funcionario bom");

		Bloco bloco = new Bloco("bloco1", funcionario, "Bloco dos leoes");
		Corredor corredor = new Corredor("corredor1", bloco);
		Ambiente ambiente = new Ambiente("jaula dos tigres", 12, "tigres", corredor);
		Animal animal = new Animal("tigre1", "tigre", (new Date()).toString(), "carnivoro", ambiente);
		SistemaZoo sistema = new SistemaZoo();
		/*
		 * Teste de cadastrar
		 * 
		 */
		try {
			sistema.cadastraBloco(bloco);
		} catch (BlocoJaExistenteException e) {
			fail();
		}
		try {
			sistema.cadastrarAmbiente(ambiente);
		} catch (AmbienteJaExistenteException e) {
			fail();
		}

		try {
			sistema.cadastrarCorredor(corredor);
		} catch (CorredorJaExistenteException e) {
			fail();
		}
		try {
			sistema.cadastrarAnimal(animal);
		} catch (AnimalJaExistenteException e) {
			fail();
		}
		try {
			sistema.cadastrarFuncionario(funcionario);
		} catch (FuncionarioJaExistenteException e) {
			fail();
		}
		/*
		 * Testes das listas
		 * 
		 */
		assertEquals(sistema.getAllAnimais().size(), 1);
		assertEquals(sistema.getAllBlocos().size(), 1);
		assertEquals(sistema.getAllAmbientes().size(), 1);
		assertEquals(sistema.getAllHalls().size(), 1);
		assertEquals(sistema.getAllOfficials().size(), 1);
		/*
		 * Teste especificos
		 * 
		 */

		assertEquals("tigre1", sistema.getAllAnimais().get(0).getNome());

		/*
		 * 
		 * Testes exceção
		 * 
		 */
		try {
			sistema.cadastraBloco(bloco);
			fail();
		} catch (BlocoJaExistenteException e) {
			System.err.println(e.getMessage());
		}
		try {
			sistema.cadastrarAmbiente(ambiente);
			fail();
		} catch (AmbienteJaExistenteException e) {
			System.err.println(e.getMessage());
		}
		try {
			sistema.cadastrarCorredor(corredor);
			fail();
		} catch (CorredorJaExistenteException e) {
			System.err.println(e.getMessage());
		}
		try {
			sistema.cadastrarAnimal(animal);
			fail();
		} catch (AnimalJaExistenteException e) {
			System.err.println(e.getMessage());
		}
		try {
			sistema.cadastrarFuncionario(funcionario);
			fail();
		} catch (FuncionarioJaExistenteException e) {
			System.err.println(e.getMessage());
		}
		/*
		 * 
		 * Teste arquivo
		 * 
		 * */
		Gravador<Animal> gravador1 = new Gravador("animais2.dat");
		Gravador<Bloco> gravador2 = new Gravador("blocos2.dat");
		Gravador<Ambiente> gravador3 = new Gravador("ambientes2.dat");
		Gravador<Funcionario> gravador4 = new Gravador("funcionarios2.dat");
		Gravador<Corredor> gravador5 = new Gravador("corredores2.dat");
		
		try {
			gravador1.gravar(sistema.getAllAnimais());
			gravador2.gravar(sistema.getAllBlocos());
			gravador3.gravar(sistema.getAllAmbientes());
			gravador4.gravar(sistema.getAllOfficials());
			gravador5.gravar(sistema.getAllHalls());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
