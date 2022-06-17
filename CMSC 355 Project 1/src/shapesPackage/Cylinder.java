package shapesPackage;


import java.lang.Math;

public class Cylinder extends ThreeDimensionalShape{
    /*
     * Method: getVolume
     * takes in no params
     * returns the volume of a cylinder based on the object parameters
     * for height and radius(length), set when the object is created
     */
	public double getVolume() {
		return Math.PI * Math.pow(this.length,  2) * this.height;
	}
}
