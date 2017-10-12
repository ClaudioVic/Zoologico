package br.com.ufpb.zoo.model;

import java.io.Serializable;

public class Animal implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String nome;
    private String especie;
    private String dataEntrada;
    private String observacao;

    public Animal(String nome, String especie, String dataEntrada, String obs) {
        this.nome = nome;
        this.especie = especie;
        this.dataEntrada = dataEntrada;
        this.observacao = obs;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEntrada(String especie) {
        this.especie = especie;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return this.nome + this.especie;
    }

}
