/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp5;


public class Employee {
   private String name;
   private int age;
   private String sex;
   private String fruit;

    public Employee() {
    }

    public Employee(String name, int age, String sex, String fruit) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.fruit = fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
    Object[] toObject(){
        return new Object[]{
          name,age,sex,fruit
        };
    }
}
