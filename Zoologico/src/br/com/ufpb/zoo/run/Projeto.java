/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.run;

import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.views.TelaInicial;

/**
 *
 * @author robson
 */
public class Projeto {
    
    
    
    public static void main(String[] args){
        SistemaZoo sistema = new SistemaZoo();
        TelaInicial tela = new TelaInicial(sistema);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
