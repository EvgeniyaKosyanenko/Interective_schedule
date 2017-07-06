/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.*;

/**
 *
 * @author student
 */
public class NewJFrame extends javax.swing.JFrame {
    public JLabel lable;
    public JPanel[][] panel=new JPanel[6][6];
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
       
    }
    
    public void Draw(){
        String[] days={"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота"};
        //String[] times={"08:00 08:45-08:50 09:35","09:50 10:35 - 10:40 11:25","11:55 12:40 - 12:45 13:30","13:45 14:30 - 14:35 15:20","15:50 16:35 - 16:40 17:25","17:40 18:25 - 18:30 19:15"};
        String[] times={"1","2","3","4","5","6"};
        int  cell_width=(this.getWidth()-40)/6;
        int cell_height=(this.getHeight()-40)/6;
        
        for(int i=0;i<6;i++){
            lable = new JLabel();
            lable.setBounds(cell_width, 40, cell_width, 40);
            lable.setLocation(40+i*cell_width, 0);
            lable.setText(days[i]);
            lable.setFont(new Font("Verdana", Font.BOLD, 16));
            lable.setHorizontalAlignment(CENTER);
            lable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            this.add(lable);
            lable = new JLabel();
            lable.setBounds(40, cell_height, 40, cell_height);
            lable.setLocation(0, 40+i*cell_height);
            lable.setText(times[i]);
            lable.setFont(new Font("Verdana", Font.BOLD, 16));
            lable.setHorizontalAlignment(CENTER);
            lable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            this.add(lable);
            for(int j=0;j<6;j++){
                panel[i][j] = new JPanel();
                panel[i][j].setBounds(cell_width, cell_height, cell_width, cell_height);
                panel[i][j].setLocation(40+i*cell_width, 40+j*cell_height);

                //panel.setText(" ");
                panel[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                panel[i][j].setLayout(null); 
                this.add(panel[i][j]);
            }
        }   
        

    }
    
    public void makeSchedule(int course,int group,Connection c) throws SQLException{
         int  cell_width=(this.getWidth()-40)/6;
        int cell_height=(this.getHeight()-40)/6;
        System.out.println();
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                Statement s=c.createStatement();
                ResultSet rs = s.executeQuery("select * from LESSONS_OD("+(j+1)+","+(i+1)+","+group+","+course+") ");//номер пары,день недели,номер группы,курс
                ResultSetMetaData rsM=rs.getMetaData();
                String week_type="null";
                String group_count="null";
                String group_num="null";
                String course_choose="null";
                Font font_txt=new Font("Verdana", Font.BOLD, 12);
                Font plain_txt=new Font("Verdana", Font.PLAIN, 12);
                while (rs.next()) {
                    for (int k=0; k<rsM.getColumnCount(); k++){
                        //System.out.println(" "+rs.getString(rsM.getColumnName(k+1)));
                        week_type=rs.getString(rsM.getColumnName(6));
                        group_num=rs.getString(rsM.getColumnName(8));
                        group_count=rs.getString(rsM.getColumnName(7));
                        course_choose=rs.getString(rsM.getColumnName(4));
                        //System.out.println(course_choose);

                        if(!"null".equals(rs.getString(rsM.getColumnName(k+1)))&&k==8){
                            this.lable=new JLabel();
                            
                            if(week_type.equals("0")){
                                 if(!group_count.equals("1")){     
                                    JPanel tmp=new JPanel();
                                    //System.out.println(group_count+"---"+group_num)
                                    tmp.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 0, cell_width/Integer.parseInt(group_count), cell_height);
                                    tmp.setOpaque(false);
                                    tmp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                                    tmp.setLayout(null);                           
                                    this.panel[i][j].add(tmp);
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 0*cell_height/6, cell_width/Integer.parseInt(group_count), 40);
                                }else{
                                    if("1".equals(course_choose)){
                                        int count=this.panel[i][j].getComponentCount()/3;
                                        System.out.println("count "+count);
                                        this.lable.setBounds(0, 3*count*cell_height/12, cell_width, 40);                                
                                    }else
                                        this.lable.setBounds(0, 0*cell_height/6, cell_width, 40);
                                }
                            }
                            if(week_type.equals("1")){
                                 if(!group_count.equals("1")){     
                                    JPanel tmp=new JPanel();
                                    //System.out.println(group_count+"---"+group_num)
                                    tmp.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 0, cell_width/Integer.parseInt(group_count), cell_height/2);
                                    tmp.setOpaque(false);
                                    tmp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                                    tmp.setLayout(null);
                                    System.out.println(tmp);
                                    this.panel[i][j].add(tmp);
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 0*cell_height/6, cell_width/Integer.parseInt(group_count), 40);
                                }else{
                                                                         JPanel tmp=new JPanel();
                                    tmp.setBounds(0, 0, cell_width, cell_height/2);
                                    tmp.setOpaque(false);
                                    tmp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                                    tmp.setLayout(null);
                                    this.panel[i][j].add(tmp);
                                        this.lable.setBounds(0, 0*cell_height/6, cell_width, 40);
                                }
                            }
                            
                             if(week_type.equals("2")){
                             
                                //JPanel tmp=new JPanel();
                                 if(!group_count.equals("1")){
                                    JPanel tmp=new JPanel();
                                    tmp.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), cell_height/2, cell_width/Integer.parseInt(group_count), cell_height/2);
                                    tmp.setOpaque(false);
                                    tmp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                                    tmp.setLayout(null);
                                    this.panel[i][j].add(tmp);
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), cell_height/2, cell_width/Integer.parseInt(group_count), 40);
                                }else{

                                    this.lable.setBounds(0, 3*cell_height/6, cell_width, 40);
                                }
                             }
                             
                             
                                /*
                            if(!group_count.equals("0")){
                                JPanel tmp=new JPanel();
                                tmp.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 0, cell_width/Integer.parseInt(group_count), cell_height);
                                System.out.println(group_num);
                                tmp.setOpaque(false);
                                tmp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                                tmp.setLayout(null);
                                frame.panel[i][j].add(tmp);
                                frame.lable.setBounds(0, 0*cell_height/6, cell_width/Integer.parseInt(group_count), 40);
                            }*/
                            this.lable.setFont(font_txt);
                            this.lable.setText(rs.getString(rsM.getColumnName(k+1)));
                            this.lable.setHorizontalAlignment(CENTER);
                            this.panel[i][j].add(this.lable);

                        }
                        if(!"null".equals(rs.getString(rsM.getColumnName(k+1)))&&k==9){
                            this.lable=new JLabel();
                            this.lable.setText(rs.getString(rsM.getColumnName(k+1)));
                            if(week_type.equals("0")){
                                if("1".equals(course_choose)){
                                    int count=this.panel[i][j].getComponentCount()/3;

                                    this.lable.setBounds(3*cell_width/4, 3*count*cell_height/12+20, cell_width, 40);                                
                                }else   
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 3*cell_height/12, cell_width/Integer.parseInt(group_count), 40);
                            }
                                
                            if(week_type.equals("1"))
                                this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 2*cell_height/8, 150, 40);
                            if(week_type.equals("2"))
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 6*cell_height/8, cell_width/Integer.parseInt(group_count), 40);
                            
                            
                            
                            this.lable.setFont(font_txt);
                            //frame.lable.setLocation(2*cell_width,2*cell_height+40);

                            this.lable.setHorizontalAlignment(LEFT);
                            this.panel[i][j].add(this.lable);
                        }
                        if(!"null".equals(rs.getString(rsM.getColumnName(k+1)))&&k==10){
                            this.lable=new JLabel();
                            if(week_type.equals("0")){
                                if("1".equals(course_choose)){
                                    int count=this.panel[i][j].getComponentCount()/3;
                                    System.out.println("count "+count);
                                    this.lable.setBounds(0, 3*count*cell_height/12+20, cell_width, 40);                                
                                }else      
                                    this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), cell_height/6,cell_width/Integer.parseInt(group_count),40);
                            }
                                
                            if(week_type.equals("1"))
                                this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 1*cell_height/8,150,40);
                            
                            
                            if(week_type.equals("2"))
                                this.lable.setBounds((Integer.parseInt(group_num)-1)*cell_width/Integer.parseInt(group_count), 5*cell_height/8,150,40);
                            this.lable.setFont(plain_txt);
                            //frame.lable.setLocation(2*cell_width,2*cell_height+80);
                            this.lable.setText(rs.getString(rsM.getColumnName(k+1)));
                            this.lable.setHorizontalAlignment(CENTER);
                            this.panel[i][j].add(this.lable);
                        }

                        

                        

                    }
                    /*1.форма обучения(дневная,ночная),
                     2.комментарий,
                     3.курс по выбору или нет,
                     4.(0-лекция,1-практика),
                     5.(0-обычная,1-верхняя,2-нижняя),
                     7.номер подгруппы,
                     6.количество подгрупп,
                     8.предмет,
                     9.аудитория,
                     10.преподаватель*/



                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
