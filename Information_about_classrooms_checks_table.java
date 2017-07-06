/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Slava
 */
public class Information_about_classrooms_checks_table implements TableModel {
     private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
 
        private List<MyBean> beans;
 
        public Information_about_classrooms_checks_table(List<MyBean> beans) {
            this.beans = beans;
        }

    Information_about_classrooms_checks_table(String days1, String num_par, String course, String groupe, String full_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
        public void addTableModelListener(TableModelListener listener) {
            listeners.add(listener);
        }
 
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }
 
        public int getColumnCount() {
            return 5;
        }
 
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
            case 0:
                return "День недели";
            case 1:
                return "№ пары";
            case 2:
                return "Курс";
            case 3:
                return "Группа";
            case 4:
                return "номер аудитории";   
            }
            return "";
        }
 
        public int getRowCount() {
            return beans.size();
        }
 
        public Object getValueAt(int rowIndex, int columnIndex) {
            MyBean bean = beans.get(rowIndex);
            switch (columnIndex) {
            case 0:
                return bean.get_days();
            case 1:
                return bean.get_num_par();
            case 2:
                return bean.get_course();
            case 3:
                return bean.get_num_par();
            case 4:
                return bean.get_full_Name();
            }
            return "";
        }
 
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
 
        public void removeTableModelListener(TableModelListener listener) {
            listeners.remove(listener);
        }
 
        public void setValueAt(Object value, int rowIndex, int columnIndex) {
 
        }
 
}
