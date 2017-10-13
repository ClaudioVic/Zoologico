package br.com.ufpb.zoo.model;
/**
 *
 * @author Claudio Victor
 */
public class Bloco {

    private String nome;
    private Funcionario responsavel;
    private String observacao;

    public Bloco(String nome, Funcionario responsavel, String obs) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.observacao = obs;
    }
    public String getObservacao(){
        return this.observacao;
    }
    public void setObservacao(String obs){
        this.observacao = obs;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

}
