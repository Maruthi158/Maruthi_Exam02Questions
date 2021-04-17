//AirConditioner.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question9;

/**
 *
 * @author S541905
 */
public class AirConditioner implements Electronics {
 private int id;
    private String color;
    private double price;

    public AirConditioner(int id, String color, double price) {
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
        return "AirConditioner{" + "id=" + id + ", color=" + color + ", price=" + price + '}';
    }
    
    @Override
    public String typeOfElectronicGoods() {
       return   "Air conditioner"; 
    }

    @Override
    public String isPowerSupplyRequired() {
        return "Power supply is required for AC";
    }
    
}
