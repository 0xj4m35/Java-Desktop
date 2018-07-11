/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.io.Serializable;

/**
 *
 * @author Nguyen Thai Bao
 */
public class BanDoc implements Serializable {
    
    private String maBD, tenBD, diaChi, dienThoai;

    public BanDoc() {
    }

    public BanDoc(String maBD, String tenBD, String diaChi, String dienThoai) {
        this.maBD = maBD;
        this.tenBD = tenBD;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
//        this.khoa = khoa;
    }

    public BanDoc(String maBD) {
        this.maBD = maBD;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

//    public String getKhoa() {
//        return khoa;
//    }
//
//    public void setKhoa(String khoa) {
//        this.khoa = khoa;
//    }
    
    
    Object[] toObject() {
        return new Object[] {
            maBD, tenBD, diaChi, dienThoai
        };
    }
    
}
