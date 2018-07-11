/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Users implements Serializable {
    
    private int no;
    private String userName, password, type;

    public Users(int no, String userName, String type) {
        this.no = no;
        this.userName = userName;
        this.type = type;
    }

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    
}
