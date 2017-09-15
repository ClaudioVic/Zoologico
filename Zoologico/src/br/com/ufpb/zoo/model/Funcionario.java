package br.com.ufpb.zoo.model;

public class Funcionario extends Pessoa{
	private String funcao;
	private String observacao;
	
	public Funcionario(String nome, String cpf, String rg, String telefone, Endereco endereco, String funcao,
			String observacao) {
		super(nome, cpf, rg, telefone, endereco);
		this.funcao = funcao;
		this.observacao = observacao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
