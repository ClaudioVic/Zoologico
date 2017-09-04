package newZoo;

import java.util.ArrayList;
import java.util.List;

public class Bloco {
	
	private String letra;
	private String responsavel;
	private List<Corredor> corredores;
	
	public Bloco(String letra, String responsavel){
		this.letra = letra;
		this.responsavel = responsavel;
		this.corredores = new ArrayList<Corredor>();
	}
	
	public String getLetra(){
		return this.letra;
	}
	
	public String getResponsavel(){
		return this.responsavel;
	}
	
	public List<Corredor> getCorredores(){
		return this.corredores;
	}
	
	public void cadastrarCorredor(Corredor corredor){
		this.corredores.add(corredor);
	}
	
	public List<Animal> pesquisarAnimaisDoCorredor(int corredor){
		for(Corredor c: corredores){
			if(c.getNumero() == corredor){
				return c.getAnimais();
			}
		}
		return null;
	}
}