/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.control;

import br.inatel.projeto.model.MySqlConnect;
import br.inatel.projeto.view.ControleFrame;
import br.inatel.projeto.view.ControleFrame_User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class LoginAction {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    public void RealizaLogin(String usuario, String senha)
    {
        
        boolean sucesso = false;
        conn = MySqlConnect.ConnectDB();
        String Sql = "SELECT * FROM system_user WHERE username=? and passord=?";
        try {
            // preparando a consulta
            pst = conn.prepareStatement(Sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            // executando a Query e retornando a tabela resultada da busca para RS
            rs = pst.executeQuery();
            // enquanto tiver linha na tabela, rs.next() anda de uma em uma linha
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bem-vindo!");
                if(rs.getInt(5) == 0) {
                    ControleFrame cf = new ControleFrame();
                    cf.setVisible(true);
                }
                
                else {
                    ControleFrame_User cfU = new ControleFrame_User();
                    cfU.setVisible(true);
                }
                
                sucesso = true;
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
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Access Denied", JOptionPane.ERROR_MESSAGE);
         }
        
    }

    
}

