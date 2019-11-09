/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.negocio;
import cl.duoc.dej.dao.UsuarioDAO;
import cl.duoc.dej.entity.UsuarioEntity;
import java.sql.SQLException;
/**
 *
 * @author boyarce
 */
public class LoginNegocio {
    
    private UsuarioDAO usuarioDAO;
    
    public LoginNegocio() throws SQLException {
        
        usuarioDAO = new UsuarioDAO();
    }
    
    public UsuarioEntity autenticacionEntity(String nombreUsuario,
            String contrasenia){
    
        return usuarioDAO.
                autenticacionUsuario(nombreUsuario, contrasenia);
    }
}
