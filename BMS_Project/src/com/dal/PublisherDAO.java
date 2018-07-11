/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dal;

import com.context.DBContext;
import com.entity.Publisher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nguyen Thai Bao
 */
public class PublisherDAO {
    
    public Publisher getPubByID(String id) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from Publishers where pub_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        Publisher p = null;
        if (rs.next()) {
            String pID = rs.getString("pub_id");
            String pName = rs.getString("pub_name");
            String pAdd = rs.getString("pub_address");
            p = new Publisher(pID, pName, pAdd);
        }
        rs.close();
        conn.close();
        return p;
    }
    
}
