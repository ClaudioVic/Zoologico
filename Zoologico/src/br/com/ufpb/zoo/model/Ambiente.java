package br.com.ufpb.zoo.model;

import java.io.Serializable;

public class Ambiente implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String nome;
    private int qtdMaxAnimais;
    private String especie;
    private Corredor corredor;
    
    public Ambiente(String nome,int qtdMaxAnimais, String especie,Corredor corredor) {
        this.nome = nome;
        this.corredor= corredor;
        this.qtdMaxAnimais = qtdMaxAnimais;
        this.especie = especie;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQtdMaxAnimais() {
        return qtdMaxAnimais;
    }

    public void setQtdMaxAnimais(int qtdMaxAnimais) {
        qtdMaxAnimais = qtdMaxAnimais;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
