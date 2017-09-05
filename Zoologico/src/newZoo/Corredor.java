package newZoo;


import java.util.ArrayList;
import java.util.List;

public class Corredor {
	
	private int numero;
	private List<Jaula> jaulas;
	
	public Corredor (int numero){
		this.numero = numero;
		this.jaulas = new ArrayList<>();
	}
	
	public Corredor(){
		this(0);
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public List<Jaula> getJaulas(){
		return this.jaulas;
	}
}