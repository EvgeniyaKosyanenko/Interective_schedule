
package javaapplication10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

class CreateWorkWindow {

    public void CreateWorkWindow(final Form1 form1) {
        //try{
        JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        JMenu jMenu2 = new javax.swing.JMenu();
        JMenu jMenu3 = new javax.swing.JMenu();
        JMenu jMenu4 = new javax.swing.JMenu();
        JMenu jMenu5 = new javax.swing.JMenu();
        
      //  Font font = new Font("Verdana", Font.ITALIC, 10);
          JMenu imgFileItem1 = new JMenu("Список преподавателей");
         
       // imgFileItem1.setFont(font);
        jMenu2.add(imgFileItem1);
        
        JMenuItem newVenu = new JMenuItem("Добавить данные");
        imgFileItem1.add(newVenu);
        JMenuItem newVenu2 = new JMenuItem("Изменить данные");
        imgFileItem1.add(newVenu2);
        JMenuItem newVenu3 = new JMenuItem("Удалить данные");
        imgFileItem1.add(newVenu3); 
        
        JMenuItem imgFileItem2 = new JMenu("Список предметов");
        //imgFileItem2.setFont(font);
        jMenu2.add(imgFileItem2);
        JMenuItem dd = new JMenuItem("Добавить данные");
        imgFileItem2.add(dd);
        JMenuItem id = new JMenuItem("Изменить данные");
        imgFileItem2.add(id);
        JMenuItem yd = new JMenuItem("Удалить данные");
        imgFileItem2.add(yd); 
        
        
        
        JMenuItem imgFileItem3 = new JMenu("Список аудиторий");
       // imgFileItem3.setFont(font);
        jMenu2.add(imgFileItem3);
        JMenuItem newVenu111 = new JMenuItem("Добавить данные");
        imgFileItem3.add(newVenu111);
        JMenuItem newVenu222 = new JMenuItem("Изменить данные");
        imgFileItem3.add(newVenu222);
        JMenuItem newVenu333 = new JMenuItem("Удвлить данные");
        imgFileItem3.add(newVenu333);
        
        
        JMenuItem imgFileItem33 = new JMenuItem("Посмотреть");
      //  imgFileItem33.setFont(font);
        jMenu3.add(imgFileItem33);

       
        JMenuItem imgFileItem4 = new JMenuItem("О преподавателях");
       // imgFileItem3.setFont(font);
        jMenu4.add(imgFileItem4);
        
         JMenuItem imgFileItem5 = new JMenuItem("Проверить пересечение аудиторий");
       // imgFileItem3.setFont(font);
        jMenu5.add(imgFileItem5);
        
        JMenuItem imgFileItem51 = new JMenuItem("Проверить пересечение пар");
       // imgFileItem3.setFont(font);
        jMenu5.add(imgFileItem51);
        
         JMenuItem imgFileItem52 = new JMenuItem("Проверить пересечение преподавателей");
       // imgFileItem3.setFont(font);
        jMenu5.add(imgFileItem52);
        
        newVenu.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent arg0) {
              String[] name_txt = {"INSERT INTO TEACHERS (FIRST_NAME, SECOND_NAME, LAST_NAME, DEGREE) VALUES (?,?,?,?)","Фамилия преподавателя","Имя преподавателя","Отчество преподавателя","Степень"};
              NewJFrame1 NewJFrame = new NewJFrame1(name_txt.length,name_txt);
             // int chek1 = NewJFrame.check;
             // System.out.println("check1");
              NewJFrame.show();
             }

        });
        
        newVenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
             }
        });
        
        newVenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
            }
        });
        
         dd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            String[] name_txt = {"insert into SUBJECTS(SUBJECT,SUBJECT_ABBR) values (?,?)","Название предмета","Аббревиатура"};
                
            NewJFrame1 NewJFrame = new NewJFrame1(name_txt.length,name_txt);
            NewJFrame.show();
            }
        });
         
         id.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
            }
        });
         
         yd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
            }
        });

         newVenu111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              String[] name_txt = {"insert into CLASSROOMS(CLASSROOM,CAPACITY) values (?,?)","Номер аудитории","Вместимость"};
              NewJFrame1 NewJFrame = new NewJFrame1(name_txt.length,name_txt);
              NewJFrame.show();
             }

        });
         
         newVenu222.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
            }
        });
         
         newVenu333.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Данная функция не доступна в данной версии программы");
            }
        });
         
         imgFileItem33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              CourseAndGroup NewJFrame = new CourseAndGroup();
              NewJFrame.show();
             }

        });
         
         imgFileItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              Info_Teachers Name_Teachers_check = new Info_Teachers();
              Name_Teachers_check.show();
             }

        });
        
        imgFileItem52.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              Frame_Table_Teachers newJFrame11 = null;
                try {
                    newJFrame11 = new Frame_Table_Teachers();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateWorkWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
              newJFrame11.show();
             }

        });
        

        jMenu2.setText("Справочники");
        jMenuBar1.add(jMenu2);
        
        jMenu3.setText("Расписание");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Проверка базы");
        jMenuBar1.add(jMenu5);
        
        jMenu4.setText("Дополнительная информация");
        jMenuBar1.add(jMenu4);
        
        
        
        form1.mainjcmb = new JComboBox[4];
        form1.mainjcmb[0] = new JComboBox(form1.course);
        form1.mainjcmb[0].setName("0");
        form1.mainjcmb[0].setToolTipText("Курс");
        form1.mainjcmb[1] = new JComboBox(form1.groups);
        form1.mainjcmb[1].setName("1");
        form1.mainjcmb[1].setToolTipText("Группа");
        form1.mainjcmb[2] = new JComboBox(form1.days);
        form1.mainjcmb[2].setName("2");
        form1.mainjcmb[2].setToolTipText("День недели");
        form1.mainjcmb[3] = new JComboBox(form1.time);
        form1.mainjcmb[3].setName("3");
        form1.mainjcmb[3].setToolTipText("Номер пары");
       // form1.mainjcmb[4].new JComboBox(form1.time);
        form1.checkinfo = new JCheckBox("проверка"); 
        form1.checkinfo.setBackground(Color.lightGray);
       // checkinfo = new Checkbox("Red");
        
        
        form1.jcmb = new JComboBox[5*9];
        //Color color = new Color(194, 0, 42);
        int q=0, x=0, y=0;
        while (q!=form1.jcmb.length) {
            form1.jcmb[q]= new JComboBox(form1.subject);
            //form1.jcmb[q].setBackground(color);
            form1.jcmb[q].setName(x+":"+y);
            q++; y++;
            form1.jcmb[q]= new JComboBox(form1.teachers);
            //form1.jcmb[q].setBackground(color);
            form1.jcmb[q].setName(x+":"+y);
            q++; y++;
            form1.jcmb[q]= new JComboBox(form1.classroom);
            //form1.jcmb[q].setBackground(color);
            form1.jcmb[q].setName(x+":"+y);
            q++; y++;
            form1.jcmb[q]= new JComboBox(form1.week);
            //form1.jcmb[q].setBackground(color);
            form1.jcmb[q].setName(x+":"+y);
            q++; y++;
            form1.jcmb[q]= new JComboBox(form1.mens);
            //form1.jcmb[q].setBackground(color);
            form1.jcmb[q].setName(x+":"+y);
            q++;
            x++; y=0;
        }

        //Первая панель (курс, группа, день недели, номер пары)
        form1.jpnl1 = new JPanel();
        form1.jpnl1.setPreferredSize(new Dimension(1140, 40));
        form1.jpnl1.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        form1.jpnl1.setBackground(Color.lightGray);
        form1.jpnl1.add(form1.mainjcmb[0]);
        form1.jpnl1.add(form1.mainjcmb[1]);
        form1.jpnl1.add(form1.mainjcmb[2]);
        form1.jpnl1.add(form1.mainjcmb[3]);
        form1.jpnl1.add(form1.checkinfo);

        //Третья панель(низ, где кнопка сохранить)
        form1.jpnl3 = new JPanel();
        form1.jpnl3.setPreferredSize(new Dimension(1130, 40));
        form1.jpnl3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        form1.jpnl3.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl3.setBackground(Color.lightGray);
        form1.jbtnSave = new JButton("Сохранить");
        form1.jpnl3.add(form1.jbtnSave);
        

        //Пятая панель
        form1.jpnl5 = new JPanel();
        form1.jpnl5.setPreferredSize(new Dimension(365, 335));
        form1.jpnl5.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl5.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl5.setBackground(Color.lightGray);

        //Шестая панель(преподаватель)
        form1.jpnl6 = new JPanel();
        form1.jpnl6.setPreferredSize(new Dimension(155, 335));
        form1.jpnl6.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl6.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl6.setBackground(Color.lightGray);

        //Седьмая панель
        form1.jpnl7 = new JPanel();
        form1.jpnl7.setPreferredSize(new Dimension(265, 335));
        form1.jpnl7.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl7.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl7.setBackground(Color.lightGray);

        //Восьмая панель
        form1.jpnl8 = new JPanel();
        form1.jpnl8.setPreferredSize(new Dimension(155, 335));
        form1.jpnl8.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl8.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl8.setBackground(Color.lightGray);

        //Девятая панель
        form1.jpnl9 = new JPanel();
        form1.jpnl9.setPreferredSize(new Dimension(110, 335));
        form1.jpnl9.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl9.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl9.setBackground(Color.lightGray);
        
        //Десятая панель
        form1.jpnl10 = new JPanel();
        form1.jpnl10.setPreferredSize(new Dimension(30, 335));
        form1.jpnl10.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl10.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl10.setBackground(Color.lightGray);
        form1.rbtn = new JRadioButton();
        form1.rbtn.setBackground(Color.lightGray);
        form1.rbtn.setToolTipText("Создание курса по выбору");
        JLabel jlbl;
        jlbl = new JLabel("Курса по выбору");
        //jlbl.set
       // form1.jpnl10.add(jlbl);
        form1.jpnl10.add(form1.rbtn);

        //Четвертая панель
        form1.jpnl4 = new JPanel();
        form1.jpnl4.setPreferredSize(new Dimension(1130, 375));
        form1.jpnl4.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl4.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnl4.setBackground(Color.lightGray);
        form1.jpnl4.add(form1.jpnl10);
        form1.jpnl4.add(form1.jpnl5);
        form1.jpnl4.add(form1.jpnl6);
        form1.jpnl4.add(form1.jpnl7);
        form1.jpnl4.add(form1.jpnl8);
        form1.jpnl4.add(form1.jpnl9);

        //Пустая панель
        form1.jpnlEmpty = new JPanel();
        form1.jpnlEmpty.setPreferredSize(new Dimension(730, 10));
        form1.jpnlEmpty.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnlEmpty.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        form1.jpnlEmpty.setBackground(Color.lightGray);
        
        //Вторая панель
        form1.jpnl2 = new JPanel();
        form1.jpnl2.setPreferredSize(new Dimension(1140, 445));
        form1.jpnl2.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jpnl2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        form1.jpnl2.setBackground(Color.lightGray);     
        form1.jpnl2.add(form1.jpnlEmpty);
        form1.jpnl3.setVisible(false);
        form1.jpnl4.setVisible(false);
        form1.jpnl2.add(form1.jpnl4);
        form1.jpnl2.add(form1.jpnl3);

        //Главная панель
        form1.jfrm = new JFrame("Редактор расписания");
        form1.jfrm.setLayout(new FlowLayout(FlowLayout.CENTER));
        form1.jfrm.setSize(1170, 540);
        form1.jfrm.setResizable(false);
        form1.jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1.jfrm.setJMenuBar(jMenuBar1);
        form1.jfrm.add(form1.jpnl1);
        form1.jfrm.add(form1.jpnl2);

        int a=0;
        for (int i=0; i<9; i++) {
            if (i>0&i<4) {
                form1.jcmb[a].setBackground(Color.yellow);
                form1.jcmb[a+1].setBackground(Color.yellow);
                form1.jcmb[a+2].setBackground(Color.yellow);
                form1.jcmb[a+3].setBackground(Color.yellow);
                form1.jcmb[a+4].setBackground(Color.yellow);
                form1.jcmb[a].setVisible(false);
                form1.jcmb[a+1].setVisible(false);
                form1.jcmb[a+2].setVisible(false);
                form1.jcmb[a+3].setVisible(false);
                form1.jcmb[a+4].setVisible(false);
            }
            if (i>3&i<9) {
                form1.jcmb[a].setBackground(Color.LIGHT_GRAY);
                form1.jcmb[a+1].setBackground(Color.LIGHT_GRAY);
                form1.jcmb[a+2].setBackground(Color.LIGHT_GRAY);
                form1.jcmb[a+3].setBackground(Color.LIGHT_GRAY);
                form1.jcmb[a+4].setBackground(Color.LIGHT_GRAY);
                form1.jcmb[a].setVisible(false);
                form1.jcmb[a+1].setVisible(false);
                form1.jcmb[a+2].setVisible(false);
                form1.jcmb[a+3].setVisible(false);
                form1.jcmb[a+4].setVisible(false);
            }
            form1.jpnl5.add(form1.jcmb[a]);
            form1.jpnl6.add(form1.jcmb[a+1]);
            form1.jpnl7.add(form1.jcmb[a+2]);
            form1.jpnl8.add(form1.jcmb[a+3]);
            form1.jpnl9.add(form1.jcmb[a+4]);
            a+=5;
        }
        
        form1.timetable = new String[9][5];
        
        for (int i=0; i<9; i++) {
            for (int k=0; k<5; k++) {
                if (k<3) form1.timetable[i][k]="пусто";
                else if (k==3) form1.timetable[i][k]="еженедельно";
                     else if (k==4) form1.timetable[i][k]="вся группа";
                //System.out.print(form1.timetable[i][k]+" ");
            }
            //System.out.println();
        }
  
    }
}
