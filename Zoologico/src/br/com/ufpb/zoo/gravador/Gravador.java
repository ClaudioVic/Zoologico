/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.gravador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;

/**
 *
 * @author robson
 */
public class Gravador<T> {

    private String nomeDoArquivo;

    public Gravador(String arquivo) {
        this.nomeDoArquivo = arquivo;
    }

    public void gravaAnimal(Collection<T> object) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo));
            out.writeObject(out);
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

}
