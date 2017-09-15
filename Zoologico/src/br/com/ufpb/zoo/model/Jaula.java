package br.com.ufpb.zoo.model;

public class Jaula {
	private int QTD_MAX_ANIMAIS;
	private String especie;
	
	public Jaula(int qTD_MAX_ANIMAIS, String especie) {
		QTD_MAX_ANIMAIS = qTD_MAX_ANIMAIS;
		this.especie = especie;
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
	
	
	
	
}
