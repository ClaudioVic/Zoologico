/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.views;

import br.com.ufpb.zoo.model.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import br.com.ufpb.zoo.control.SistemaZoo;
import br.com.ufpb.zoo.exceptions.AmbienteJaExistenteException;
import br.com.ufpb.zoo.exceptions.CorredorNaoExisteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio Victor
 */
public class CadastrarAmbiente extends javax.swing.JDialog {

    private static SistemaZoo sisZoo;

    /**
     * Creates new form CadastrarFuncionario
     */
    public CadastrarAmbiente(SistemaZoo sistema, java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        this.sisZoo = sistema;
        URL url = this.getClass().getResource("images/ZooIcone.png");
        Image ZooIcone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(ZooIcone);
        setIconImage(ZooIcone);
        preencherCombo();
    }

    public void preencherCombo() {
        for (int i = 0; i < this.sisZoo.getAllHalls().size(); i++) {
            comboCorredores.addItem(this.sisZoo.getAllHalls().get(i).getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jCadastrarBloco = new javax.swing.JLabel();
        jQtdAnimais = new javax.swing.JLabel();
        txtQtdAnimais = new javax.swing.JTextField();
        jEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        btnCadastrarAmbiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboCorredores = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jCadastrarBloco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCadastrarBloco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCadastrarBloco.setText("  Cadastrar Ambiente  ");
        jCadastrarBloco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jQtdAnimais.setLabelFor(txtQtdAnimais);
        jQtdAnimais.setText("Quantidade de Animais:");

        jEspecie.setText("Espécie:");

        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });

        btnCadastrarAmbiente.setText("Cadastrar");
        btnCadastrarAmbiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrarAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAmbienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Corredor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jQtdAnimais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarAmbiente)
                            .addComponent(txtQtdAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jCadastrarBloco))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEspecie)
                            .addComponent(jLabel1))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCorredores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtNome))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCadastrarBloco)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEspecie)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtdAnimais))
                .addGap(40, 40, 40)
                .addComponent(btnCadastrarAmbiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAmbienteActionPerformed

        String nome = txtNome.getText();
        String especie = txtEspecie.getText();
        int qtd = Integer.parseInt(txtQtdAnimais.getText());
        Corredor corredor = null;
        try {
             corredor = sisZoo.pesquisaCorredor(comboCorredores.getSelectedItem().toString());
        } catch (CorredorNaoExisteException ex) {
            Logger.getLogger(CadastrarAmbiente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ambiente a = new Ambiente(nome, qtd, especie,corredor);
        try {
            sisZoo.cadastrarAmbiente(a);
            JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!");
            dispose();
        } catch (AmbienteJaExistenteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_btnCadastrarAmbienteActionPerformed

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarAmbiente dialog = new CadastrarAmbiente(sisZoo, new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAmbiente;
    private javax.swing.JComboBox<String> comboCorredores;
    private javax.swing.JLabel jCadastrarBloco;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jQtdAnimais;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdAnimais;
    // End of variables declaration//GEN-END:variables
}
