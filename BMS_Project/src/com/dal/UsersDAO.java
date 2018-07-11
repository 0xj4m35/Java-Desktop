/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dal;

import com.context.DBContext;
import com.entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nguyen Thai Bao
 */
public class UsersDAO {
    
    public Users getUserLogin(String username, String password) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from Users where username like ? and password = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        Users u = null;
        if (rs.next()) {
            username = rs.getString("username");
            String dis = rs.getString("displayname");
            password = rs.getString("password");
            String des = rs.getString("description");
            u = new Users(username, dis, password, des);
        }
        rs.close();
        conn.close();
        return u;
    }
}
