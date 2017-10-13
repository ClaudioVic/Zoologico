package br.com.ufpb.zoo.model;
/**
 *
 * @author robson
 */
public abstract class Pessoa {
	private String nome;
        private String email;
	private String cpf;
	private String rg;
	private String telefone;
	private Endereco endereco;
	
        public Pessoa(){
            this.email = "";
            this.nome = "";
            this.cpf = "";
            this.rg = "";
            this.telefone = "";
            this.endereco = new Endereco();
        }
        
	public Pessoa(String nome, String email,String cpf, String rg, String telefone, Endereco endereco) {
                this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getEmail(){
            return this.email;
        }
        public void setEmail(String email){
            this.email=email;
        }
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
