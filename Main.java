
package javaapplication10;

import static java.lang.System.exit;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try{
        //NewJDialog Dialog = new NewJDialog();
        Connection c = MyConn.getConnection();
        if (c == null){
            JOptionPane.showMessageDialog(null, "Проблемы с соединением!");
            exit(0);
        }
        else {
            System.out.println("МЫ ПОДКЛЮЧИЛИСЬ К БАЗЕ!!!");
            System.out.println("Вы ввели правильный пароль");
        
        Form1 form1 = new Form1();
        form1.Form1CreateAndListener(form1);
        form1.jfrm.setVisible(true);
        }
        }catch(Exception e){
            System.out.println("Exception " +e.getMessage());
           JOptionPane.showMessageDialog(null, "Проблемы с соединением!");
         }
    }
}
