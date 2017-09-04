package newZoo;

public class Animal {
	
	private String nome;
	private String sexo;
	private String especie;
	
	public Animal(String nome, String sexo, String especie){
		this.nome = nome;
		this.sexo = sexo;
		this.especie = especie; 
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public String getEspecie(){
		return this.especie;
	}
}