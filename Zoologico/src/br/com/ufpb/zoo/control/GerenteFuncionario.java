/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.model.Funcionario;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author robson
 */
public class GerenteFuncionario {

    private Map<String, Funcionario> funcionarios;

    public void cadastrarFuncionario(Funcionario f) throws FuncionarioJaExistenteException {
        Funcionario fun = funcionarios.get(f.getEmail());
        if (this.funcionarios.get(fun) != null) {
            throw new FuncionarioJaExistenteException("O funcionário já esta cadastrado!");
        } else {
            funcionarios.put(f.getEmail(), f);
        }
    }

    public Collection<Funcionario> getAllFuncionarios() {
        return this.funcionarios.values();
    }

    public Funcionario pesquisaFuncionario(String email) throws FuncionarioNaoExisteException {
        Funcionario f = funcionarios.get(email);
        if (f != null) {
            return f;
        } else {
            throw new FuncionarioNaoExisteException("O funcionario não existe!");
        }
    }

    public void deletarFuncionario(Funcionario f) throws FuncionarioNaoExisteException {
        Funcionario fun = this.funcionarios.get(f.getEmail());
        if (fun != null) {
            this.funcionarios.remove(f.getEmail());
        } else {
            throw new FuncionarioNaoExisteException("O funcionario não foi encontrado!");
        }
    }

}
