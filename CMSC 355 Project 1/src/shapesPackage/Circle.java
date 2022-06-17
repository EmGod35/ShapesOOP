package shapesPackage;

/*
 * File: Circle.java
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This class contains the getArea() method for if a circle is selected. 
 * It is a child of and inherits the methods of TwoDimensionalShape()
 * Source: https://byjus.com/area-formulas/
 */
import java.lang.Math;

public class Circle extends TwoDimensionalShape{
    /*
     * Method: getArea
     * takes in no params
     * returns the area of a circle based on the object parameters
     * for radius(length), set when the object is created
     */
	public double getArea() {
		return Math.PI * Math.pow(this.length, 2); 
	}	
}
