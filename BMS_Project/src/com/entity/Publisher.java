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
public class Publisher {
    
    private String pubID, pubName, pubAddress;

    public Publisher() {
    }

    public Publisher(String pubID, String pubName, String pubAddress) {
        this.pubID = pubID;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
    }

    public String getPubID() {
        return pubID;
    }

    public void setPubID(String pubID) {
        this.pubID = pubID;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }
    
    
}
