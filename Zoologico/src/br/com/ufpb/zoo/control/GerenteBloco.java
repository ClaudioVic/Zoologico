/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.control;

import br.com.ufpb.zoo.exceptions.BlocoJaExistenteException;
import br.com.ufpb.zoo.exceptions.BlocoNaoExistenteException;
import br.com.ufpb.zoo.gravador.Gravador;
import br.com.ufpb.zoo.model.Bloco;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author robson
 */
public class GerenteBloco {
    
    private Map<String, Bloco> blocos;
    private Gravador<Bloco> gravador;
    
    public GerenteBloco(){
        this.blocos = new HashMap<String,Bloco>();
        this.gravador = new Gravador ("blocos.dat");
    }
    
    public void cadastrarBloco(Bloco b)throws BlocoJaExistenteException{
        Bloco b2 = this.blocos.get(b.getNome());
        if (b2 == null) {
            this.blocos.put(b.getNome(), b);
        }else{
            throw new BlocoJaExistenteException("O Bloco informado já existe");
        }
    }
    public Bloco pesquisarBloco(String nome) throws BlocoNaoExistenteException{
        Bloco m = blocos.get(nome);
        if (m != null) {
            return m;
        } else {
            throw new BlocoNaoExistenteException("O Bloco informado não existe");
        }
    }
    public List<Bloco> getAllBlocos(){
        return  new ArrayList(this.blocos.values());
    }
      // Arquivos
    public void salvarBlocos() throws IOException {
        this.gravador.gravar(new ArrayList(this.blocos.values()));
    }
    public void recuperarBlocos() throws IOException{
        for (Bloco i : this.gravador.ler()) this.blocos.put(i.getNome(),i);
    }
    
    
}
