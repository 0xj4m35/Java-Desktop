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
public class Author {
    private String auID, auName, auAddress;

    public Author() {
    }

    public Author(String auID, String auName, String auAddress) {
        this.auID = auID;
        this.auName = auName;
        this.auAddress = auAddress;
    }

    public String getAuID() {
        return auID;
    }

    public void setAuID(String auID) {
        this.auID = auID;
    }

    public String getAuName() {
        return auName;
    }

    public void setAuName(String auName) {
        this.auName = auName;
    }

    public String getAuAddress() {
        return auAddress;
    }

    public void setAuAddress(String auAddress) {
        this.auAddress = auAddress;
    }
    
    
}
