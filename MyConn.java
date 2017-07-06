

package javaapplication10;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MyConn {
    private static Connection connect;
    private static String user ;
    private static String password ;
    
    private MyConn(){
         Properties pr = new Properties();
        try{
            FileInputStream inp = new FileInputStream("database.prop");
            pr.load(inp);
            inp.close();
        } catch (IOException e) { 
            JOptionPane.showMessageDialog(null, "Проблемы с файлом, содержащий драйвер и путь!");}

        String databaseURL=pr.getProperty("dbURL");

        
        String driverName = pr.getProperty("driver");
        
        String user = pr.getProperty("user");
        String password = pr.getProperty("password");
        
        Driver d = null;
        connect = null;
        Statement s = null;
        ResultSet rs = null;
        
        try{
            Class.forName(driverName);
            System.out.println("OK !!!!");
            connect = DriverManager.getConnection(databaseURL,user,password);
             
            System.out.println("Connect");
        }
         catch(ClassNotFoundException e){
            System.out.println("Fireberd JDBC driver not found");
         }
         catch(SQLException e){
            System.out.println("SQLException" +e.getMessage());
         }
         catch(Exception e) {
            System.out.println("Exception " +e.getMessage());
           JOptionPane.showMessageDialog(null, "Проблемы с соединением!");
         }
    }
    
    private static Connection getCon(){
        return connect;
    }
    
    public static boolean is_connection(){
        if (connect == null){
            return false;
        }
        return true;
    }
    
    public static Connection getConnection(){
        if (connect == null){
            MyConn myConn = new MyConn();
            connect = MyConn.getCon();
        }
        return connect;
    }

   public static void setUser(String us){
        user = us;
    }

    public static void setPassword(String pass){
        password = pass;
    }
}
