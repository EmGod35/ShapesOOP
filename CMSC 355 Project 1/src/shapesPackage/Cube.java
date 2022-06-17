package shapesPackage;

/*
 * File: Cube.java
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This class contains the getVolume() method for if a cube is selected. 
 * It is a child of and inherits the methods of ThreeDimensionalShape()
 * Source: https://www.science.co.il/formula/
 */
import java.lang.Math;

public class Cube extends ThreeDimensionalShape{
    /*
     * Method: getVolume
     * takes in no params
     * returns the volume of a cube based on the object parameter
     * for length, set when the object is created
     */
	public double getVolume() {
		return Math.pow(this.length, 3);
	}
}
