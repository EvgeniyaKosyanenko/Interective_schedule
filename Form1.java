
package javaapplication10;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class Form1 {
    int numberoflesson=6, value=1, control=0, w=0, w2=0, y=0, y2=0;
    Object[] subject,
             teachers ,
             classroom ,
             week = {"еженедельно","по верхней недели","по нижней недели"},
             mens = {"вся группа","1 половина","2 половина","1 треть","2 треть","3 треть"};
    
    String[] schedule, secretfields, choice,
             course ,
             groups,
             days = {"-", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"},
             time ;
    String[][] timetable;
    
    JFrame jfrm;
    JPanel jpnl1, jpnl2, jpnl3, jpnl4, jpnl5, jpnl6, jpnl7, jpnl8, jpnl9, jpnl10, jpnlEmpty;
    JButton jbtnSave;   
    JCheckBox checkinfo;
    JComboBox jcmb[], mainjcmb[];
    JRadioButton rbtn;
    
    public void Form1CreateAndListener(final Form1 form1) {
          Teachers1();
          //создание рабочего окна
        CreateWorkWindow createWorkWindow = new CreateWorkWindow();
        createWorkWindow.CreateWorkWindow(form1);
        //прослушка для комбобоксов
        ListenersForComboBoxes listenersForComboBoxes = new ListenersForComboBoxes();
        listenersForComboBoxes.ListenersForComboBoxes(form1);
        //прослушка для кнопок
        ListenersForButtons listenersForButtons = new ListenersForButtons();
        listenersForButtons.ListenersForButtons(form1);
    }

     public void Teachers1 () {
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
            teachers = new String[rs1.getInt(1)+1];
            int i1 = 0;
            teachers[i1++]="--Преподаватель--";
            while (rs.next()) {
                teachers[i1]=rs.getString("full_name");
                i1++;
            }
            
            /****************************/
            s = c.createStatement();
            rs1 = s.executeQuery("select count(SUBJECT) from SUBJECTS ");
            rs = s.executeQuery("select SUBJECT from SUBJECTS order by SUBJECT");
            ResultSetMetaData rsM4=rs.getMetaData();
            rs1.next();
           
            subject = new String[rs1.getInt(1)+1];
             i1 = 0;
            subject[i1++]="--Предметы--";
            while (rs.next()) {
                subject[i1]=rs.getString("SUBJECT");
                i1++;
            }
           /////////////////////////////
           /****************/
            s = c.createStatement();
            rs1 = s.executeQuery("select COUNT(*) from select_class_set ");
            rs = s.executeQuery("select ROOMS from select_class_set order by ROOMS");
            ResultSetMetaData rsM5=rs.getMetaData();
            rs1.next();
          
            classroom = new String[rs1.getInt(1)+1];
           i1 = 0;
            classroom[i1++]="--Аудитория--";
            while (rs.next()) {
                classroom[i1]=rs.getString("ROOMS");
                i1++;
            }
         /////******//////////////////
            s = c.createStatement();
            rs1 = s.executeQuery("select COUNT(DISTINCT(COURSE_NUM)) from STUDY_GROOPS ");
            rs = s.executeQuery("select DISTINCT(COURSE_NUM) from STUDY_GROOPS");
            ResultSetMetaData rsM1=rs.getMetaData();
            rs1.next();
           
            course = new String[rs1.getInt(1)+1];
            i1 = 0;
            course[i1++]="--Kурс--";
            while (rs.next()) {
                course[i1]=rs.getString("COURSE_NUM");
                i1++;
            }
             /////******//////////////////
            s = c.createStatement();
            rs1 = s.executeQuery("select COUNT(DISTINCT(GROUP_NUM)) from STUDY_GROOPS ");
            rs = s.executeQuery("select DISTINCT(GROUP_NUM) from STUDY_GROOPS");
            ResultSetMetaData rsM2=rs.getMetaData();
            rs1.next();
            //   System.out.println(rs1.getInt(1));
            groups = new String[rs1.getInt(1)+1];
            i1 = 0;
            groups[i1++]="--Группа--";
            while (rs.next()) {
                groups[i1]=rs.getString("GROUP_NUM");
                i1++;
            }
              /////******//////////////////
            s = c.createStatement();
            rs1 = s.executeQuery("select COUNT(LESS_NUM) from LESSON_TIME ");
            rs = s.executeQuery("select LESS_NUM from LESSON_TIME");
            ResultSetMetaData rsM3=rs.getMetaData();
            rs1.next();
            //   System.out.println(rs1.getInt(1));
            time = new String[rs1.getInt(1)+1];
            i1 = 0;
            time[i1++]="--Пара--";
            while (rs.next()) {
                time[i1]=rs.getString("LESS_NUM");
                i1++;
            }
            
                      
            
        } catch (SQLException ex) {
           // Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ошибка в SQL запросе: " + ex.getMessage());
            return;
        }
            }
           /////////////////////////////
    
       
                  
}