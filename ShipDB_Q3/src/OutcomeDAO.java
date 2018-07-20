
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
public class OutcomeDAO {
    
    public ArrayList<Outcome> getAllOutcome() {
        ArrayList<Outcome> outList = new ArrayList<>();
        try {
            Connection conn = new DBContext().getConnection();
            String query = "select * from Outcomes";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String ship = rs.getString("ship");
                String battle = rs.getString("battle");
                String re = rs.getString("result");
                Battle ba = new BattleDAO().getBattleByName(battle);
                Outcome out = new Outcome(ship, battle, re);
                out.setObjBattle(ba);
                outList.add(out);
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
        return outList;
    }
    
    public Outcome getOutcomeByShipBattle(String sh, String bat) {
        Outcome out = null;
        try {
            Connection conn = new DBContext().getConnection();
            String query = "select * from Outcomes where ship = ? and battle = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sh);
            ps.setString(2, bat);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String ship = rs.getString("ship");
                String battle = rs.getString("battle");
                String re = rs.getString("result");
                out = new Outcome(ship, battle, re);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } 
        return out;
    }
    
    public boolean addNewOutcome(String sh, String bat, String res) {
        try {
            Connection conn = new DBContext().getConnection();
            String query = "INSERT INTO Outcomes(ship, battle, result) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sh);
            ps.setString(2, bat);
            ps.setString(3, res);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean updateOut(String bat, String sh, String re) {
        try {
            Connection conn = new DBContext().getConnection();
            String query = "Update Outcomes SET result = ? where battle = ? and ship = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, re);
            ps.setString(2, bat);
            ps.setString(3, sh);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deleteOut(String sh, String bat) {
        try {
            Connection conn = new DBContext().getConnection();
            String query = "Delete from Outcomes where battle = ? and ship = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, bat);
            ps.setString(2, sh);
            ps.executeUpdate();
            return true;
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
