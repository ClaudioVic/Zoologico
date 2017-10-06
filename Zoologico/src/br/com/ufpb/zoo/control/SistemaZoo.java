package br.com.ufpb.zoo.control;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Funcionario;

public class SistemaZoo {

    private Map<String, Animal> animais;
    private Map<String, Funcionario> funcionarios;

    public SistemaZoo() {
        this.animais = new HashMap<String, Animal>();
        this.funcionarios = new HashMap<String, Funcionario>();
    }

    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException {
        Animal a = this.animais.get(m.toString());
        if (a == null) {
            animais.put(m.toString(), m);
        } else {
            throw new AnimalJaExistenteException("O animal já está cadastrado!");
        }
    }

    public void cadastrarFuncionario(Funcionario f) throws FuncionarioJaExistenteException {
        Funcionario fun = funcionarios.get(f.getEmail());
        if (funcionarios.get(fun) != null) {
            throw new FuncionarioJaExistenteException("O funcionário já esta cadastrado!");
        } else {
            funcionarios.put(f.getEmail(), f);
        }
    }

    public Collection<Funcionario> getAllFuncionarios() {
        return this.funcionarios.values();
    }

    public Collection<Animal> getAllAnimais() {
        return  this.animais.values();
    }

    public Funcionario pesquisaFuncionario(String email) throws FuncionarioNaoExisteException {
        Funcionario f = funcionarios.get(email);
        if (f != null) {
            return f;
        } else {
            throw new FuncionarioNaoExisteException("O funcionario não existe!");
        }
    }

    public Animal pesquisaAnimal(String nome, String especie) throws AnimalNaoExisteException {
        Animal m = animais.get(nome + especie);
        if (m != null) {
            return m;
        } else {
            throw new AnimalNaoExisteException("O animal não existe");
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

    public void deletarAnimal(Animal m) throws AnimalNaoExisteException {
        Animal an = this.animais.get(m.toString());
        if (an != null) {
            this.animais.remove(m.toString());
        } else {
            throw new AnimalNaoExisteException("O animal não foi encontrado!");
        }
    }
}
