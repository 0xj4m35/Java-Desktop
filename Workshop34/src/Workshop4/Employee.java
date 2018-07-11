/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop4;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Employee {
    String code, name, sex;
    double salary, bonus, income;

    public Employee() {
    }

    public Employee(String code, String name, String sex, double salary, double bonus) {
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncome() {
        return bonus + salary;
    }  
    
    public Object [] toDataRow() {
        return new Object[] {
            code, name, sex, salary, bonus, getIncome()
        };
    }
}
