/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;
import br.com.ufpb.zoo.model.Corredor;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.exceptions.*;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author Claudio Victor
 */
public class GerenteCorredor {
    private Map<String, Corredor> corredores;
    private Gravador<Corredor> gravador;
    
    public GerenteCorredor(){
        this.corredores = new HashMap();
        this.gravador = new Gravador("corredores.dat");
    }
    
    public void cadastrarCorredor(Corredor c) throws CorredorJaExistenteException{
        Corredor cor = this.corredores.get(c.getNome());
        if(cor != null){
            throw new CorredorJaExistenteException("O corredor informado já está cadastrado!");
        }else{           
            this.corredores.put(c.getNome(),c);
        }
    }
    
    public List<Corredor> getAllHalls(){
        return new ArrayList(this.corredores.values());
    }
    
    public Corredor pesquisaCorredor(String nome) throws CorredorNaoExisteException{
        Corredor cor = this.corredores.get(nome);
        if(cor != null){
            return cor;
        }else{
            throw new CorredorNaoExisteException("O corredor informado não está cadastrado!");
        }
    }
        
    // Arquivos
        
    public void salvarCorredor() throws IOException {
        this.gravador.gravar( new ArrayList(this.corredores.values()));
    }
    
    public List<Corredor> recuperarCorredores() throws IOException{
        return this.gravador.ler();
    }
}