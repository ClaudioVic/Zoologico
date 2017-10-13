package br.com.ufpb.zoo.control;

import java.io.IOException;
import java.util.List;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.exceptions.BlocoJaExistenteException;
import br.com.ufpb.zoo.exceptions.BlocoNaoExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Bloco;
import br.com.ufpb.zoo.model.Funcionario;

import br.com.ufpb.zoo.exceptions.*;
import br.com.ufpb.zoo.model.*;

/**
 *
 * @author Claudio Victor
 * @author robson
 * 
 */

public class SistemaZoo {

    private GerenteAnimal gerenteAnimal;
    private GerenteFuncionario gerenteFuncionario;
    private GerenteBloco gerenteBloco;
    private GerenteCorredor gerenteCorredor;
    private GerenteAmbiente gerenteAmbiente;

    public SistemaZoo() {
        this.gerenteAnimal = new GerenteAnimal();
        this.gerenteFuncionario = new GerenteFuncionario();
        this.gerenteBloco = new GerenteBloco();
        this.gerenteCorredor = new GerenteCorredor();
        this.gerenteAmbiente = new GerenteAmbiente();
    }

    /**
     * Modulo Animais
     */
    
    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException, IOException {
        gerenteAnimal.cadastrarAnimal(m);
    }

    public List<Animal> getAllAnimais() {
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

    public List<Funcionario> getAllOfficials() {
        return this.gerenteFuncionario.getAllOfficials();
    }

    public Funcionario pesquisaFuncionario(String email) throws FuncionarioNaoExisteException {
        return this.gerenteFuncionario.pesquisaFuncionario(email);
    }
    /*
    public void deletarFuncionario(Funcionario f) throws FuncionarioNaoExisteException {
        this.gerenteFuncionario.deletarFuncionario(f);
    }  */
    
    /**
     * Modulo Corredor
     * 
     */
    public void cadastrarCorredor(Corredor c) throws CorredorJaExistenteException{
        this.gerenteCorredor.cadastrarCorredor(c);
    }
    /**
     * 
     * Gerente de Bloco
     * 
     */
    public void cadastraBloco(Bloco b) throws BlocoJaExistenteException{
        this.gerenteBloco.cadastrarBloco(b);
    }
    public Bloco pesquisaBloco(String nome) throws BlocoNaoExistenteException{
        return this.gerenteBloco.pesquisarBloco(nome);
    }
    public List<Bloco> getAllBlocos(){
        return this.gerenteBloco.getAllBlocos();

    }
    public List<Corredor> getAllHalls(){
        return this.gerenteCorredor.getAllHalls();
    }
    
    public Corredor pesquisaCorredor(String nome) throws CorredorNaoExisteException {
        return this.gerenteCorredor.pesquisaCorredor(nome);
    }
    
    /**
     * Modulo Ambiente
     * 
     */
    public void cadastrarAmbiente(Ambiente a) throws AmbienteJaExistenteException{
        this.gerenteAmbiente.cadastrarAmbiente(a);
    }
    
    public List<Ambiente> getAllEnviroment(){
        return this.gerenteAmbiente.getAllEnviroment();
    }
    
    public Ambiente pesquisaAmbiente(String nome, String especie) throws AmbienteNaoExisteException {
        return this.gerenteAmbiente.pesquisaAmbiente(nome,especie);
    }
}
