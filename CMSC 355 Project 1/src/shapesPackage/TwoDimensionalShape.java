package shapesPackage;
public class TwoDimensionalShape extends Shape{
	//String to contain the shape name
    protected String type;
    //double to contain the length/radius
    protected double length;
    //double to contain the width
    protected double width;
	
    /*
     * Method: printHeader
     * no params
     * prints the header based on the shape of the objects
     */
	public void printHeader() {
		System.out.println("You have selected a " + this.type);
	}
	
	/*
	 * Method: setValues
     * takes in type: String, the type of shape being created, and radius: double, the value of the radius/length
     * this called on a shape where only a radius/length is required to create the given shape (Circle, Square)
     * sets the class variables type and length to the given parameters
     * no returns
	 */
	public void setValues(String type, double radius) {
		this.type = type;
		this.length = radius;
	}
	
	/*
	 * Method: setValues (overloaded)
     * takes in type: String, the type of shape being created, length: double, the value of the length, and
     * width: double, the value of the width
     * this is overloaded when only length and width(Rectangle or Triangle)
     * are required to create the given shape
     * sets the class variables type, length and width to the given parameters
     * no returns
	 */
	public void setValues(String type, double length, double width) {
		this.type = type;
		this.length = length;
		this.width = width;
	}
	
	/*
     * Method: getType
     * no params
     * returns the type of the object
     */
	public String getType() {
		return type;
	}
	
	/*
     * Method: setType
     * takes in t: String, the type of the object
     * returns the type of the object
     */
	public void setType(String t) {
		type = t;
	}
}
