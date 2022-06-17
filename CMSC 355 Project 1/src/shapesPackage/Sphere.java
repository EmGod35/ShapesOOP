package shapesPackage;

/*
 * File: ThreeDimensionalShape
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This class contains the getVolume() method for if a sphere is selected. 
 * It is a child of and inherits the methods of ThreeDimensionalShape()
 * Source: https://www.science.co.il/formula/
 */
import java.lang.Math;

public class Sphere extends ThreeDimensionalShape{
    /*
     * Method: getVolume
     * takes in no params
     * returns the volume of a sphere based on the object parameters
     * for radius, set when the object is created
     */
	public double getVolume() {
		return Math.PI* (4.0/3) * Math.pow(this.length, 3);
	}
}
