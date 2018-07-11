/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Nguyen Thai Bao
 */
public class TitleAuthor {
    
    private String auID, titID;
    private int auOrd;

    public TitleAuthor() {
    }

    public TitleAuthor(String auID, String titID, int auOrd) {
        this.auID = auID;
        this.titID = titID;
        this.auOrd = auOrd;
    }

    public String getAuID() {
        return auID;
    }

    public void setAuID(String auID) {
        this.auID = auID;
    }

    public String getTitID() {
        return titID;
    }

    public void setTitID(String titID) {
        this.titID = titID;
    }

    public int getAuOrd() {
        return auOrd;
    }

    public void setAuOrd(int auOrd) {
        this.auOrd = auOrd;
    }
    
    
}
