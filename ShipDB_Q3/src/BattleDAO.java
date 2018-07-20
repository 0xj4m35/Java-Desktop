
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class BattleDAO {
    
    public ArrayList<Battle> getAllBattle() {
        ArrayList<Battle> list = new ArrayList<>();
        try {
            Connection conn = new DBContext().getConnection();
            String query = "select * from Battles";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String name = rs.getString("name");
                Date da = rs.getDate("date");
                list.add(new Battle(name, da));
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
        return list;
    }
    
    
    public Battle getBattleByName(String bName) {
        Battle ba = null;
        try {
            Connection conn = new DBContext().getConnection();
            String query = "select * from Battles where name = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, bName);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String name = rs.getString("name");
                Date da = rs.getDate("date");
                ba = new Battle(name, da);
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
        return ba;
    }
    
    public boolean addNewBattle(String na, Date da) {
        try {
            Connection conn = new DBContext().getConnection();
            String query = "INSERT INTO Battles(name, date) VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, na);
            ps.setDate(2, da);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
} 
