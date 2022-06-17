package shapesPackage;
/*
 * File: Triangle.java
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This class contains the getArea() method for if a triangle is selected. 
 * It is a child of and inherits the methods of TwoDimensionalShape()
 * Source: https://byjus.com/area-formulas/
 */
public class Triangle extends TwoDimensionalShape{
    /*
     * Method: getArea
     * takes in no params
     * returns the area of a triangle based on the object parameters
     * for length and width, set when the object is created
     */
	public double getArea() {
		return (this.length * this.width)/2;
	}
}
