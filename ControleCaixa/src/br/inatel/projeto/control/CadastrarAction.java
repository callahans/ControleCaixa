/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.control;

import br.inatel.projeto.model.MySqlConnect;
import br.inatel.projeto.view.CadastroFrame;
import br.inatel.projeto.view.ControleFrame;
import br.inatel.projeto.view.ControleFrame_User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;

/**
 *
 * @author Daniel
 */
public class CadastrarAction {
    
    Connection conn = null;
    //PreparedStatement pst = null;
    //ResultSet rs = null; 
    
    public void RealizaCadastro(int id, String nome, String usuario, String senha, int tipoConta, int setor) throws SQLException
    {
        
        conn = MySqlConnect.ConnectDB();
        CallableStatement cStmt = conn.prepareCall("{call newUser(?, ?, ?, ?, ?, ?)}");
        //String Sql = "INSERT INTO component(id, nome, username, passord, account_type) VALUES (?, ?, ?, ?, ?); INSERT INTO sector_system_user(sector_id, system_user_id) VALUES (?, ?)";
        try {
            
            //pst = conn.prepareStatement(Sql);
            cStmt.setInt(1, id);
            cStmt.setString(2, nome);
            cStmt.setString(3, usuario);
            cStmt.setString(4, senha);
            cStmt.setInt(5, tipoConta);
            cStmt.setInt(6, setor);
            /*
            pst.setString(1, id);
            pst.setString(2, nome);
            pst.setString(3, usuario);
            pst.setString(4, senha);
            pst.setString(5, tipoConta);
            pst.setString(6, id);
            pst.setString(7, setor);
            pst.executeUpdate();
            */
            cStmt.execute();
            
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    
}

