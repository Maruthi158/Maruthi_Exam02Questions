//WashingMachine.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question9;

/**
 *
 * @author Priyanka Maruthi
 */
public class WashingMachine implements Electronics {

    private int id;
    private String color;
    private double price;

    public WashingMachine(int id, String color, double price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WashingMachine{" + "id=" + id + ", color=" + color + ", price=" + price + '}';
    }
    
    @Override
    public String typeOfElectronicGoods() {
       return "Washing machine";
    }
    
}
