/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jtable.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AnhTTV
 */
public class BanDocTableModel extends AbstractTableModel{
    private String[] columns = {"Ma ban doc", "Ho ten", "Dia chi","Dien thoai"};
    ArrayList<BanDoc> bandoc;

    public ArrayList<BanDoc> getBanDoc() {
        return bandoc;
    }
    public void setBanDoc(ArrayList<BanDoc> bandoc) {
        this.bandoc = bandoc;
    }
    public int getRowCount() {
        return bandoc.size();
    }
    public int getColumnCount() {
        return columns.length;
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        BanDoc bd = bandoc.get(rowIndex);
        if(columns[columnIndex].equals("Ma ban doc"))
        {
            return bd.getMaBD();
        }
        else if(columns[columnIndex].equals("Ho ten"))
        {
            return bd.getTenBD();
        }
        else if(columns[columnIndex].equals("Dia chi"))
        {
           return bd.getDiachi();
        }
        else if(columns[columnIndex].equals("Dien thoai"))
        {
            return bd.getDienthoai();
        }
        return "";
    }
}
