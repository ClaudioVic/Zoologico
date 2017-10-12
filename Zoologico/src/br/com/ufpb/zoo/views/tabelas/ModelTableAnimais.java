/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.views.tabelas;

import br.com.ufpb.zoo.model.Animal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robson
 */
public class ModelTableAnimais extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    private ArrayList dados = null;     

    public ModelTableAnimais(ArrayList dados) {     
        this.dados = dados; 
    }     

    @Override  
    public int getColumnCount() {     
        return 4; //quantidade de campos do que terá na tabela  
    }     

    @Override  
    public int getRowCount() {     
        if (this.dados == null) {     
            return 0;     
        } else {     
            return this.dados.size();        
        }     
    }     

    @Override  
    public Object getValueAt(int row, int column) {     
        Animal rdv = (Animal) this.dados.get(row);   // RDV é o meu objeto bean com seus gets e sets  

        Object retorno = null;     

        if (column == 0) {   //pega os valores do objeto para retornar para a jTable  
            retorno = rdv.getNome();
        } else if (column == 1) { 
            retorno = rdv.getEspecie();
        } else if(column==2){
            retorno = rdv.getDataEntrada();
        } else if(column==3){
            retorno = rdv.getObservacao();
        }
        return retorno;     

    }     

    @Override  
    public String getColumnName(int column) {     
        String columnName = "";   //rotulo de cabeçalho das colunas do jTable  
        if (column == 0) {     
            columnName = "Nome:";     
        } else if (column == 1) {     
            columnName = "Espécie:";     
        } else if (column == 2) {     
            columnName = "Data de Entrada:";     
        } else if (column == 3) {     
            columnName = "Observação:";     
        } 
            return columnName;     
        }  

    }
