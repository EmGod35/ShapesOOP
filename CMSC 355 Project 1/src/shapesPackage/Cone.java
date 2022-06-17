package shapesPackage;


import java.lang.Math;

public class Cone extends ThreeDimensionalShape{
    /*
     * Method: getVolume
     * takes in no params
     * returns the volume of a cone based on the object parameters
     * for height and radius(length), set when the object is created
     */
	public double getVolume() {
		return Math.PI * Math.pow(this.length,  2) * (this.height/3);
	}
}
