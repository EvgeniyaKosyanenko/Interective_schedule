/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javaapplication10.MyTableModel;
import javaapplication10.MyBean;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Женя
 */
public class TestFrame extends JFrame {

     static int i = 0;
 
    public TestFrame() throws SQLException {
 
        super("Тестовое окно");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 
        ArrayList<MyBean> beans = new ArrayList<MyBean>();
 
      /*  for (int i = 0; i < 30; i++) {
            beans.add(new MyBean("Имя " + i, "Размер " + i, "Описание " + i,"Имя " + i, "Размер " + i, "Описание " + i ));
        }*/
        try {
              
        Connection c = MyConn.getConnection();
        Statement s=c.createStatement();
        ResultSet rs = s.executeQuery("select * from CHECK_TEACH");
        ResultSetMetaData rsM=rs.getMetaData();
        String full_name="null";
        String num_par="null";
        String groupe="null";
        String course="null";
        String days="null";
        String days1="null";
        String full_name1="null";
        
        while (rs.next()) {
                    for (int k=1; k <=rsM.getColumnCount()-5; ++k){
                     //System.out.println(" k"+ k +" - "+rs.getString(rsM.getColumnName(k)));
                        full_name=rs.getString(rsM.getColumnName(1));
                        num_par=rs.getString(rsM.getColumnName(2));
                        groupe=rs.getString(rsM.getColumnName(3));
                        course=rs.getString(rsM.getColumnName(4));
                        days=rs.getString(rsM.getColumnName(5));
                        if (days.equals("1"))
                         days1 = "понедельник";
                        else
                            if (days.equals("2"))
                            days1 = "вторник";
                            else
                                if (days.equals("3"))
                                days1 = "среда";
                                else
                                    if (days.equals("4"))
                                    days1 = "четверг";
                                    else
                                        days1 = "пятница";
                        full_name1=rs.getString(rsM.getColumnName(6));
                    }
                    System.out.println(full_name + num_par + groupe + course + days + full_name1);
                    beans.add(new MyBean(full_name,days1,num_par,course,groupe,full_name1));
        }
        
        TableModel model = new MyTableModel(beans);
        JTable table = new JTable(model);
 
        getContentPane().add(new JScrollPane(table));
 
        setPreferredSize(new Dimension(560, 520));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "нр");
        }
  }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                try {
                    new TestFrame();
                } catch (SQLException ex) {
                    //Logger.getLogger(TestFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    
}
