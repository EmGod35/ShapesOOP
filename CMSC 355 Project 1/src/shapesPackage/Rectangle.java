package shapesPackage;
public class Rectangle extends TwoDimensionalShape{
    /*
     * Method: getArea
     * takes in no params
     * returns the area of a rectangle based on the object parameters
     * for length and width, set when the object is created
     */
	public double getArea() {
		return this.length * this.width;
	}
}
