package br.com.ufpb.zoo.model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudio Victor
 */

public class Corredor {
   	
	private String nome;
	private List<Ambiente> ambientes;
        private String observacao;
	
	public Corredor (String nome,String obs){
		this.nome = nome;
                this.observacao = obs;
		this.ambientes = new ArrayList<>();
	}
	
	public Corredor(){
		this("","Sem Observações");
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public List<Ambiente> getJaulas(){
		return this.ambientes;
	}
        
        public String getObservacao(){
		return this.observacao;
	}
	public void setObservacao(String obs){
		this.nome = obs;
	}   
}