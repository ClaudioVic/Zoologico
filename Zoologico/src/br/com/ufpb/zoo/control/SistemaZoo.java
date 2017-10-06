package br.com.ufpb.zoo.control;

import java.io.IOException;
import java.util.Collection;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Funcionario;

public class SistemaZoo {

    private GerenteAnimal gerenteAnimal;
    private GerenteFuncionario gerenteFuncionario;

    public SistemaZoo() {
        this.gerenteAnimal = new GerenteAnimal();
        this.gerenteFuncionario = new GerenteFuncionario();
    }

    /**
     * Modulo Animais
     * @throws IOException 
     *
     */
    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException, IOException {
        gerenteAnimal.cadastrarAnimal(m);
    }

    public Collection<Animal> getAllAnimais() {
        return gerenteAnimal.getAllAnimais();
    }

    public Animal pesquisaAnimal(String nome, String especie) throws AnimalNaoExisteException {
        return this.gerenteAnimal.pesquisaAnimal(nome, especie);
    }

    public void deletarAnimal(Animal m) throws AnimalNaoExisteException {
        this.gerenteAnimal.deletarAnimal(m);
    }

    /**
     * Modulo Funcionario
     *
     */
    public void cadastrarFuncionario(Funcionario f) throws FuncionarioJaExistenteException {
        this.gerenteFuncionario.cadastrarFuncionario(f);
    }

    public Collection<Funcionario> getAllFuncionarios() {
        return this.gerenteFuncionario.getAllFuncionarios();
    }

    public Funcionario pesquisaFuncionario(String email) throws FuncionarioNaoExisteException {
        return this.gerenteFuncionario.pesquisaFuncionario(email);
    }

    public void deletarFuncionario(Funcionario f) throws FuncionarioNaoExisteException {
        this.gerenteFuncionario.deletarFuncionario(f);
    }

}
