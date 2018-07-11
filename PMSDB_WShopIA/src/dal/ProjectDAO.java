/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import model.Project;

/**
 *
 * @author Nguyen Thai Bao
 */
public class ProjectDAO {
    
    public Project selectByID(int id) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from Project where id = " + id;
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        Project p = null;
        if (rs.next()) {
            id = rs.getInt("id");
            String name = rs.getString("name");
            p = new Project(id, name);
        }
        rs.close();
        conn.close();
        return p;
    }
}
