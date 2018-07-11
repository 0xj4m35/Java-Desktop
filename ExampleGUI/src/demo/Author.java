/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;

import java.io.Serializable;

/**
 *
 * @author AnhTTV
 */
public class Author implements Serializable{
        private String tenTacGia;
        private String maTacGia;
        private int dienThoai;
        
    public Author() {
    }  

    public Author(String maTacGia,String tenTacGia,  int dienThoai) {
        this.tenTacGia = tenTacGia;
        this.maTacGia = maTacGia;
        this.dienThoai = dienThoai;
    }
    
    public int getDienThoai() {
        return dienThoai;
    }
    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }
    public String getMaTacGia() {
        return maTacGia;
    }
    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }
    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    @Override
    public String toString() {
        return getTenTacGia();
    }
    public Object[] toObjects(){
        return new Object[]{maTacGia, tenTacGia,dienThoai};
    }
}
