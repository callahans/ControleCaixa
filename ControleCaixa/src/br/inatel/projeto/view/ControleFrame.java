/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import br.inatel.projeto.model.MySqlConnect;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.sql.CallableStatement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Daniel / Olindo
 */
public class ControleFrame extends javax.swing.JFrame
{

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    Connection conn1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null; 
   
   
    float total = 0;

    public ControleFrame()
    {
        initComponents();
        this.setTitle("Sistema de Controle de Estoque - EC205");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtInformacoes = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPagamento = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gastos"));

        jLabel1.setText("Código*:");

        jLabel2.setText("Informações:");

        jLabel3.setText("Produto*:");

        jLabel4.setText("Marca:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade*:");

        jLabel6.setText("Valor*:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de pagamento*:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnBuscar.setText("Busca");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInformacoes)
                            .addComponent(txtProduto)
                            .addComponent(txtMarca)
                            .addComponent(txtQuantidade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(6, 6, 6)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizar))))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int returnID() {
        int id = 0;
        
        boolean sucesso = false;
        conn1 = MySqlConnect.ConnectDB();
        String Sql1 = "SELECT * FROM system_user WHERE isLogged=1";
        try {
            // preparando a consulta
            pst1 = conn1.prepareStatement(Sql1);
            // executando a Query e retornando a tabela resultada da busca para RS
            rs1 = pst1.executeQuery();
            rs1.next();
            id = rs1.getInt(1);
            System.out.println(id);
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: Conexão Banco! :(");
            sucesso = false;
        } finally {
            // independente se deu certo ou não, eu fecho tudo
               try {
                if (rs1 != null) {
                    rs1.close();
                }
                if (pst1 != null) {
                    pst1.close();
                }
                if (conn1 != null) {
                    conn1.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro: Conexão não pode ser fechada! :(");
            }
        }
        // se sucesso = false, mostra essa mensagem para o usuario
         if (!sucesso) {
                JOptionPane.showMessageDialog(null, "Componente não existe!", "Falha na busca", JOptionPane.ERROR_MESSAGE);
         }
        
        
        return id;
    }
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        conn = MySqlConnect.ConnectDB();
        //IS LOGGED----------------------------------------------------------------
        String Sql1 = "UPDATE system_user SET isLogged=0 WHERE isLogged=1;";
        try {
            pst = conn.prepareStatement(Sql1);
            pst.executeUpdate();
        } catch(Exception e) {
            System.out.println("Erro: Conexão Banco! (isLogged):(");
        }
        //END IS LOGGED------------------------------------------------------------
        
        this.dispose();
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtInformacoes.setText("");
        txtMarca.setText("");
        txtPagamento.setText("");
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //Gasto gasto = new Gasto();
        
        conn = MySqlConnect.ConnectDB();
        String Sql = "INSERT INTO component(id, info, produto, marca, quantidade, valor, data_pagamento, system_user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
            pst = conn.prepareStatement(Sql);
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtInformacoes.getText());
            pst.setString(3, txtProduto.getText());
            pst.setString(4, txtMarca.getText());
            pst.setString(5, txtQuantidade.getText());
            pst.setString(6, txtValor.getText());
            pst.setString(7, txtPagamento.getText());
            pst.setString(8,Integer.toString(returnID()));
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Componente adicionado com sucesso!");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        txtCodigo.setText("");
        txtInformacoes.setText("");
        txtMarca.setText("");
        txtPagamento.setText("");
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        conn = MySqlConnect.ConnectDB();
        String Sql = "UPDATE component SET info = ?, produto = ?, marca = ?, quantidade = ?, valor = ?, data_pagamento = ? WHERE id = ?;";
        try {
            
            pst = conn.prepareStatement(Sql);
            pst.setString(1, txtInformacoes.getText());
            pst.setString(2, txtProduto.getText());
            pst.setString(3, txtMarca.getText());
            pst.setString(4, txtQuantidade.getText());
            pst.setString(5, txtValor.getText());
            pst.setString(6, txtPagamento.getText());
            pst.setString(7, txtCodigo.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Componente atualizado com sucesso!");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        conn = MySqlConnect.ConnectDB();
        String Sql = "DELETE FROM component WHERE id = ?;";
        try {
            
            pst = conn.prepareStatement(Sql);
            pst.setString(1, txtCodigo.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Componente excluído com sucesso!");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        boolean sucesso = false;
        conn = MySqlConnect.ConnectDB();
        String Sql = "SELECT * FROM component WHERE id=?";
        try {
            // preparando a consulta
            pst = conn.prepareStatement(Sql);
            pst.setString(1, txtCodigo.getText());
            // executando a Query e retornando a tabela resultada da busca para RS
            rs = pst.executeQuery();
            // enquanto tiver linha na tabela, rs.next() anda de uma em uma linha
            while (rs.next()) {
                int id = rs.getInt("id");
                sucesso = true;
                txtCodigo.setText(Integer.toString(rs.getInt("id")));
                txtInformacoes.setText(rs.getString("info"));
                txtMarca.setText(rs.getString("produto"));
                txtProduto.setText(rs.getString("marca"));
                txtQuantidade.setText(Integer.toString(rs.getInt("quantidade")));
                txtValor.setText(Float.toString(rs.getFloat("valor")));
                txtPagamento.setText(Integer.toString(rs.getInt("data_pagamento")));
            }
           
        } catch (SQLException e) {
            System.out.println("Erro: Conexão Banco! :(");
            sucesso = false;
        } finally {
            // independente se deu certo ou não, eu fecho tudo
               try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro: Conexão não pode ser fechada! :(");
            }
        }
        // se sucesso = false, mostra essa mensagem para o usuario
         if (!sucesso) {
                JOptionPane.showMessageDialog(null, "Componente não existe!", "Falha na busca", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ControleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtInformacoes;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
