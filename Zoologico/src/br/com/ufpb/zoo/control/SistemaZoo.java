package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.AmbienteJaExistenteException;
import br.com.ufpb.zoo.exceptions.AmbienteNaoExisteException;
import java.io.IOException;
import java.util.List;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.exceptions.BlocoJaExistenteException;
import br.com.ufpb.zoo.exceptions.BlocoNaoExistenteException;
import br.com.ufpb.zoo.exceptions.CorredorJaExistenteException;
import br.com.ufpb.zoo.exceptions.CorredorNaoExisteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Bloco;
import br.com.ufpb.zoo.model.Funcionario;

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
    
    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException{
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
    public List<Animal> pesquisaAnimaisDeUmBloco(String bloco){
        return this.gerenteAnimal.pesquisaAnimaisDeUmBloco(bloco);
    }
     public List<Animal> pesquisaAnimaisDeUmCorredor(String corredor){
         return this.gerenteAnimal.pesquisaAnimaisDeUmCorredor(corredor);
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

    public Funcionario pesquisaFuncionario(String nome) throws FuncionarioNaoExisteException {
        return this.gerenteFuncionario.pesquisaFuncionario(nome);
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
    
    public List<Ambiente> getAllAmbientes(){
        return this.gerenteAmbiente.getAllAmbientes();
    }
    
    public Ambiente pesquisaAmbiente(String nome) throws AmbienteNaoExisteException {
        return this.gerenteAmbiente.pesquisaAmbiente(nome);
    }
    
//    Recuperar listas
    public void salvarNoArquivo() throws IOException{
        this.gerenteAnimal.salvarAnimais();
        this.gerenteFuncionario.salvarFuncionarios();
        this.gerenteBloco.salvarBlocos();
        this.gerenteAmbiente.salvarAmbiente();
        this.gerenteCorredor.salvarCorredor();
    }
    public void recuperaDoArquivo() throws IOException{
        this.gerenteAnimal.recuperarAnimais();
        this.gerenteBloco.recuperarBlocos();
        this.gerenteFuncionario.recuperarFuncionarios();
        this.gerenteAmbiente.recuperarAmbientes();
        this.gerenteCorredor.recuperarCorredores();
    }
}
