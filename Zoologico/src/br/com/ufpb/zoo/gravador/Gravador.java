/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.gravador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
 

/**
 *
 * @author robson
 */
public class Gravador<T> {

    private String nomeDoArquivo;

    public Gravador(String arquivo) {
        this.nomeDoArquivo = arquivo;
    }

    public void gravar(List<T> object) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo));
            out.writeObject(object);
        } catch (FileNotFoundException e) {
            throw new IOException("O arquivo não foi encontrado " + this.nomeDoArquivo);
        } catch (IOException e) {
            throw e;
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    public List<T> ler() throws IOException{
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(nomeDoArquivo));
            return (List<T>) in.readObject();
        }catch(FileNotFoundException e){
            throw new IOException("O arquivo não foi encontrado " + this.nomeDoArquivo);
        }catch(IOException e){
            throw e;
        }catch(ClassNotFoundException e){
            throw new IOException("Classe dos objetos gravados no arquivo"+this.nomeDoArquivo+" não existe");
        }finally{
            if (in!=null){
                in.close();
            }
        }
    }

}
