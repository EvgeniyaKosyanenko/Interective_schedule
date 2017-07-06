
package javaapplication10;

import java.awt.event.*;

class ListenersForComboBoxes {

    public void ListenersForComboBoxes(final Form1 form1) {
        int u;
        for (u=0; u<form1.mainjcmb.length; u++) {
            form1.mainjcmb[u].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent le) {
                    //System.out.println(le.toString());
                    boolean selectionIsMade=true;
                    for (int j=0; j<form1.mainjcmb.length-1; j++) {
                        //System.out.println(form1.mainjcmb[j].getSelectedItem());
                        if (form1.mainjcmb[j].getSelectedItem().equals("-")) selectionIsMade=false;
                    }
                    if (form1.mainjcmb[form1.mainjcmb.length-1].getSelectedItem().equals("--Пара--")) selectionIsMade=false;
                    if (selectionIsMade==true) {

                        form1.jpnl3.setVisible(true);
                        form1.jpnl4.setVisible(true);
                        //form1.jfrm.setSize(770, 540);
                    }
                }
            });
        }
     


        for (u=0; u<form1.jcmb.length; u++) {
            form1.jcmb[u].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent le) {
                    String c[]=le.getSource().toString().split("="),
                           word=c[c.length-1].substring(0, c[c.length-1].length()-1);
                    c=le.toString().split(" ");
                    int ii=Integer.parseInt(c[c.length-1].split(":")[0]),
                        jj=Integer.parseInt(c[c.length-1].split(":")[1]);
                    if (word.equals("-")) word="пусто";
                    

                    if (word.equals("по верхней недели")&jj==3&ii==0) {
                        form1.jcmb[30].setVisible(true);
                        form1.jcmb[31].setVisible(true);
                        form1.jcmb[32].setVisible(true);
                        form1.jcmb[33].setSelectedIndex(2);
                        form1.jcmb[33].setEnabled(false);
                        form1.jcmb[33].setVisible(true);
                        form1.jcmb[34].setVisible(true);

                        form1.jcmb[23].setSelectedIndex(1);
                        form1.jcmb[23].setEnabled(false);
                        form1.jcmb[28].setSelectedIndex(1);
                        form1.jcmb[28].setEnabled(false);

                        form1.jcmb[8].setSelectedIndex(1);
                        form1.jcmb[8].setEnabled(false);
                        form1.jcmb[13].setSelectedIndex(1);
                        form1.jcmb[13].setEnabled(false);
                        form1.jcmb[18].setSelectedIndex(1);
                        form1.jcmb[18].setEnabled(false);
                    }
                    if (word.equals("по нижней недели")&jj==3&ii==0) {
                        form1.jcmb[30].setVisible(true);
                        form1.jcmb[31].setVisible(true);
                        form1.jcmb[32].setVisible(true);
                        form1.jcmb[33].setSelectedIndex(1);
                        form1.jcmb[33].setEnabled(false);
                        form1.jcmb[33].setVisible(true);
                        form1.jcmb[34].setVisible(true);

                        form1.jcmb[23].setSelectedIndex(2);
                        form1.jcmb[23].setEnabled(false);
                        form1.jcmb[28].setSelectedIndex(2);
                        form1.jcmb[28].setEnabled(false);

                        form1.jcmb[8].setSelectedIndex(2);
                        form1.jcmb[8].setEnabled(false);
                        form1.jcmb[13].setSelectedIndex(2);
                        form1.jcmb[13].setEnabled(false);
                        form1.jcmb[18].setSelectedIndex(2);
                        form1.jcmb[18].setEnabled(false);
                    }
                    if (word.equals("еженедельно")&jj==3&ii==0) {
                        form1.jcmb[30].setVisible(false);
                        form1.jcmb[31].setVisible(false);
                        form1.jcmb[32].setVisible(false);
                        form1.jcmb[33].setVisible(false);
                        form1.jcmb[34].setVisible(false);
                        form1.jcmb[34].setSelectedIndex(0);

                        form1.jcmb[23].setSelectedIndex(0);
                        form1.jcmb[23].setEnabled(false);
                        form1.jcmb[28].setSelectedIndex(0);
                        form1.jcmb[28].setEnabled(false);

                        form1.jcmb[35].setVisible(false);
                        form1.jcmb[36].setVisible(false);
                        form1.jcmb[37].setVisible(false);
                        form1.jcmb[38].setVisible(false);
                        form1.jcmb[39].setVisible(false);
                        form1.jcmb[39].setEnabled(true);

                        form1.jcmb[40].setVisible(false);
                        form1.jcmb[41].setVisible(false);
                        form1.jcmb[42].setVisible(false);
                        form1.jcmb[43].setVisible(false);
                        form1.jcmb[44].setVisible(false);
                        form1.jcmb[44].setEnabled(true);

                        form1.jcmb[8].setSelectedIndex(0);
                        form1.jcmb[8].setEnabled(false);
                        form1.jcmb[13].setSelectedIndex(0);
                        form1.jcmb[13].setEnabled(false);
                        form1.jcmb[18].setSelectedIndex(0);
                        form1.jcmb[18].setEnabled(false);
                    }

                    if (word.equals("1 половина")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(true);
                        form1.jcmb[21].setVisible(true);
                        form1.jcmb[22].setVisible(true);
                        form1.jcmb[23].setVisible(true);
                        form1.jcmb[24].setSelectedIndex(2);
                        form1.jcmb[24].setVisible(true);
                        form1.jcmb[24].setEnabled(false);

                        form1.jcmb[25].setVisible(false);
                        form1.jcmb[26].setVisible(false);
                        form1.jcmb[27].setVisible(false);
                        form1.jcmb[28].setVisible(false);
                        form1.jcmb[29].setEnabled(true);
                        form1.jcmb[29].setVisible(false);

                        form1.jcmb[9].setSelectedIndex(1);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(1);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(1);
                        form1.jcmb[19].setEnabled(false);
                    }
                    if (word.equals("2 половина")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(true);
                        form1.jcmb[21].setVisible(true);
                        form1.jcmb[22].setVisible(true);
                        form1.jcmb[23].setVisible(true);
                        form1.jcmb[24].setSelectedIndex(1);
                        form1.jcmb[24].setVisible(true);
                        form1.jcmb[24].setEnabled(false);

                        form1.jcmb[25].setVisible(false);
                        form1.jcmb[26].setVisible(false);
                        form1.jcmb[27].setVisible(false);
                        form1.jcmb[28].setVisible(false);
                        form1.jcmb[29].setEnabled(true);
                        form1.jcmb[29].setVisible(false);

                        form1.jcmb[9].setSelectedIndex(2);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(2);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(2);
                        form1.jcmb[19].setEnabled(false);
                    }
                    if (word.equals("1 треть")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(true);
                        form1.jcmb[21].setVisible(true);
                        form1.jcmb[22].setVisible(true);
                        form1.jcmb[23].setVisible(true);
                        form1.jcmb[24].setSelectedIndex(4);
                        form1.jcmb[24].setVisible(true);
                        form1.jcmb[24].setEnabled(false);

                        form1.jcmb[25].setVisible(true);
                        form1.jcmb[26].setVisible(true);
                        form1.jcmb[27].setVisible(true);
                        form1.jcmb[28].setVisible(true);
                        form1.jcmb[29].setSelectedIndex(5);
                        form1.jcmb[29].setVisible(true);
                        form1.jcmb[29].setEnabled(false);

                        form1.jcmb[9].setSelectedIndex(3);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(3);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(3);
                        form1.jcmb[19].setEnabled(false);

                    }
                    if (word.equals("2 треть")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(true);
                        form1.jcmb[21].setVisible(true);
                        form1.jcmb[22].setVisible(true);
                        form1.jcmb[23].setVisible(true);
                        form1.jcmb[24].setSelectedIndex(3);
                        form1.jcmb[24].setVisible(true);
                        form1.jcmb[24].setEnabled(false);

                        form1.jcmb[25].setVisible(true);
                        form1.jcmb[26].setVisible(true);
                        form1.jcmb[27].setVisible(true);
                        form1.jcmb[28].setVisible(true);
                        form1.jcmb[29].setSelectedIndex(5);
                        form1.jcmb[29].setVisible(true);
                        form1.jcmb[29].setEnabled(false);

                        form1.jcmb[9].setSelectedIndex(4);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(4);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(4);
                        form1.jcmb[19].setEnabled(false);
                    }
                    if (word.equals("3 треть")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(true);
                        form1.jcmb[21].setVisible(true);
                        form1.jcmb[22].setVisible(true);
                        form1.jcmb[23].setVisible(true);
                        form1.jcmb[24].setSelectedIndex(3);
                        form1.jcmb[24].setVisible(true);
                        form1.jcmb[24].setEnabled(false);

                        form1.jcmb[25].setVisible(true);
                        form1.jcmb[26].setVisible(true);
                        form1.jcmb[27].setVisible(true);
                        form1.jcmb[28].setVisible(true);
                        form1.jcmb[29].setSelectedIndex(4);
                        form1.jcmb[29].setVisible(true);
                        form1.jcmb[29].setEnabled(false);

                        form1.jcmb[9].setSelectedIndex(5);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(5);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(5);
                        form1.jcmb[19].setEnabled(false);
                    }
                    if (word.equals("вся группа")&jj==4&ii==0) {
                        form1.jcmb[20].setVisible(false);
                        form1.jcmb[21].setVisible(false);
                        form1.jcmb[22].setVisible(false);
                        form1.jcmb[23].setVisible(false);
                        form1.jcmb[24].setVisible(false);
                        form1.jcmb[24].setEnabled(true);

                        form1.jcmb[25].setVisible(false);
                        form1.jcmb[26].setVisible(false);
                        form1.jcmb[27].setVisible(false);
                        form1.jcmb[28].setVisible(false);
                        form1.jcmb[29].setVisible(false);
                        form1.jcmb[29].setEnabled(true);

                        form1.jcmb[9].setSelectedIndex(0);
                        form1.jcmb[9].setEnabled(false);
                        form1.jcmb[14].setSelectedIndex(0);
                        form1.jcmb[14].setEnabled(false);
                        form1.jcmb[19].setSelectedIndex(0);
                        form1.jcmb[19].setEnabled(false);
                    }
                    if (word.equals("1 половина")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(true);
                        form1.jcmb[36].setVisible(true);
                        form1.jcmb[37].setVisible(true);
                        form1.jcmb[38].setVisible(true);
                        form1.jcmb[39].setSelectedIndex(2);
                        form1.jcmb[39].setVisible(true);
                        form1.jcmb[39].setEnabled(false);

                        form1.jcmb[40].setVisible(false);
                        form1.jcmb[41].setVisible(false);
                        form1.jcmb[42].setVisible(false);
                        form1.jcmb[43].setVisible(false);
                        form1.jcmb[44].setEnabled(true);
                        form1.jcmb[44].setVisible(false);
                    }
                    if (word.equals("2 половина")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(true);
                        form1.jcmb[36].setVisible(true);
                        form1.jcmb[37].setVisible(true);
                        form1.jcmb[38].setVisible(true);
                        form1.jcmb[39].setSelectedIndex(1);
                        form1.jcmb[39].setVisible(true);
                        form1.jcmb[39].setEnabled(false);

                        form1.jcmb[40].setVisible(false);
                        form1.jcmb[41].setVisible(false);
                        form1.jcmb[42].setVisible(false);
                        form1.jcmb[43].setVisible(false);
                        form1.jcmb[44].setEnabled(true);
                        form1.jcmb[44].setVisible(false);
                    }
                    if (word.equals("1 треть")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(true);
                        form1.jcmb[36].setVisible(true);
                        form1.jcmb[37].setVisible(true);
                        form1.jcmb[38].setVisible(true);
                        form1.jcmb[39].setSelectedIndex(4);
                        form1.jcmb[39].setVisible(true);
                        form1.jcmb[39].setEnabled(false);

                        form1.jcmb[40].setVisible(true);
                        form1.jcmb[41].setVisible(true);
                        form1.jcmb[42].setVisible(true);
                        form1.jcmb[43].setVisible(true);
                        form1.jcmb[44].setSelectedIndex(5);
                        form1.jcmb[44].setVisible(true);
                        form1.jcmb[44].setEnabled(false);

                    }
                    if (word.equals("2 треть")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(true);
                        form1.jcmb[36].setVisible(true);
                        form1.jcmb[37].setVisible(true);
                        form1.jcmb[38].setVisible(true);
                        form1.jcmb[39].setSelectedIndex(3);
                        form1.jcmb[39].setVisible(true);
                        form1.jcmb[39].setEnabled(false);

                        form1.jcmb[40].setVisible(true);
                        form1.jcmb[41].setVisible(true);
                        form1.jcmb[42].setVisible(true);
                        form1.jcmb[43].setVisible(true);
                        form1.jcmb[44].setSelectedIndex(5);
                        form1.jcmb[44].setVisible(true);
                        form1.jcmb[44].setEnabled(false);

                    }
                   if (word.equals("3 треть")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(true);
                        form1.jcmb[36].setVisible(true);
                        form1.jcmb[37].setVisible(true);
                        form1.jcmb[38].setVisible(true);
                        form1.jcmb[39].setSelectedIndex(3);
                        form1.jcmb[39].setVisible(true);
                        form1.jcmb[39].setEnabled(false);

                        form1.jcmb[40].setVisible(true);
                        form1.jcmb[41].setVisible(true);
                        form1.jcmb[42].setVisible(true);
                        form1.jcmb[43].setVisible(true);
                        form1.jcmb[44].setSelectedIndex(4);
                        form1.jcmb[44].setVisible(true);
                        form1.jcmb[44].setEnabled(false);
                    }
                     if (word.equals("вся группа")&jj==4&ii==6) {
                        form1.jcmb[35].setVisible(false);
                        form1.jcmb[36].setVisible(false);
                        form1.jcmb[37].setVisible(false);
                        form1.jcmb[38].setVisible(false);
                        form1.jcmb[39].setVisible(false);
                        form1.jcmb[39].setEnabled(true);

                        form1.jcmb[40].setVisible(false);
                        form1.jcmb[41].setVisible(false);
                        form1.jcmb[42].setVisible(false);
                        form1.jcmb[43].setVisible(false);
                        form1.jcmb[44].setVisible(false);
                        form1.jcmb[44].setEnabled(true);
                    }
                    if (word.equals("по верхней недели")&jj==3&ii==6) {
                        form1.jcmb[38].setSelectedIndex(1);
                        form1.jcmb[38].setEnabled(false);
                        form1.jcmb[43].setSelectedIndex(1);
                        form1.jcmb[43].setEnabled(false);
                    }
                    if (word.equals("по нижней недели")&jj==3&ii==6) {
                        form1.jcmb[38].setSelectedIndex(2);
                        form1.jcmb[38].setEnabled(false);
                        form1.jcmb[43].setSelectedIndex(2);
                        form1.jcmb[43].setEnabled(false);
                    }
                    if (word.equals("еженедельно")&jj==3&ii==6) {
                        form1.jcmb[38].setSelectedIndex(0);
                        form1.jcmb[38].setEnabled(false);
                        form1.jcmb[43].setSelectedIndex(0);
                        form1.jcmb[43].setEnabled(false);
                    }

                    form1.timetable[ii][jj]=word;
//if (!word.equals("по верхней недели")&!word.equals("по нижней недели")) System.out.println(word+" "+ii+" "+jj);

                   /* for (int i=0; i<9; i++) {
                        for (int k=0; k<5; k++) {
                            System.out.print(form1.timetable[i][k]+" ");
                        }
                        System.out.println();
                    }
*/
                }
            });
        }

   }

}
