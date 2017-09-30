package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.AnimalJaExistenteException;
import br.com.ufpb.zoo.exceptions.AnimalNaoExisteException;
import br.com.ufpb.zoo.exceptions.FuncionarioJaExistenteException;
import br.com.ufpb.zoo.exceptions.FuncionarioNaoExisteException;
import java.util.HashMap;
import java.util.Map;
    
import br.com.ufpb.zoo.model.Animal;
import br.com.ufpb.zoo.model.Funcionario;
import java.util.List;

public class SistemaZoo {
	private Map<String,Animal> animais;
        private Map<String,Funcionario> funcionarios;
	
	public SistemaZoo() {
		this.animais = new HashMap<String,Animal>();
                this.funcionarios = new HashMap<String,Funcionario>();
	}
	public void adicionaAnimal(Animal m) throws AnimalJaExistenteException{
            Animal a = animais.get(m.toString());
            if (a!=null)animais.put(m.toString(), m);
            else throw new AnimalJaExistenteException("O animal já está cadastrado!");
	}
        public void adicionaFuncionario(Funcionario f) throws FuncionarioJaExistenteException{
            Funcionario fun = funcionarios.get(f.getEmail());
            if (fun!=null)funcionarios.put(f.getEmail(), f);
            else throw new FuncionarioJaExistenteException("O funcionario já esta cadastrado!");
        }
        public List<Funcionario> getAllFuncionarios(){
            return (List)this.funcionarios.values();
        }
        public List<Animal> getAllAnimais(){
            return (List)this.animais.values();
        }
        public Funcionario pesquisaFuncionario(String email)throws FuncionarioNaoExisteException{
            Funcionario f = funcionarios.get(email);
            if (f!=null) return f;
            else throw new FuncionarioNaoExisteException("O funcionario não existe!");
        }
        public Animal pesquisaAnimal(String nome, String especie)throws AnimalNaoExisteException{
            Animal m = animais.get(nome+especie);
            if (m!=null) return m;
            else throw new AnimalNaoExisteException("O animal não existe");
        }
        public void deletarFuncionario(Funcionario f )throws FuncionarioNaoExisteException{
            Funcionario fun = this.funcionarios.get(f.getEmail());
            if (fun!=null) this.funcionarios.remove(f.getEmail());
            else throw new FuncionarioNaoExisteException("O funcionario não foi encontrado!");
        }
        public void deletarAnimal(Animal m)throws AnimalNaoExisteException{
            Animal an = this.animais.get(m.toString());
            if (an!=null) this.animais.remove(m.toString());
            else throw new AnimalNaoExisteException("O animal não foi encontrado!");
        }        
}
