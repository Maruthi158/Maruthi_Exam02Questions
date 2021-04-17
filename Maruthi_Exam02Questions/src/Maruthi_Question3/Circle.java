//Circle.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question3;

/**
 *
 * @author S541905
 */
public class Circle {
    /** The radius of the circle */
	private double radius;


	
	/** Construct a circle with a specified radius */
	public Circle(double radius) {
		this.radius = radius;
	
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
    

