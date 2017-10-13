package br.com.ufpb.zoo.model;
/**
 *
 * @author robson
 * @author Clauido Victor
 */

public class Ambiente {
    
	String nome;
	private String especie;
        private int QTD_MAX_ANIMAIS;
        private String observacao;
	
	public Ambiente(String nome, String especie, int qTD_MAX_ANIMAIS, String observacao) {
            this.nome = nome;
            this.especie = especie;
            QTD_MAX_ANIMAIS = qTD_MAX_ANIMAIS;
            this.observacao = observacao;
	}
	
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        
	public int getQTD_MAX_ANIMAIS() {
		return QTD_MAX_ANIMAIS;
	}
	public void setQTD_MAX_ANIMAIS(int qTD_MAX_ANIMAIS) {
		QTD_MAX_ANIMAIS = qTD_MAX_ANIMAIS;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
        
        public String getObservacao() {
		return this.observacao;
	}
	public void setObservacao(String obs) {
		this.especie = obs;
	}
}