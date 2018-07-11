/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nguyen Thai Bao
 */
public class UserDAO {
    
    public User selectByUserName(String userName) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from Users where username like '" + userName + "'";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        User u = null;
        if (rs.next()) {
            userName = rs.getString("username");
            String disp = rs.getString("displayname");
            String pass = rs.getString("password");
            String des = rs.getString("description");
            u = new User(userName, disp, pass, des);
        }
        rs.close();
        conn.close();
        return u;
    }
    
    public void updateUser(User u) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "update users set displayname = ?, password = ?, description = ? where username = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, u.getDisplayName());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getDescription());
        ps.setString(4, u.getUserName());
        ps.executeUpdate();
        conn.close();
    }
}
