/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConnectionFactory {
   
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/dbconsole";
    public static final String USER_LOGIN = "root";
    public static final String USER_PASSWD = "admin";
    
    public static Connection getConnection() {

        
        Connection conn=null;
        try {
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL,USER_LOGIN,USER_PASSWD);

        } catch (SQLException ex) {
            conn=null;
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao abrir a conexão em ConnectionFactory",ex) ;       } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           
           return conn;
        }
            
      
    }
    
}
