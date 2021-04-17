//Triangle.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question6;

/**
 *
 * @author Priyanka Maruthi
 */
public class Triangle extends GeometricObject  {
    private double length;
    private double breadth;
    private double height;
    private String color ;
	private boolean filled;

    public Triangle(double length, double breadth, double height, String color, boolean filled) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
@Override
    public double getArea() {
        return ((1/2.0)*(length*breadth*height));
    }

    @Override
    public double getPerimeter() {
       return (length+breadth+height);
    }
    @Override
    public String toString() {
        return "Triangle Class" + "length=" + length + ", breadth=" + breadth + ", height=" + height + ", color=" + color + ", filled=" + filled ;
    }
        
        

    
    
}
