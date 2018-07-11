/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Nguyen Thai Bao
 */
public class ProjectMember {
    
    private int proID;
    private String emID;
    private boolean isFullTime;
    private int hour;

    public ProjectMember() {
    }

    public ProjectMember(int proID, String emID, boolean isFullTime, int hour) {
        this.proID = proID;
        this.emID = emID;
        this.isFullTime = isFullTime;
        this.hour = hour;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getEmID() {
        return emID;
    }

    public void setEmID(String emID) {
        this.emID = emID;
    }

    public boolean getIsFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    
    
}
