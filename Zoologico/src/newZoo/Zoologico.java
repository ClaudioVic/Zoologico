package newZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private String nome;
	private String endereco;
	private List<Bloco> blocos;
	
	public Zoologico(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
		this.blocos = new ArrayList<Bloco>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Bloco> getBlocos() {
		return blocos;
	}
	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}
	public Zoologico(){
		this("","");
	}
	
}