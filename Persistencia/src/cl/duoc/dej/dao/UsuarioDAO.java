/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.dao;

import cl.duoc.dej.entity.UsuarioEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author boyarce
 */
public class UsuarioDAO extends UtilDAO {
    public UsuarioDAO() throws SQLException{
        super();
    }

    public UsuarioEntity autenticacionUsuario(String nombreUsuario,
                            String contrasenia){
    
        StringBuilder consulta = new StringBuilder();
        consulta.append("SELECT CODIGO, USER, PASS ").
                append("FROM USUARIO ").
                append("WHERE USER = ? AND ").
                append("PASS = ?");
        
        UsuarioEntity usuario = null;
        
        try{
                        
            PreparedStatement ps = getConexion()
                    .prepareStatement(consulta.toString());
        
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasenia);
            
            ResultSet  rs =ps.executeQuery();
            
            while(rs.next()){
                usuario = new UsuarioEntity();
                usuario.setCodigo(rs.getInt("CODIGO"));
                usuario.setNombreUsuario(rs.getString("USER"));               
            }
            
        }catch(Exception ex){
        
        }
        
        return usuario;        
    }
}
