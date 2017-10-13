package br.com.ufpb.zoo.model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable{
	private String funcao;
	private String observacao;
        
        public Funcionario(){
            this.funcao = "";
            this.observacao = "";
        }
	
	public Funcionario(String nome, String email,String cpf, String rg, String telefone, Endereco endereco, 
                String funcao,String observacao) {
		super(nome,email, cpf, rg, telefone, endereco);
		this.funcao = funcao;
		this.observacao = observacao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
