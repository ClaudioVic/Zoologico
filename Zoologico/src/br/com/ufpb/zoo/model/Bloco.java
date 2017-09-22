package br.com.ufpb.zoo.model;

public class Bloco {
	
	private String nome;
	private Funcionario responsavel;

        
	public Bloco(String nome, Funcionario responsavel){
		this.nome = nome;
		this.responsavel = responsavel;
	}	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Funcionario getResponsavel(){
		return this.responsavel;
	}
	
	public void setResponsavel(Funcionario responsavel){
		this.responsavel = responsavel;
	}
	
}