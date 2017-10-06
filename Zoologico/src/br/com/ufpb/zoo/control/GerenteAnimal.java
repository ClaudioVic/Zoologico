/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.model.Animal;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author robson
 */
public class GerenteAnimal {

    private Map<String, Animal> animais;
    private Gravador<Animal> gravador;
    
    public GerenteAnimal(){
        this.gravador = new Gravador<Animal>("animais.dat");
    }
    public void cadastrarAnimal(Animal m) throws AnimalJaExistenteException, IOException {
        Animal a = this.animais.get(m.toString());
        if (a == null) {
            animais.put(m.toString(), m);
        } else {
            throw new AnimalJaExistenteException("O animal já está cadastrado!");
        }
        //
        this.gravador.gravaAnimal(animais.values());
    }

    public Collection<Animal> getAllAnimais() {
        return this.animais.values();
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
