/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.model.Funcionario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author robson
 */
public class GerenteFuncionario {

    private Map<String, Funcionario> funcionarios;
    private Gravador<Funcionario> gravador;
    
    public GerenteFuncionario(){        
        this.gravador = new Gravador("funcionarios.dat");
        this.funcionarios = new HashMap<String,Funcionario>();
    }

    public void cadastrarFuncionario(Funcionario f) throws FuncionarioJaExistenteException {
        Funcionario fun = funcionarios.get(f.getEmail());
        if (fun != null) {
            throw new FuncionarioJaExistenteException("O funcionário informado já está cadastrado!");
        } else {
            funcionarios.put(f.getEmail(), f);
        }
    }

    public List<Funcionario> getAllOfficials() {
        return new ArrayList(this.funcionarios.values());
    }

    public Funcionario pesquisaFuncionario(String email) throws FuncionarioNaoExisteException {
        Funcionario f = funcionarios.get(email);
        if (f != null) {
            return f;
        } else {
            throw new FuncionarioNaoExisteException("O funcionário informado não está cadastrado!");
        }
    }
/*
    public void deletarFuncionario(Funcionario f) throws FuncionarioNaoExisteException {
        Funcionario fun = this.funcionarios.get(f.getEmail());
        if (fun != null) {
            this.funcionarios.remove(f.getEmail());
        } else {
            throw new FuncionarioNaoExisteException("O funcionario informado não foi encontrado!");
        }
    }     */
    
    // Arquivos
    
    public void salvarFuncionarios() throws IOException {
        this.gravador.gravar(new ArrayList(this.funcionarios.values()));
    }
    public List<Funcionario> recuperarFuncionarios() throws IOException{
        return this.gravador.ler();
    }
        
}
