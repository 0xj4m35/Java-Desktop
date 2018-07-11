/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp4;

import java.io.Serializable;

public class BanDoc implements Serializable{
   private String maBD;
    private String tenBD;
    private String dienthoai;
    private String diachi;

    public BanDoc() {
    }

    public BanDoc(String maBD) {
        this.maBD = maBD;
    }

    public BanDoc(String maBD, String tenBD, String dienthoai, String diachi) {
        this.maBD = maBD;
        this.tenBD = tenBD;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
    }

    public String getMaBD() {
        return maBD;
    }

    public void setMaBD(String maBD) {
        this.maBD = maBD;
    }

    public String getTenBD() {
        return tenBD;
    }

    public void setTenBD(String tenBD) {
        this.tenBD = tenBD;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    Object[] toObject(){
        return new Object[]{
           maBD,tenBD,dienthoai,diachi
        };
    }
}
