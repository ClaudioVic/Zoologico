package br.com.ufpb.zoo.model;


import java.util.ArrayList;
import java.util.List;

public class Corredor {
	
	private String nome;
	private List<Ambiente> jaulas;
	
	public Corredor (String numero){
		this.nome = numero;
		this.jaulas = new ArrayList<>();
	}
	
	public Corredor(){
		this("");
	}
	public String getNome(){
            return this.nome;
        }
	public String getNumero(){
		return this.nome;
	}
	
	public void setNumero(String numero){
		this.nome = numero;
	}
	
	public List<Ambiente> getJaulas(){
		return this.jaulas;
	}
}