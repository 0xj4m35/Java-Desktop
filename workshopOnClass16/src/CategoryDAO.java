
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class CategoryDAO {
    
    public List<Category> selectAll() throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories" ;
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Category> categories = new ArrayList<>();
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String describe = rs.getString("describe");
            Category g = new Category(id, name, describe);
            categories.add(g);
        }
        rs.close();
        conn.close();
        return categories;
    }
    
    public void addCategory(Category c) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "insert into categories(id,name,describe) values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, c.getId());
        ps.setString(2, c.getName());
        ps.setString(3, c.getDescrible());
        ps.executeUpdate();
        conn.close();
    }
    
    public boolean isCategory(String id) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        int i = 0;
        while(rs.next()){
            i++;
            break;
        }
        rs.close();
        conn.close();
        if (i != 0) {
            return true;
        }
        return false;
    }
    public void updateCategory(String id, String name, String des) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "update categories set name = ? , describe = ? where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, des);
        ps.setString(3, id);
        ps.executeUpdate();
        conn.close();
    }
    
    public void deleteCate(String id) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "delete from categories where id = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ps.executeUpdate();
        conn.close();
    }
    
    public Category getCatByID(String id) throws Exception {
        Category c = null;
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String idx = rs.getString("id");
            String name = rs.getString("name");
            String des = rs.getString("describe");
            c = new Category(id, name, des);
        }
        rs.close();
        conn.close();
        return c;
    }
    
    public List<Category> getCatByName(String partName) throws Exception {
        List<Category> categories = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories where [name] like '%'+?+'%'";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, partName);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String des = rs.getString("describe");
            Category c = new Category(id, name, des);
            categories.add(c);
        }
        rs.close();
        ps.close();
        return categories;
    }
    
    public List<Category> sortName() throws Exception {
        List<Category> categories = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories order by [name]";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String des = rs.getString("describe");
            Category c = new Category(id, name, des);
            categories.add(c);
        }
        rs.close();
        ps.close();
        return categories;
    }
    
    public List<Category> sortBy(int type) throws Exception {
        String kind = "id";
        if (type == 2) {
            kind = "name";
        }
        if (type == 3) {
            kind = "describe";
        }
        List<Category> categories = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        String query = "select * from categories order by [?]";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, kind);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String des = rs.getString("describe");
            Category c = new Category(id, name, des);
            categories.add(c);
        }
        rs.close();
        ps.close();
        return categories;
    }
}
