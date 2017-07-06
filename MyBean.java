/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Женя
 */
public class MyBean {
        private String days;
        private String num_par;
        private String course;
        private String groupe;
        private String full_name;
        private String full_name1;
        
        public MyBean(String days,String num_par,String course,String groupe,String full_name, String full_name1) {
            this.set_days(days);
            this.set_num_par(num_par);
            this.set_course(course);
            this.set_groupe(groupe);
            this.set_full_Name(full_name);
            this.set_full_Name1(full_name1);
        }
 
        public void set_full_Name(String full_name) {
            this.full_name = full_name;
        }
 
        public String get_full_Name() {
            return full_name;
        }
 
        public void set_full_Name1(String full_name1) {
            this.full_name1 = full_name1;
        }
 
        public String get_full_Name1() {
            return full_name1;
        }
        
        public void set_num_par(String num_par) {
            this.num_par = num_par;
        }
 
        public String get_num_par() {
            return num_par;
        }
 
        public void set_groupe(String groupe) {
            this.groupe = groupe;
        }
 
        public String get_groupe() {
            return groupe;
        }
        
        public void set_course(String course) {
            this.course = course;
        }
 
        public String get_course() {
            return course;
        }
        
        public void set_days(String days) {
            this.days = days;
        }
 
        public String get_days() {
            return days;
        }
}
