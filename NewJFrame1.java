package javaapplication10;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NewJFrame1 extends javax.swing.JFrame {
        public int col;
        public String[] name_txt;
        public Vector textFieldVector;
        public Connection c;

    public NewJFrame1(int k1, String[] name_txt1) {
        col = k1;
        name_txt =  name_txt1 ;
        textFieldVector = new Vector();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Ent();
        c = MyConn.getConnection();
    }


    private void Ent() {
 
       // Font font = new Font("Verdana", Font.ITALIC, 25);
        //jLabel1.setFont(font);
        int count = col;
        JTextField  a1 ;
        JLabel a2;
        jPanel1.setLayout(new FlowLayout());
        Box left = Box.createVerticalBox();
        left.setBounds(50,50,100,100);
        for (int i = 1 ; i < count; i++)
        {
            System.out.println(name_txt[i]);
            Font font1 = new Font("Verdana", Font.PLAIN, 15);
            a2 = new JLabel();
            a2.setText(name_txt[i]);
            a2.setFont(font1);
            a2.setVisible(true);
            a1 = new JTextField("", 20);
            a1.setVisible(true);
            textFieldVector.add(a1);
            left.add(a2);
            left.add(a1);
       }
       jPanel1.add(left);
       jPanel1.validate();
       jPanel1.repaint();
    }

    

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton2.setText("Выход");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        jButton1.setText("Сохранить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ВВЕДИТЕ НЕОБХОДИМЫЕ ДАННЫЕ");

        jCheckBox1.setText("Проверка данных");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jButton1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  

            try {
                PreparedStatement p_stmt = c.prepareStatement(name_txt[0]);
                String tutor_name[] = new String[textFieldVector.size()];
                for (int i=0; i<textFieldVector.size(); ++i) {
                    tutor_name[i] =  ((JTextField)textFieldVector.get(i)).getText();
                    int k = i;
                    k++;
                    p_stmt.setString(k,tutor_name[i]);
                }

                //p_stmt.setInt(1,Integer.parseInt(s[1]));
                //p_stmt.setString(2,s[2]);
                int result = p_stmt.executeUpdate();
                System.out.println("*****");
            this.dispose();
                
            } catch (SQLException ex) {
                //Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println ("\n*** Поймали SQLException ***\n");

       while (ex != null) {
              System.out.println ("SQLState: " + ex.getSQLState ());
              System.out.println ("Сообщение:  " + ex.getMessage ());
              System.out.println ("Vendor:   " + ex.getErrorCode ());
               if ("8".equals(ex.getMessage().substring(36,37))){
                 // System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "Данный предмет уже существует в базе");
              }
              if ("9".equals(ex.getMessage().substring(36,37))){
                 // System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "Данный преподаватель уже существует в базе");
              }
              if ("10".equals(ex.getMessage().substring(36,38))){
                 // System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "Данная аудитория уже существует в базе");
              }
              ex =ex.getNextException ();
              System.out.println ("");
              this.dispose();
              }
       
            }
               
                
           
    }//GEN-LAST:event_jButton1ActionPerformed




    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
   
}//GEN-LAST:event_jCheckBox1ActionPerformed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_formKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new NewJFrame1().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
