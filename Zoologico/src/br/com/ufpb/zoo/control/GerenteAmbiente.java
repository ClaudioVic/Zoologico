/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.model.Ambiente;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.exceptions.*;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author Claudio Victor
 */
public class GerenteAmbiente {

    private Map<String, Ambiente> ambientes;
    private Gravador<Ambiente> gravador;

    public GerenteAmbiente() {
        this.ambientes = new HashMap<String, Ambiente>();
        this.gravador = new Gravador("ambientes.dat");
    }

    public void cadastrarAmbiente(Ambiente a) throws AmbienteJaExistenteException {
        Ambiente amb = this.ambientes.get(a.getNome());
        if (amb == null) {
            this.ambientes.put(a.getNome(), a);

        } else {
            throw new AmbienteJaExistenteException("O Ambiente informado já está cadastrado!");
        }
    }

    public List<Ambiente> getAllAmbientes() {
        return new ArrayList(this.ambientes.values());
    }

    public Ambiente pesquisaAmbiente(String nome) throws AmbienteNaoExisteException {
        Ambiente amb = this.ambientes.get(nome);
        if (amb != null) {
            return amb;
        } else {
            throw new AmbienteNaoExisteException("O Ambiente informado não está cadastrado!");
        }
    }

    // Arquivos
    public void salvarAmbiente() throws IOException {
        this.gravador.gravar(new ArrayList(this.ambientes.values()));
    }

    public void recuperarAmbientes() throws IOException {
        for (Ambiente i : this.gravador.ler()) {
            this.ambientes.put(i.getNome() + i.getEspecie(), i);
        }
    }
}
