/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.views.tabelas;

import br.com.ufpb.zoo.model.Funcionario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robson
 */
public class ModelTableFuncionarios extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    private ArrayList dados = null;     

    public ModelTableFuncionarios(ArrayList dados) {     
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
        Funcionario rdv = (Funcionario) this.dados.get(row);   // RDV é o meu objeto bean com seus gets e sets  

        Object retorno = null;     

        if (column == 0) {   //pega os valores do objeto para retornar para a jTable  
            retorno = rdv.getNome();
        } else if (column == 1) { 
            retorno = rdv.getEmail();
        } else if(column==2){
            retorno = rdv.getFuncao();
        } else if(column==3){
            retorno = rdv.getTelefone();
        }
        return retorno;     

    }     

    @Override  
    public String getColumnName(int column) {     
        String columnName = "";   //rotulo de cabeçalho das colunas do jTable  
        if (column == 0) {     
            columnName = "Nome:";     
        } else if (column == 1) {     
            columnName = "Email:";     
        } else if (column == 2) {     
            columnName = "Função:";     
        } else if (column == 3) {     
            columnName = "Telefone:";     
        } 
            return columnName;     
        }  

    }
