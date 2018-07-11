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
public class Book {
    
    private String titID, title, pubID, notes, username;

    public Book() {
    }

    public Book(String titID, String title, String pubID, String notes, String username) {
        this.titID = titID;
        this.title = title;
        this.pubID = pubID;
        this.notes = notes;
        this.username = username;
    }

    public String getTitID() {
        return titID;
    }

    public void setTitID(String titID) {
        this.titID = titID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubID() {
        return pubID;
    }

    public void setPubID(String pubID) {
        this.pubID = pubID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
