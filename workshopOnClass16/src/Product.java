/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class Product {
    private String id, name, catID;
    private double price;
    private int quantity;
    private String describe, adddate;

    public Product() {
    }

    public Product(String id, String name, String catID, double price, int quantity, String describe, String adddate) {
        this.id = id;
        this.name = name;
        this.catID = catID;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
        this.adddate = adddate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatID() {
        return catID;
    }

    public void setCatID(String catID) {
        this.catID = catID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }
    
    public Object [] toObject() {
        return new Object [] {
            id, name, catID, price, quantity
        };
    }
}
