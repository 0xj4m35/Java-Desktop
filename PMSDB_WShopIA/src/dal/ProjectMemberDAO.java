/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.context.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ProjectMember;

/**
 *
 * @author Nguyen Thai Bao
 */
public class ProjectMemberDAO {
    
    public List<ProjectMember> selectByProjectName(String projectName) throws Exception {
        List<ProjectMember> members = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        String query = "select pm.* from Project p, ProjectMember pm"
                + " where p.id = pm.projectid and p.name like '%" + projectName + "%'";
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while(rs.next()) {
            int proID = rs.getInt("projectid");
            String emID = rs.getString("employeeid");
            boolean isFT = rs.getBoolean("isfulltime");
            int hour = rs.getInt("hours");
            members.add(new ProjectMember(proID, emID, isFT, hour));
        }
        rs.close();
        conn.close();
        return members;
    }
}
