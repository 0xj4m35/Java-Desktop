/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dal;

import com.context.DBContext;
import com.entity.Book;
import com.entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Thai Bao
 */
public class BookDAO {
    
    public ArrayList<Book> getAllBooks(Users user) throws Exception {
        ArrayList<Book> listBook = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        String query = "select * from Books where username = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, user.getUsername());
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String titID = rs.getString("title_id");
            String title = rs.getString("title");
            String pubID = rs.getString("pub_id");
            String notes = rs.getString("notes");
            String uname = rs.getString("username");
            listBook.add(new Book(titID, title, pubID, notes, uname));
        }
        rs.close();
        conn.close();
        return listBook;
    }
    
}
