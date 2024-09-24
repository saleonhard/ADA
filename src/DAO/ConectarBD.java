/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.*;
import javax.management.RuntimeErrorException;
import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author 518141027
 */
public class ConectarBD {

    private static final String DRIVER = "com.mysql.jdbc.Driver" ;
    private static final String USER = "root";
    private static final String SENHA = "123456789";
    private static final String URL = "jdbc:mysql://localhost:3306/ada_db";
    
    
   
    public static java.sql.Connection conectar() {
        System.out.println("Conectando ao banco.......");
        try {
            Class.forName(DRIVER);
            System.out.println("Conectando ao banco.......");
            return DriverManager.getConnection(URL,USER,SENHA);
            
            

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
        return null;
    }
    

    

    public static void desconectar(Connection con, PreparedStatement pstmt, ResultSet rs) {
        
        
        try{
        
        if(con!=null){
        
        con.close();
        }
        if(pstmt!=null){
        
            pstmt.close();
            
        }
        
        if(rs!=null){
        
            rs.close();
            
        }
        
        
        
        }catch (SQLException ex) {
           
            
            ex.printStackTrace();
        }
        
        
        
        
    }

    

    
}
