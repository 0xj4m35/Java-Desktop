/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dal;

import com.context.DBContext;
import com.entity.Author;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nguyen Thai Bao
 */
public class AuthorDAO {
    
    public Author getAutByBookID(String bID) throws Exception {
        Author a = null;
        Connection conn = new DBContext().getConnection();
        String query = "select A.au_id, A.au_name, A.au_address from Books B, TitleAuthor T, Authors A where B.title_id = T.title_id and T.au_id = A.au_id and B.title_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, bID);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String aID = rs.getString("au_id");
            String aName = rs.getString("au_name");
            String aAdd = rs.getString("au_address");
            a = new Author(aID, aName, aAdd);
        }
        rs.close();
        conn.close();
        return a;
    }
}
