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
	
	public List<String> pesquisarLocalDoAnimal(String nome){
		List<String> local = new ArrayList<String>();
		String corredor = "";
		for(Bloco b: blocos){
			List<Corredor> corredores = b.getCorredores();
			for(Corredor c : corredores){
				Animal animalPesquisado = c.pesquisarAnimal(nome);
				if(animalPesquisado.getNome().equals(nome)){
					local.add(b.getLetra());
					corredor += c.getNumero();
					local.add(corredor);
					
					return local;
				}
			}
		}
		return null;
	}
	
	public List<Animal> pesquisarAnimaisDoBloco(String bloco){
		List<Animal> animaisDoBloco = new ArrayList<Animal>();
		
		Bloco blocoPesquisado = pesquisarBloco(bloco);
		List<Corredor> corredores = blocoPesquisado.getCorredores();
		for(Corredor c: corredores){
			List<Animal> animaisDoCorredor = blocoPesquisado.pesquisarAnimaisDoCorredor(c.getNumero());
			for(Animal a: animaisDoCorredor){
				animaisDoBloco.add(a);
			}
		}
		return animaisDoBloco;
	}
	
	public Bloco pesquisarBloco(String bloco){
		for(Bloco b: blocos){
			if(b.getLetra().equals(bloco)){
				return b;
			}
		}
		return null;
	}
	
	public void cadastrarBloco(Bloco bloco){
		this.blocos.add(bloco);
	}
}