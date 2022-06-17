package shapesPackage;
public class Square extends TwoDimensionalShape{
    /*
     * Method: getArea
     * takes in no params
     * returns the area of a square based on the object parameters
     * for length, set when the object is created
     */
    public double getArea() {
		return this.length * this.length;
	}
}
