/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOHIT AGARWAL
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn=null;
    public static Connection ConncerDb(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MOHIT AGARWAL\\Documents\\NetBeansProjects\\Project123\\Project123.sqlite");
            JOptionPane.showMessageDialog(null,"connection established");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
        
    }
    
    
    
}
