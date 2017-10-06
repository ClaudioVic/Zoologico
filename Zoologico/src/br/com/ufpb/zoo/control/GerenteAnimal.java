/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.model.Animal;

/**
 *
 * @author robson
 */
public class GerenteAnimal {

    private Map<String, Animal> animais;
    private Gravador<Animal> gravador;
    
    public GerenteAnimal(){
        this.gravador = new Gravador<Animal>("animais.dat");
        this.animais = new HashMap<String,Animal>();
    }
    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException, IOException {
        Animal a = this.animais.get(m.toString());
        if (a == null) {
            animais.put(m.toString(), m);
        } else {
            throw new AnimalJaExistenteException("O animal já está cadastrado!");
        }
        //
        this.gravador.gravar(new ArrayList(this.animais.values()));
    }

    
    public List<Animal> getAllAnimais() throws IOException {
        return this.gravador.ler();
    }

    public Animal pesquisaAnimal(String nome, String especie) throws AnimalNaoExisteException {
        Animal m = animais.get(nome + especie);
        if (m != null) {
            return m;
        } else {
            throw new AnimalNaoExisteException("O animal não existe");
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
