package br.com.ufpb.zoo.model;
/**
 *
 * @author robson
 */
public class Endereco {
	private String logradouro;
	private String cep;
	private String estado;
	private String cidade;
	private String numero;
	private String complemento;
	
        public Endereco(){
            this.logradouro = "";
            this.cep = "";
            this.estado = "";
            this.cidade = "";
            this.numero = "";
            this.complemento = "";
	}        
        
	public Endereco(String logradouro, String cep, String estado, String cidade, String numero, String complemento) {
            this.logradouro = logradouro;
            this.cep = cep;
            this.estado = estado;
            this.cidade = cidade;
            this.numero = numero;
            this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	

}
