package br.com.ufpb.zoo.model;

import java.io.Serializable;

public class Corredor implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String nome;
    private Bloco bloco;

    public Corredor(String  numero,Bloco bloco) {
        this.nome = numero;
        this.bloco=bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    
}
