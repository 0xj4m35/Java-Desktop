/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Nguyen Thai Bao
 */
public class EmployeeList {
    
    ArrayList<Employee> listEmp;

    public EmployeeList() {
        listEmp = new ArrayList<>();
    }
    
    void add(Employee e) {
        for (int i = 0; i < listEmp.size(); i++) {
            if (e.getCode().equalsIgnoreCase(listEmp.get(i).getCode())) {
                return;
            }
        }
        listEmp.add(e);
    }

    public ArrayList<Employee> getListEmp() {
        return listEmp;
    }
    
    ArrayList<Employee> searchByName(String name) {
        ArrayList<Employee> foundList = new ArrayList<>();
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                foundList.add(listEmp.get(i));
            }
        }
        return foundList;
    }
    
    void deleteByCode(String code) {
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getCode().equalsIgnoreCase(code)) {
                listEmp.remove(i);
                return;
            }
        }
    }
    
    void sortByCode() {
        Collections.sort(listEmp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getCode().compareToIgnoreCase(o2.getCode());
            }
        });
    }
    
    
}
