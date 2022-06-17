package shapesPackage;


import java.lang.Math;

public class Torus extends ThreeDimensionalShape{
    /*
     * Method: getVolume
     * takes in no params
     * returns the volume of a Torus based on the object parameters
     * for minor and major radius, set when the object is created
     */
	public double getVolume() {
		return (Math.PI * (Math.pow(this.length, 2))) * (2*this.height*Math.PI);
	}
}
