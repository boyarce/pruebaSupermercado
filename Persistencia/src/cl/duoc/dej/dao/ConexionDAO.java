/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author boyarce
 */
public class ConexionDAO {
    
    private static Connection conn;
    String url = "jdbc:mysql://localhost:8889/prueba"; 
    //tengo ese puerto (8889) en mi equipo pero cambiar a 3306 si coresponde para revisar
    String usuario = "ADMIN";
    String password = "ADMIN";

    private ConexionDAO() throws SQLException {
        DriverManager.registerDriver (new com.mysql.jdbc.Driver());
        conn = DriverManager.getConnection(url, usuario, password);
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            new ConexionDAO();
        }
        return conn;
    }
}
