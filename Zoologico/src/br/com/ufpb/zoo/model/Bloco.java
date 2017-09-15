package br.com.ufpb.zoo.model;

public class Bloco {
	
	private String nome;
	private String responsavel;
	
	public Bloco(String nome, String responsavel){
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	
	public Bloco(){
		this("","");
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getResponsavel(){
		return this.responsavel;
	}
	
	public void setResponsavel(String responsavel){
		this.responsavel = responsavel;
	}
	
}