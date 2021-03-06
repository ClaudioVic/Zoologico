/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufpb.zoo.views;

import br.com.ufpb.zoo.control.SistemaZoo;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author robson
 */
public class TelaInicial extends javax.swing.JFrame {
    
    private static SistemaZoo sistema;

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial(SistemaZoo sistema) {
        this.sistema = sistema;
        initComponents();
        URL url = this.getClass().getResource("./././././images/ZooIcone.png");
        Image ZooIcone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(ZooIcone);
        setIconImage(ZooIcone);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jImagemZoo = new javax.swing.JLabel();
        jBarraDeMenu = new javax.swing.JMenuBar();
        jCadastro = new javax.swing.JMenu();
        jFuncionario = new javax.swing.JMenuItem();
        jAnimal = new javax.swing.JMenuItem();
        jBlocoSub = new javax.swing.JMenu();
        fBlocoSubBloco = new javax.swing.JMenuItem();
        jCorredorSubBloco = new javax.swing.JMenuItem();
        jAmbienteSubBloco = new javax.swing.JMenuItem();
        JPesquisa = new javax.swing.JMenu();
        jPesquisaAnimal = new javax.swing.JMenu();
        jPesquisaBloco = new javax.swing.JMenuItem();
        jPesquisaCorredor = new javax.swing.JMenuItem();
        jVisaoGeral = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jImagemZoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ufpb/zoo/views/images/Zoo_1.png"))); // NOI18N
        jImagemZoo.setText("jLabel1");
        jImagemZoo.setMaximumSize(new java.awt.Dimension(800, 500));
        jImagemZoo.setMinimumSize(new java.awt.Dimension(800, 500));

        jCadastro.setText("Cadastro");
        jCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jFuncionario.setText("Funcionário");
        jFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFuncionarioActionPerformed(evt);
            }
        });
        jCadastro.add(jFuncionario);

        jAnimal.setText("Animal");
        jAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnimalActionPerformed(evt);
            }
        });
        jCadastro.add(jAnimal);

        jBlocoSub.setText("Bloco");
        jBlocoSub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fBlocoSubBloco.setText("Bloco");
        fBlocoSubBloco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fBlocoSubBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBlocoSubBlocoActionPerformed(evt);
            }
        });
        jBlocoSub.add(fBlocoSubBloco);

        jCorredorSubBloco.setText("Corredor");
        jCorredorSubBloco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCorredorSubBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCorredorSubBlocoActionPerformed(evt);
            }
        });
        jBlocoSub.add(jCorredorSubBloco);

        jAmbienteSubBloco.setText("Ambiente");
        jAmbienteSubBloco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jAmbienteSubBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmbienteSubBlocoActionPerformed(evt);
            }
        });
        jBlocoSub.add(jAmbienteSubBloco);

        jCadastro.add(jBlocoSub);

        jBarraDeMenu.add(jCadastro);
        jCadastro.getAccessibleContext().setAccessibleDescription("");

        JPesquisa.setText("Pesquisa");
        JPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPesquisaAnimal.setText("Animal");
        jPesquisaAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPesquisaBloco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jPesquisaBloco.setText("Animais do bloco");
        jPesquisaBloco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPesquisaBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaBlocoActionPerformed(evt);
            }
        });
        jPesquisaAnimal.add(jPesquisaBloco);

        jPesquisaCorredor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jPesquisaCorredor.setText("Animais do corredor");
        jPesquisaCorredor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPesquisaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaCorredorActionPerformed(evt);
            }
        });
        jPesquisaAnimal.add(jPesquisaCorredor);

        JPesquisa.add(jPesquisaAnimal);

        jBarraDeMenu.add(JPesquisa);

        jVisaoGeral.setText("Visão Geral");
        jVisaoGeral.setActionCommand("");
        jVisaoGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jVisaoGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVisaoGeralMouseClicked(evt);
            }
        });
        jBarraDeMenu.add(jVisaoGeral);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jBarraDeMenu.add(sair);

        setJMenuBar(jBarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImagemZoo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImagemZoo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCorredorSubBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCorredorSubBlocoActionPerformed
        if (sistema.getAllBlocos().size() != 0) {
            CadastrarCorredor cc = new CadastrarCorredor(sistema, this, rootPaneCheckingEnabled);
            cc.setLocationRelativeTo(null);
            cc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum bloco cadastrado");
        }
        
    }//GEN-LAST:event_jCorredorSubBlocoActionPerformed

    private void jAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnimalActionPerformed
        if (sistema.getAllAmbientes().size() != 0) {
            CadastrarAnimal ca = new CadastrarAnimal(sistema, this, rootPaneCheckingEnabled);
            ca.setLocationRelativeTo(null);
            ca.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado! ");
        }
    }//GEN-LAST:event_jAnimalActionPerformed

    private void jFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastrarFuncionario cf = new CadastrarFuncionario(sistema, this, rootPaneCheckingEnabled);
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
    }//GEN-LAST:event_jFuncionarioActionPerformed

    private void fBlocoSubBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBlocoSubBlocoActionPerformed
        if (sistema.getAllOfficials().size() != 0) {
            CadastrarBloco cb = new CadastrarBloco(sistema, this, rootPaneCheckingEnabled);
            cb.setLocationRelativeTo(null);
            cb.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum funcionario cadastrado!");
        }
        
    }//GEN-LAST:event_fBlocoSubBlocoActionPerformed

    private void jAmbienteSubBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmbienteSubBlocoActionPerformed
        if (sistema.getAllHalls().size() != 0) {
            CadastrarAmbiente cam = new CadastrarAmbiente(sistema, this, rootPaneCheckingEnabled);
            cam.setLocationRelativeTo(null);
            cam.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum corredor cadastrado!");
        }
        
    }//GEN-LAST:event_jAmbienteSubBlocoActionPerformed

    private void jPesquisaBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaBlocoActionPerformed
        PesquisarAnimaisDoBloco pab = new PesquisarAnimaisDoBloco(sistema,this, rootPaneCheckingEnabled);
        pab.setLocationRelativeTo(null);
        pab.setVisible(true);
    }//GEN-LAST:event_jPesquisaBlocoActionPerformed

    private void jPesquisaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaCorredorActionPerformed
        PesquisarAnimaisDoCorredor pac = new PesquisarAnimaisDoCorredor(sistema,this, rootPaneCheckingEnabled);
        pac.setLocationRelativeTo(null);
        pac.setVisible(true);
    }//GEN-LAST:event_jPesquisaCorredorActionPerformed

    private void jVisaoGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVisaoGeralMouseClicked
        VisaoGeral tela = new VisaoGeral(sistema, this, rootPaneCheckingEnabled);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_jVisaoGeralMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        try {
            sistema.salvarNoArquivo();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(sistema).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JPesquisa;
    private javax.swing.JMenuItem fBlocoSubBloco;
    private javax.swing.JMenuItem jAmbienteSubBloco;
    private javax.swing.JMenuItem jAnimal;
    private javax.swing.JMenuBar jBarraDeMenu;
    private javax.swing.JMenu jBlocoSub;
    private javax.swing.JMenu jCadastro;
    private javax.swing.JMenuItem jCorredorSubBloco;
    private javax.swing.JMenuItem jFuncionario;
    private javax.swing.JLabel jImagemZoo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jPesquisaAnimal;
    private javax.swing.JMenuItem jPesquisaBloco;
    private javax.swing.JMenuItem jPesquisaCorredor;
    private javax.swing.JMenu jVisaoGeral;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
