/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import dat.ProjectMemberDAO;
import java.util.List;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Project {
    
    private int id;
    private String name;
    private List<ProjectMember> listProMem;
    
    public Project() {
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectMember> getListProMem() throws Exception {
        return listProMem = new ProjectMemberDAO().selectByPID(id);
    }

    public void setListProMem(List<ProjectMember> listProMem) {
        this.listProMem = listProMem;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
