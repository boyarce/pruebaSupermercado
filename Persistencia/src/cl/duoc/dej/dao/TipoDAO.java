/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.dao;

import cl.duoc.dej.entity.TipoEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author boyarce
 */
public class TipoDAO extends UtilDAO {

    private static final Logger LOGGER = Logger.
            getLogger(TipoDAO.class.getName());

    public TipoDAO() throws SQLException {
        super();
    }

    public void actualizar(TipoEntity tipo) {
        StringBuilder consulta = new StringBuilder();
        consulta.append("UPDATE TIPO SET NOMBRE = ?").
                append(" WHERE CODIGO = ? ");

        LOGGER.info("EJECUCIÓN -> " + consulta.toString());
        try {
            PreparedStatement ps = getConexion().
            prepareStatement(consulta.toString());
            ps.setString(1, tipo.getNombre());
            ps.setInt(2, tipo.getCodigo());

            boolean ejecucion = ps.execute();

        } catch (Exception ex) {

            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
    public void crear(TipoEntity tipo) {

        StringBuilder consulta = new StringBuilder();
        consulta.append("INSERT INTO TIPO (CODIGO, NOMBRE) ").
                append(" VALUES (?, ?) ");

        LOGGER.info("EJECUCIÓN -> " + consulta.toString());

        try {
            PreparedStatement ps = getConexion().
                    prepareStatement(consulta.toString());
            ps.setInt(1, tipo.getCodigo());
            ps.setString(2, tipo.getNombre());
            

            boolean ejecucion = ps.execute();

        } catch (Exception ex) {

            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
     public void borrar(int codigo) {

        StringBuilder consulta = new StringBuilder();
        consulta.append("DELETE FROM TIPO WHERE CODIGO = ? ");

        LOGGER.info("EJECUCIÓN -> " + consulta.toString());

        try {
            PreparedStatement ps = getConexion().
                    prepareStatement(consulta.toString());
            ps.setInt(1, codigo);

            boolean ejecucion = ps.execute();

        } catch (Exception ex) {

            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

//     public List<TipoEntity> buscarTodo() {
//
//        List<TipoEntity> tipos = new ArrayList<>();
//
//        StringBuilder consulta = new StringBuilder();
//        consulta.append("SELECT CODIGO, NOMBRE ").
//                append("FROM TIPO ");
//
//        LOGGER.info("EJECUCIÓN -> " + consulta.toString());
//
//        try {
//            PreparedStatement ps = getConexion().
//                    prepareStatement(consulta.toString());
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                TipoEntity tipo = new TipoEntity(
//                        rs.getInt("CODIGO"),
//                        rs.getString("NOMBRE"));
//                      
//                tipos.add(tipo);
//            }
//
//        } catch (Exception ex) {
//
//            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
//        }
//
//        return tipos;
//    }
}
