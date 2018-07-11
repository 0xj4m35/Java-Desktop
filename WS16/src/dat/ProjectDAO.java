/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat;

import com.DBContext;
import entity.Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Thai Bao
 */
public class ProjectDAO {
    
    // select 
    public List<Project> select() throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from project" ;
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Project> groups = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Project g = new Project(id, name);
        //    g.setContacts(new ContactDAO().selectByGID(id));
            groups.add(g);
        }
        rs.close();
        conn.close();
        return groups;
    }
    
    // select a group by group ID 
    public Project selectById(int id) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from project where id = ?" ;
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Project g = null;
        if (rs.next()) {
            id = rs.getInt("id");
            String name = rs.getString("name");
            g = new Project(id, name);
        }
        rs.close();
        conn.close();
        return g;
    }
}
