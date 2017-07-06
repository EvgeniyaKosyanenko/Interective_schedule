
package javaapplication10;

import java.awt.event.*;
import java.sql.Array;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ListenersForButtons {

    public void ListenersForButtons(final Form1 form1) {
        form1.rbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (form1.rbtn.isSelected()) {
                    for (int i=5; i<20; i++) {
                        form1.jcmb[i].setVisible(true);
                    }
                    form1.w=form1.jcmb[1].getSelectedIndex();
                    form1.w2=form1.jcmb[2].getSelectedIndex();
                    form1.jcmb[1].setSelectedIndex(0);
                    form1.jcmb[2].setSelectedIndex(0);
                    form1.jcmb[1].setEnabled(false);
                    form1.jcmb[2].setEnabled(false);

                    form1.jcmb[0].addItem("Курс по выбору");
                    form1.jcmb[0].setSelectedIndex(form1.jcmb[0].getItemCount()-1);
                    form1.jcmb[0].setEnabled(false);
                } else {
                    for (int j=5; j<20; j++) {
                        form1.jcmb[j].setVisible(false);
                    }
                    form1.jcmb[1].setSelectedIndex(form1.w);
                    form1.jcmb[2].setSelectedIndex(form1.w2);
                    form1.jcmb[1].setEnabled(true);
                    form1.jcmb[2].setEnabled(true);

                    form1.jcmb[0].removeItemAt(form1.jcmb[0].getItemCount()-1);
                    form1.jcmb[0].setSelectedIndex(0);
                    form1.jcmb[0].setEnabled(true);
                }

            }
        });
         EnteringData OBJEC1 = new EnteringData(); // результат нашего выбора
        OBJEC1.setCourse((String)form1.mainjcmb[0].getSelectedItem());
        OBJEC1.setGroups((String)form1.mainjcmb[1].getSelectedItem());
        OBJEC1.setDay_of_week((String)form1.mainjcmb[2].getSelectedItem());
        OBJEC1.setTime((String)form1.mainjcmb[3].getSelectedItem());
      
        System.out.println("check " + form1.checkinfo.isSelected());
    //   System.out.println( "checkobject " +form1.checkinfo.get);
         System.out.println("check1 " + form1.checkinfo.isSelected());
     //    System.out.println("check1 " + form1.checkinfo.setSelected(true));
        //OBJEC1.setCh(form1.checkinfo.doClick());
        
        OBJEC1.EnteringDataWrite();
        form1.jbtnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String info="";
                for (int j=0; j<form1.mainjcmb.length; j++) {
                    info+=form1.mainjcmb[j].getSelectedItem();
                    info+="_";
                }
                //
                System.out.println(info);
                String smain="";
                for (int i=0; i<9; i++) {
                    String s="";
                    for (int k=0; k<5; k++) {
                        s+=form1.timetable[i][k];
                        if (k<4) s+="_";
                    }
                    smain+=s;
                    if (i<8) smain+=":";
                }

 //System.out.println(smain);

                String h[]=smain.split(":"), h2[], h3[], st="";
                h2=h[0].split("_");
                if (!h2[0].equals("Курс по выбору")) {
                    h[1]="";
                    h[2]="";
                    h[3]="";
                } else {
                    h3=h[1].split("_");h[1]="1 ";
                    h3[3]="пусто";
                    h3[4]="пусто"; int t0;
                    for (t0=0; t0<h3.length; t0++) {
                        h[1]+=h3[t0]; h[1]+="_";
                    }
                    //System.out.println(h[1]);

                    h3=h[2].split("_");h[2]="2 ";
                    h3[3]="пусто";
                    h3[4]="пусто";
                    for (t0=0; t0<h3.length; t0++) {
                        h[2]+=h3[t0]; h[2]+="_";
                    }

                    h3=h[3].split("_");h[3]="3 ";
                    h3[3]="пусто";
                    h3[4]="пусто";
                    for (t0=0; t0<h3.length; t0++) {
                        h[3]+=h3[t0]; h[3]+="_";
                    }
                }
                if (h2[3].equals("еженедельно")) {
                    h[6]="";
                    if (h2[4].equals("вся группа")) {
                        h[4]="";
                        h[5]="";
                        h[7]="";
                        h[8]="";
                    }
                    if (h2[4].equals("1 половина")||(h2[4].equals("2 половина"))) {
                        h[5]="";
                        h[7]="";
                        h[8]="";
                    }
                } else {
                    if (h2[4].equals("вся группа")) {
                        h[4]="";
                        h[5]="";
                    }
                    if (h2[4].equals("1 половина")||(h2[4].equals("2 половина"))) {
                        h[5]="";
                    }

                    h3=h[6].split("_");
                    if (h3[4].equals("вся группа")) {
                        h[7]="";
                        h[8]="";
                    }
                    if (h3[4].equals("1 половина")||(h2[4].equals("2 половина"))) {
                        h[8]="";
                    }
                }
                for (int y=0; y<h.length; y++) {
                    //System.out.println(h[y]+" "+y);
                    h2=h[y].split("_");
                    if (h2.length>1)
                        if (h2[0].equals("пусто")&h2[1].equals("пусто")&h2[2].equals("пусто")) {
                            h[y]="";
                        }
                }

                for (int y=0; y<h.length; y++) {
                    System.out.println(h[y]);
                }


               /* for (int y=0; y<h.length; y++) {

                    h3=h[y].split("_");
                    for (int z=0; z<h3.length; z++) {
                        if (!h3[z].equals("пусто")&!h3[z].equals("")) {
                            st+=h3[z];
                            st+="_";
                        }
                    }
                    //System.out.println(st+" "+"*");
                }
                info+=st;
                System.out.println(info);*/

                
        EnteringData OBJEC1[]  = new EnteringData[9]; // результат нашего выбора
        int j = 0;
        for (int cj = 0; cj < form1.jcmb.length ; cj++ )
             
              {
                    if(((String)form1.jcmb[cj].getSelectedItem()).equals("--Предметы--"))
                    {
                    OBJEC1[j] = new EnteringData();
                    OBJEC1[j].EnteringDataWrite();
                    System.out.println();
                    cj= cj+4;
                    j++;
                    }
                    else{
                            if( ((String)form1.jcmb[cj].getSelectedItem()).equals("Курс по выбору") )
                            {
                            OBJEC1[j] = new EnteringData();
                            OBJEC1[j].EnteringDataWrite();
                            System.out.println();
                            cj= cj+5;
                            j++;
                            int k;
                            for ( k = j ;k<j+3; k++)
                                {
                                OBJEC1[k] = new EnteringData();
                                OBJEC1[k].setCourse((String)form1.mainjcmb[0].getSelectedItem());
                                OBJEC1[k].setGroups((String)form1.mainjcmb[1].getSelectedItem());
                                OBJEC1[k].setDay_of_week((String)form1.mainjcmb[2].getSelectedItem());
                                
                               if((form1.mainjcmb[2].getSelectedItem().equals("Понедельник")))OBJEC1[k].setDay_of_week("1");
                                   else{  
                                   if((form1.mainjcmb[2].getSelectedItem().equals("Вторник")))OBJEC1[k].setDay_of_week("2");
                                   else{
                                        if((form1.mainjcmb[2].getSelectedItem().equals("Среда")))OBJEC1[k].setDay_of_week("3");
                                     else{
                                          if((form1.mainjcmb[2].getSelectedItem().equals("Четверг")))OBJEC1[k].setDay_of_week("4");
                                   else{
                                           if((form1.mainjcmb[2].getSelectedItem().equals("Пятница")))OBJEC1[k].setDay_of_week("5");
                                   else{
                                            if((form1.mainjcmb[2].getSelectedItem().equals("Суббота")))OBJEC1[k].setDay_of_week("6");
                                   else{
                                           if((form1.mainjcmb[2].getSelectedItem().equals("Воскресенье")))OBJEC1[k].setDay_of_week("7");
                                   else{                                       
                                           }      
                                      }    
                                      }    
                                     }   
                                        }
                                   } 
                               } 
                            OBJEC1[k].setTime((String)form1.mainjcmb[3].getSelectedItem());
                                OBJEC1[k].setSubject((String)form1.jcmb[cj++].getSelectedItem());
                                OBJEC1[k].setTeachers((String)form1.jcmb[cj++].getSelectedItem());
                                OBJEC1[k].setAudience((String)form1.jcmb[cj++].getSelectedItem());
                                OBJEC1[k].setLower_upper_week((String)form1.jcmb[cj].getSelectedItem());
                    //неделя
                     if(((String)form1.jcmb[cj].getSelectedItem()).equals("по верхней недели"))
                         {OBJEC1[k].setLower_upper_week("1");}
                     else{
                         if (((String)form1.jcmb[cj].getSelectedItem()).equals("по нижней недели")) OBJEC1[j].setLower_upper_week("2");
                             else OBJEC1[k].setLower_upper_week("0"); }
                    cj++;



                                OBJEC1[k].setNumber_of_subgroups((String)form1.jcmb[cj++].getSelectedItem());
                                OBJEC1[k].setElective_course("1");
                                OBJEC1[k].setNumber_of_subgroups("1");
                                OBJEC1[k].setNumeric_pogrummy("1");
                                OBJEC1[k].setElective_course("1");
                                OBJEC1[k].EnteringDataWrite();
                                System.out.println();
                                }
                            
                            j=k;
                            cj=cj-1;

                    }
                    else
                    {
                        if(j<=OBJEC1.hashCode()){
                    OBJEC1[j] = new EnteringData();
                    OBJEC1[j].setCourse((String)form1.mainjcmb[0].getSelectedItem());
                    OBJEC1[j].setGroups((String)form1.mainjcmb[1].getSelectedItem());
                   // OBJEC1[j].setDay_of_week((String)form1.mainjcmb[2].getSelectedItem());
                    System.out.println((form1.mainjcmb[2].getSelectedItem().equals("Понедельник")));
                    if((form1.mainjcmb[2].getSelectedItem().equals("Понедельник")))
                    {OBJEC1[j].setDay_of_week("1");}
                                   else{  
                                   if((form1.mainjcmb[2].getSelectedItem().equals("Вторник")))OBJEC1[j].setDay_of_week("2");
                                   else{
                                       
                                        if((form1.mainjcmb[2].getSelectedItem().equals("Среда")))OBJEC1[j].setDay_of_week("3");
                                     else{
                                          if((form1.mainjcmb[2].getSelectedItem().equals("Четверг")))OBJEC1[j].setDay_of_week("4");
                                   else{
                                           if((form1.mainjcmb[2].getSelectedItem().equals("Пятница")))OBJEC1[j].setDay_of_week("5");
                                   else{
                                            if((form1.mainjcmb[2].getSelectedItem().equals("Суббота")))OBJEC1[j].setDay_of_week("6");
                                   else{
                                           if((form1.mainjcmb[2].getSelectedItem().equals("Воскресенье")))OBJEC1[j].setDay_of_week("7");
                                   else{
                                               
                                           }      
                                            }    
                                           }    
                                          }   
                                        }
                                   } 
                               }
                    OBJEC1[j].setTime((String)form1.mainjcmb[3].getSelectedItem());
                    OBJEC1[j].setSubject((String)form1.jcmb[cj++].getSelectedItem());
                    OBJEC1[j].setTeachers((String)form1.jcmb[cj++].getSelectedItem());
                    OBJEC1[j].setAudience((String)form1.jcmb[cj++].getSelectedItem());
                    OBJEC1[j].setLower_upper_week((String)form1.jcmb[cj].getSelectedItem());
                    //неделя
                     if(((String)form1.jcmb[cj].getSelectedItem()).equals("по верхней недели"))
                         {OBJEC1[j].setLower_upper_week("1");}
                     else{ 
                         if (((String)form1.jcmb[cj].getSelectedItem()).equals("по нижней недели"))
                             OBJEC1[j].setLower_upper_week("2");
                         else OBJEC1[j].setLower_upper_week("0"); }
                    cj++;
                    //подгруппа номер и кол
                    OBJEC1[j].setNumber_of_subgroups((String)form1.jcmb[cj].getSelectedItem());
                    if(((String)form1.jcmb[cj].getSelectedItem()).equals("1 половина"))
                         {OBJEC1[j].setNumber_of_subgroups("2");
                          OBJEC1[j].setNumeric_pogrummy("1");}
                     else{ 
                         if(((String)form1.jcmb[cj].getSelectedItem()).equals("2 половина"))
                         {OBJEC1[j].setNumber_of_subgroups("2");
                          OBJEC1[j].setNumeric_pogrummy("2");}
                          else{
                                 if(((String)form1.jcmb[cj].getSelectedItem()).equals("1 треть"))
                                 {OBJEC1[j].setNumber_of_subgroups("3");
                                  OBJEC1[j].setNumeric_pogrummy("1");}
                                   else{
                                     if(((String)form1.jcmb[cj].getSelectedItem()).equals("2 треть"))
                                    {OBJEC1[j].setNumber_of_subgroups("3");
                                     OBJEC1[j].setNumeric_pogrummy("2");}
                                      else{
                                          if(((String)form1.jcmb[cj].getSelectedItem()).equals("3 треть"))
                                         {OBJEC1[j].setNumber_of_subgroups("3");
                                          OBJEC1[j].setNumeric_pogrummy("3");}
                                          else{
                                              OBJEC1[j].setNumber_of_subgroups("1");
                                               OBJEC1[j].setNumeric_pogrummy("1");
                                 
                                               }
                                 
                                            }
                                 
                                        }
                             
                                }
                    }
                    if (form1.checkinfo.isSelected()) {
                       OBJEC1[j].setCh("1");
                    } 
                    else {
                       OBJEC1[j].setCh("0"); 
                    }
                   
                    OBJEC1[j].EnteringDataWrite();
                    System.out.println();
                    j++;
                    }
                    }
                    }



               }
            for (j=0; j<OBJEC1.length; j++) {
                if (!(OBJEC1[j].getSubject()).equals("") && !(OBJEC1[j].getSubject()).equals("--Предметы--") )
                {
                        try {
                            OBJEC1[j].Send_to_thedatabase();
                            System.out.println("////"+j);
                        } catch (SQLException ex) {
                            //Logger.getLogger(ListenersForButtons.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            }

            for (j=0; j<form1.mainjcmb.length; j++) {
                form1.mainjcmb[j].setSelectedIndex(0);
            }
            for ( j=0; j<form1.jcmb.length; j++) {
                form1.jcmb[j].setSelectedIndex(0);
            }
            form1.jpnl3.setVisible(false);
            form1.jpnl4.setVisible(false);
        
         }

        });

    }

}
