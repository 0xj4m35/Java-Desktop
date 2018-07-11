
package com.entity;


public class BookData {
    
    private String title_id, title, pub, author, notes;

    public BookData() {
    }

    public BookData(String title_id, String title, String pub, String author, String notes) {
        this.title_id = title_id;
        this.title = title;
        this.pub = pub;
        this.author = author;
        this.notes = notes;
    }

    public String getTitle_id() {
        return title_id;
    }

    public void setTitle_id(String title_id) {
        this.title_id = title_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
}
