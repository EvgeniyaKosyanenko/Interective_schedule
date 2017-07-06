package javaapplication10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sony
 */
class MyCustomException extends Exception {
    public MyCustomException(Throwable t) { // можно создать и другие конструкторы
        super(t);
    }
}

public class EnteringData {

    private String comment; //комментарий st
    private String type_of_training;//вид обучения in
    private String semester; //семестр in
    private String elective_course;//курс по выбору in
    private String remark;// замечание in
    private String lower_upper_week;// нижняя/верхняя неделя in
    private String numeric_pogrummy; // номер подгруппы in
    private String number_of_subgroups;// количество подгрупп in
    private String day_of_week;//день недели in
    private String groups;//группа in
    private String teachers;//преподаватель st
    private String time;//пара in
    private String audience;//аудиторя st
    private String course;//курс in
    private String subject;//предмет st
    //private boolean ch;// проверка
    private String ch;// проверка
    
   public EnteringData(){
    subject = "";  course = "0"; day_of_week = "";
    audience = ""; time = "";//пара
    teachers = ""; groups = "";
    number_of_subgroups = "";// количество подгрупп
    numeric_pogrummy = ""; // номер подгруппы
    lower_upper_week = "";// нижняя/верхняя неделя
    comment = ""; //комментарий
    elective_course = "0";//курс по выбору
    semester = "0"; //семестр
    type_of_training = "0";//вид обучения
    remark = "0"; // замечание
    ch = "0";
    }

    public void EnteringDataWrite(){
    System.out.print("КОММ-->" +this.getComment()+ "@");
    System.out.print("ВИД/ОБ-->" +this.getType_of_training() + "@");
    System.out.print("СЕМ-->" +this.getSemester() + "@");
    System.out.print("К/П/В-->" +this.getElective_course() + "@");
    System.out.print("ЗАМЕ-->" +this.getRemark() + "@");
    System.out.print("НЕД-->" +this.getLower_upper_week() + "@");
    System.out.print("НОМ/ПОД-->" +this.getNumeric_pogrummy() + "@");
    System.out.print("КОЛ/ПОД-->" +this.getNumber_of_subgroups() + "@");///
    System.out.print("ДЕН-->" +this.getDay_of_week() + "@");
    System.out.print("ГР-->" +this.getGroups() + "@");
    System.out.print("ПРЕП-->" +this.getTeachers() + "@");
    System.out.print("ПАР-->" +this.getTime() + "@");
    System.out.print("АУД-->" +this.getAudience() + "@");
    System.out.print("КУР-->" + this.getCourse() + "@");
    System.out.print("ЗАН-->" +this.getSubject() + "@");
    System.out.print("Проверка-->" +this.getCh() + "@");
     }

    public void setCh(String us){
        ch = us;
       // return ch;
    }

    public void setSubject(String us) {
        subject = us;
    }
    public void setDay_of_week(String us) {
        day_of_week = us;
    }
    public void setCourse(String us) {
        course = us;
    }
    public void setAudience(String us) {
        audience = us;
    }
    public void setTime(String us) {
        time = us;
    }
    public void setTeachers(String us) {
        teachers = us;
    }
    public void setGroups(String us) {
        groups = us;
    }
    public void setNumber_of_subgroups(String us) {
        number_of_subgroups = us;
    }
    public void setNumeric_pogrummy(String us) {
        numeric_pogrummy = us;
    }
    public void setLower_upper_week(String us) {
        lower_upper_week = us;
    }
    String setLower_upper_week(){
        return lower_upper_week;
    }
    public void setComment(String us) {
        comment = us;
    }
    public void setElective_course(String us) {
        elective_course = us;
    }
    public void setSemester(String us) {
        semester = us;
    }
    public void setType_of_training(String us) {
        type_of_training = us;
    }
    public void setRemark(String us) {
        remark = us;
    }
    
    //================================================//
    public String getCh(){
        return ch;
    }
    
    public String getSubject() {
        return subject;
    }
     public String getDay_of_week() {
        return day_of_week;
    }
    public String getCourse() {
       return course;
    }
    public String getAudience() {
       return audience ;
    }
    public String getTime() {
      return  time;
    }
    public String getTeachers() {
       return teachers ;
    }
    public String getGroups() {
        return groups;
    }
    public String getNumber_of_subgroups() {
       return number_of_subgroups ;
    }
    public String getNumeric_pogrummy() {
       return numeric_pogrummy ;
    }
    public String getLower_upper_week() {
       return lower_upper_week ;
    }
    public String getComment() {
       return comment ;
    }
    public String getElective_course() {
       return elective_course ;
    }
    public String getSemester() {
       return semester ;
    }
    public String getType_of_training() {
      return  type_of_training ;
    }
    public String getRemark() {
      return  remark ;
    }

     public void Send_to_thedatabase() throws SQLException {
     try {
        // try{
         //    try{
                    String name_txt = ("execute procedure INSERT_INTO_LESSONS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    Connection c = MyConn.getConnection();
                    PreparedStatement p_stmt = c.prepareStatement(name_txt);
                    p_stmt.setInt(1,Integer.parseInt(this.getCh()));
                    p_stmt.setString(2,this.getComment());
                    p_stmt.setInt(3,Integer.parseInt(this.getType_of_training()));
                    p_stmt.setInt(4,Integer.parseInt(this.getSemester()));
                    p_stmt.setInt(5,Integer.parseInt(this.getElective_course()));
                    p_stmt.setInt(6,Integer.parseInt(this.getRemark()));
                    p_stmt.setInt(7,Integer.parseInt(this.getLower_upper_week()));
                    p_stmt.setInt(8,Integer.parseInt(this.getNumeric_pogrummy()));
                    p_stmt.setInt(9,Integer.parseInt(this.getNumber_of_subgroups()));
                    p_stmt.setInt(10,Integer.parseInt(this.getDay_of_week()));
                    p_stmt.setInt(11,Integer.parseInt(this.getGroups()));
                    p_stmt.setString(12,this.getTeachers());
                    p_stmt.setInt(13,Integer.parseInt(this.getTime()));
                    p_stmt.setString(14,this.getAudience());
                    p_stmt.setInt(15,Integer.parseInt(this.getCourse()));
                    p_stmt.setString(16,this.getSubject());
                  //  boolean result  = p_stmt.execute();
//      String name_txt = ("SELECT * FROM INSERT_INTO_LESSONS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//       Connection c = MyConn.getConnection();
//      PreparedStatement p_stmt = c.prepareStatement(name_txt);
      int result = p_stmt.executeUpdate();
      
      // System.out.println(result + " ВНЕСЛИ!!!!!");             
      // System.out.println("wtrtfg" + ch);
       System.out.println("enterdtata_ ch" + this.getCh());
      //  System.out.println("check " + ch.getSelectedIcon());
     //   System.out.println("checkarray " + ch.getInputMethodListeners());
      } catch (SQLException ER) {
           // Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ERROR_INPUT_CLASS);
            //JOptionPane.showMessageDialog(null, "Ошибка в SQL запросе: Данная аудитория уже занята в это время");
           //return;
       System.out.println ("\n*** Поймали SQLException ***\n");

       while (ER != null) {
              System.out.println ("SQLState: " + ER.getSQLState ());
              System.out.println ("Сообщение:  " + ER.getMessage ());
              System.out.println ("Vendor:   " + ER.getErrorCode ());
              
              if ("5".equals(ER.getMessage().substring(36,37))){
                  System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "Данная аудитория уже занята в это время");
              }
              if ("6".equals(ER.getMessage().substring(36,37))){
                  System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "У данного преподавателя уже занята эта пара");
              }
              if ("7".equals(ER.getMessage().substring(36,37))){
                  System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "И преподаватель и аудитория заняты в это время");
              } 
              if ("11".equals(ER.getMessage().substring(36,38))){
                  System.out.println ("Ура!");
                  JOptionPane.showMessageDialog(null, "Данной группе и данному курсу уже назначена пара в это время!");
              }
              System.out.println ("Сообщение1:  " + ER.getMessage().substring(36,37));
              

              ER = ER.getNextException ();
              System.out.println ("");
              }
      }
      catch (java.lang.Exception ex) {


              // Получили ошибку другого типа. Распечатать ее.

              ex.printStackTrace ();
      }
     }
}

