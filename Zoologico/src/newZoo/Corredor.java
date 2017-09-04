package newZoo;


import java.util.ArrayList;
import java.util.List;

public class Corredor {
	
	private int numero;
	private List<Animal> animais;
	
	public Corredor (int numero){
		this.numero = numero;
		this.animais = new ArrayList<Animal>();
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public List<Animal> getAnimais(){
		return this.animais;
	}

	public void cadastrarAnimal(Animal animal){
		this.animais.add(animal);
	}
	
	public Animal pesquisarAnimal(String animal){
		for(Animal a: animais){
			if(a.getNome().equals(animal)){
				return a;
			}
		}
		return null;
	}
	
}