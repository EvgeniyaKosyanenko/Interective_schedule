/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class Form_Name_Teachers_Check {
    Object[] Teachers;
    JComboBox jc;
    
     public void Teachers1 () throws SQLException {
        try {
     
            Connection c = MyConn.getConnection();

             if (!MyConn.is_connection()) {
                 JOptionPane.showMessageDialog(null, "Проблема с подключением");
                 System.out.println("-------");
                 
             }
            //     else System.out.println("МЫ ПОДКЛЮЧИЛИСЬ К БАЗЕ!!!");

            Statement s;
            ResultSet rs;
            ResultSet rs1;

            s = c.createStatement();
            rs1 = s.executeQuery("select count(FULL_NAME) from TEACHERS ");
            rs = s.executeQuery("select FULL_NAME from TEACHERS order by FULL_NAME");
            ResultSetMetaData rsM=rs.getMetaData();
            rs1.next();
            //   System.out.println(rs1.getInt(1));
            Teachers = new String[rs1.getInt(1)+1];
            int i1 = 0;
            Teachers[i1++]="--Преподаватель--";
            while (rs.next()) {
                Teachers[i1]=rs.getString("full_name");
                i1++;
            }
        } catch (SQLException ex) {
           // Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ошибка в SQL запросе: " + ex.getMessage());
            return;
        }
}
     
     
}