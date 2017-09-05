package newZoo;

public class Animal {
	
	private String nome;
	private String especie;
	private String dataEntrada; 

	public Animal(String nome, String especie, String dataEntrada){
		this.nome = nome;
		this.especie = especie; 
		this.dataEntrada = dataEntrada;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEspecie(){
		return this.especie;
	}
	
	public void setEntrada(String especie){
		this.especie = especie;
	}
	
	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}