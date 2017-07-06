/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javaapplication10.MyBean;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Женя
 */
public class Table_for_Teachers implements TableModel {
     private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
 
        private List<MyBean> beans;
 
        public Table_for_Teachers(List<MyBean> beans) {
            this.beans = beans;
        }
 
        public void addTableModelListener(TableModelListener listener) {
            listeners.add(listener);
        }
 
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }
 
        public int getColumnCount() {
            return 6;
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
                return "Ф.И.О";
            case 5:
                return "Ф.И.О";    
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
                return bean.get_groupe();
            case 4:
                return bean.get_full_Name();
            case 5:
                return bean.get_full_Name1();
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
 


