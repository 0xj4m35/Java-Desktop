/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableSample;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Users {
    String name, group;
    boolean enabled;

    public Users() {
    }

    public Users(String name, String group, boolean enabled) {
        this.name = name;
        this.group = group;
        this.enabled = enabled;
    }
    
    public Object [] toDataRow() {
        return new Object[]{name, group, enabled};
    }
}
