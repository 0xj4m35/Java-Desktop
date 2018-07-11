/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat;

import com.DBContext;
import entity.ProjectMember;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Thai Bao
 */
public class ProjectMemberDAO {
    
    // select contact by GroupID
    public List<ProjectMember> selectByPID(int proID) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select * from ProjectMember where projectid = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, proID);
        ResultSet rs = ps.executeQuery();
        List<ProjectMember> contacts = new ArrayList<>();
        while(rs.next()) {
            proID = rs.getInt("projectid");
            String emID = rs.getString("employeeid");
            boolean isfull = rs.getBoolean("isfulltime");
            int hour = rs.getInt("hours");
            ProjectMember c = new ProjectMember(proID, emID, isfull, hour);
           // c.setGroup(new GroupDAO().selectById(groupID));
            contacts.add(c);
        }
        rs.close();
        conn.close();
        return contacts;
    }
}
