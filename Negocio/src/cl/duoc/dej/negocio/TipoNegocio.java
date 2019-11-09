/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.negocio;

import cl.duoc.dej.dao.TipoDAO;
import cl.duoc.dej.entity.TipoEntity;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author boyarce
 */
public class TipoNegocio {
    
    private TipoDAO tipoDAO;
    
    public TipoNegocio()throws SQLException
    {
        tipoDAO = new TipoDAO();
    }
     public void actualizar(TipoEntity tipo){
    
        tipoDAO.actualizar(tipo);
    }    
        
    
    public void borrar(int codigo){
    
        tipoDAO.borrar(codigo);
    }    
    
    public void crear(TipoEntity tipo){
    
        tipoDAO.crear(tipo);
    }
    
//    public List<TipoEntity> buscarTodo(){
//    
//        return tipoDAO.buscarTodo();
//    }
}
