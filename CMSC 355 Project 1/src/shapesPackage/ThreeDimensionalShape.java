package shapesPackage;
public class ThreeDimensionalShape extends Shape{
	//string to set the shape name
    protected String type;
    //double to set the length/radius
	protected double length;
	//double to set the height
	protected double height;
	
	/*
	 * Default Constructor: ThreeDimensionalShape
	 * takes in no parameters
	 * sets the class variable to a base value when
	 * a ThreeDimensionalShape object is created
	 */
	public ThreeDimensionalShape() {
	    type = "";
	    length = 0;
	    height = 0;
	}
	
	/*
	 * Method: setValues
	 * takes in type: String, the type of shape being created, and radius: double, the value of the radius/length
	 * this called on a shape where only a radius/length is required to create the given shape (Sphere, Cube)
	 * sets the class variables type and length to the given parameters
	 * no returns
	 */
	public void setValues(String type, double radius) {
		this.type = type;
		this.length = radius;
	}
	
	/*
	 * Method: setValues (overloaded)
	 * takes in type: String, the type of shape being created, radius: double, the value of the radius, and
	 * height: double, the value of the height
     * this is overloaded when only radius and height (Cone, Cylinder) OR when there are a minor and major radius (Torus)
     * are required to create the given shape
     * sets the class variables type, length and height to the given parameters
     * no returns
	 */
	public void setValues(String type, double radius, double height) {
		this.type = type;
		this.length = radius;
		this.height = height;
	}
	
	/*
	 * Method: getType
	 * no params
	 * returns the type of the object
	 */
	public String getType() {
		return this.type;
	}
	
	/*
     * Method: setType
     * takes in t: String, the type of the object
     * returns the type of the object
     */
	public void setType(String t) {
		type = t;
	}

	/*
	 * Method: printHeader
	 * no params
	 * prints the header based on the shape of the objects
	 */
	public void printHeader() {
		System.out.println("You have selected a " + this.type);
	}
}
