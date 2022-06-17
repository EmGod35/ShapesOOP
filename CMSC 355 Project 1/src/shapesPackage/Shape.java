package shapesPackage;

/*
 * File: Shape.java
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This is the parent of TwoDimensionalShape and ThreeDimensionalShape that contains
 * a constructor to set the default of numDimensions when Shape is created. It allows the shape
 * objects to print their area or volume based on their dimensions and with a rounded format
 * to output the result of the parameters input to the various shape objects, each time the menu
 * is run to create them.
 */
import java.text.DecimalFormat;

public class Shape {
    //formatter for the decimals of the output of area/volume
    private static DecimalFormat df = new DecimalFormat("0.00");
    //protected variable to contain the given dimensions
    protected int numDimension;

    /*
     * Default Constructor: Shape
     * sets the default dimensions to 0
     */
    public Shape() {
        numDimension = 0;
    }
    
    /*
     * Method: setDim
     * takes in num: int, the number of dimensions of the given shape object
     * allows the object to have the number of dimensions set
     * no return
     */
	public void setDim(int num) {
		this.numDimension = num;
	}
	
	/*
	 * Method: printInfo
	 * takes in type: String, the type of shape being printed
	 * a "toString" that prints out the area for a shape with numDimension = 2
	 * or volume for a shape with numDimension = 3, and the area/volume in a rounded
	 * format
	 * no returns
	 */
	public void printInfo(String type, double value) {
		if(this.numDimension == 2) {
			System.out.println("The Area of " + type + ": " + df.format(value));
		}
		else {
			System.out.println("The Volume of " + type+ ": " + df.format(value));
		}
		
	}
}
