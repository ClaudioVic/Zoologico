/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.exceptions;

/**
 *
 * @author Claudio Victor
 */
public class AmbienteNaoExisteException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AmbienteNaoExisteException(String msg){
        super(msg);
    }
    
}

