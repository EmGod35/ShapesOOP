package shapesPackage;

/*
 * File: ShapeTester.java
 * Name: Emily Godwin
 * 3/28/21
 * CMSC 335 Project 1
 * Description: This is the runner class, it creates the application and begins running the menu.
 *      Once the user enters a selection from the menu, the runner creates shape objects and
 *      sets attribute variables based on shape selected. Then it prints the area/volume of the selected
 *      shape, based on parent class (2D/3D)
 * Source: https://learning.oreilly.com/library/view/java-the-complete/9781260440249/ch08.xhtml#ch08
 * https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 * https://stackabuse.com/how-to-get-current-date-and-time-in-java/
 */
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ShapeTester {
    //private list to contain the list of shape names
    private String[] shapeList = {"Circle", "Rectangle", "Square", "Triangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus"};
    //private flag to allow menu to continue until the user decides to exit the application
    private Boolean cont = false;

    /*
     * Method: menu()
     * takes in no params
     * prints the menu and takes in user input via command line
     * directs application via switch ladder to correct object call
     * from subclass based on user choice
     */
    private void menu(){
        do{
            //prompt for menu display
            System.out.println("Select from the menu below: \n");
            //print the menu list
            for(int i = 0; i < shapeList.length+1; i++) {
                if(i < 9) {
                    System.out.println(i+1 + ". Construct a " + shapeList[i]);
                }
                else {
                    System.out.println(i+1 + ". Exit the Program");
                }
            }
            //call menu validation
            int menuChoice = validateMenu("Enter your selection from the menu: ");
            //create Shape object
            Shape shape;
            //create TwoDimensionalShape object
            TwoDimensionalShape TwoD;
            //create ThreeDimenionalShape object
            ThreeDimensionalShape ThreeD;
            //switch statement to direct user choice to appropriate subclass call
            switch(menuChoice) {
            case 1:
                //create a circle object
                Circle cir = new Circle();
                //set the identifier based on the shape list of selected index
                cir.setType(shapeList[0]);

                //point to the current circle object
                TwoD = cir;
                //print the header
                TwoD.printHeader();
                
                //user input
                double rad = validateNum("Enter the radius: ");

                TwoD.setValues(shapeList[0], rad);
                shape = TwoD;
                shape.setDim(2);
                shape.printInfo(cir.getType(), cir.getArea());
                break;
            case 2:
                //create rectangle object
                Rectangle rect = new Rectangle();
                //set the identifier based on the shape list of selected index
                rect.setType(shapeList[1]);

                //point to the current rectangle object
                TwoD = rect;
                //print the header
                TwoD.printHeader();

                //user input
                double length = validateNum("Enter the length: ");
                double width = validateNum("Enter the width: ");

                TwoD.setValues(shapeList[1], length, width);
                shape = TwoD;
                shape.setDim(2);
                shape.printInfo(rect.getType(), rect.getArea());
                break;
            case 3:
                //create square object
                Square sq = new Square();
                //set the identifier based on the shape list of selected index
                sq.setType(shapeList[2]);

                //point to the current square object
                TwoD = sq;
                //print the header
                TwoD.printHeader();

                //user input
                double sqLength = validateNum("Enter the length: ");

                TwoD.setValues(shapeList[2], sqLength);
                shape = TwoD;
                shape.setDim(2);
                shape.printInfo(sq.getType(), sq.getArea());            
                break;
            case 4:
                //create triangle object
                Triangle tri = new Triangle();
                //set the identifier based on the shape list of selected index
                tri.setType(shapeList[3]);

                //point to the current triangle object
                TwoD = tri;
                //print the header
                TwoD.printHeader();

                //user input
                double tLength = validateNum("Enter the base: ");
                double tWidth = validateNum("Enter the height: ");

                TwoD.setValues(shapeList[3], tLength, tWidth);
                shape = TwoD;
                shape.setDim(2);
                shape.printInfo(tri.getType(), tri.getArea());
                break;
            case 5:
                //create sphere object
                Sphere sph = new Sphere();
                //set the identifier based on the shape list of selected index
                sph.setType(shapeList[4]);

                //point to the current sphere object
                ThreeD = sph;
                //print the header
                ThreeD.printHeader();

                //User input
                double sphRadius = validateNum("Enter the radius: ");

                ThreeD.setValues(shapeList[4], sphRadius);
                shape = ThreeD;
                shape.setDim(3);
                shape.printInfo(sph.getType(), sph.getVolume());
                break;
            case 6:
                //create cube object
                Cube cb = new Cube();
                //set the identifier based on the shape list of selected index
                cb.setType(shapeList[5]);

                //point to the current cube
                ThreeD = cb;
                //print the header
                ThreeD.printHeader();

                //user input
                double sideLength = validateNum("Enter the length of the sides: ");

                ThreeD.setValues(shapeList[5], sideLength);
                shape = ThreeD;
                shape.setDim(3);
                shape.printInfo(cb.getType(), cb.getVolume());
                break;
            case 7:
                //create cone object
                Cone cn = new Cone();
                //set the identifier based on the shape list
                cn.setType(shapeList[6]);

                //point to the current cone
                ThreeD = cn;
                //print the header
                ThreeD.printHeader();

                //user input
                double cRad = validateNum("Enter the radius: ");
                double cHeight = validateNum("Enter the height: ");

                ThreeD.setValues(cn.getType(), cRad, cHeight);
                shape = ThreeD;
                shape.setDim(3);
                shape.printInfo(cn.getType(), cn.getVolume());
                break;
            case 8:
                //create cylinder object
                Cylinder cyl = new Cylinder();
                //set the identifier based on the shape List of selected index
                cyl.setType(shapeList[7]);

                //point to the current cylinder
                ThreeD = cyl;
                //print the header
                ThreeD.printHeader();

                //user input
                double cylRad = validateNum("Enter the radius: ");
                double cylHeight = validateNum("Enter the height: ");

                ThreeD.setValues(cyl.getType(), cylRad, cylHeight);
                shape = ThreeD;
                shape.setDim(3);
                shape.printInfo(cyl.getType(), cyl.getVolume());
                break;
            case 9:
                //create torus object
                Torus tor = new Torus();
                //set the identifier based on the shape list of selected index (encapsulate!)
                tor.setType(shapeList[8]);

                //point to the current Torus
                ThreeD = tor;
                //print header
                ThreeD.printHeader();

                //user input
                double minRad = validateNum("Enter the value of the minor radius: ");
                double maxRad = validateNum("Enter the value of the major radius: ");

                //validation to determine if the major Radius > minor Radius
                while(maxRad < minRad){
                    System.out.println("The major radius must be greater than the minor radius: ");
                    minRad = validateNum("Enter the value of the minor radius: ");
                    maxRad = validateNum("Enter the value of the major radius: ");
                }

                ThreeD.setValues(tor.getType(), minRad, maxRad);
                shape = ThreeD;
                shape.setDim(3);
                shape.printInfo(tor.getType(), tor.getVolume());
                break;
            case 10:
                //exit
                exit();
                break;
            default:
                //default
            }
            cont = validateExit("\nWould you like to continue? (Y/N): ");
        }while(cont);

    }

    /*
     * Method: validateNum
     * takes prompt: String, the prompt for the user input based on case from menu
     * takes in user input as num: double, the input based on the given prompt
     * validates that num is a doulbe and that it is positive. Reprompts if error occurs
     * returns a num: double, positive double
     */
    public double validateNum(String prompt){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        double num = -1.00;
       //get input from user, and validate if it is a double, reprompt if it is not a double
        do {
            System.out.print(prompt);
            String userInput = input.nextLine();
            try {
             //try to parse the input as a double
             num = Double.parseDouble(userInput);
             //if the number is a double, check if it is a positive number, reprompt if it is not positive
             while(num <= 0){
                 System.out.print("Please enter a number greater than 0: ");
                 userInput = input.nextLine();
                 num = Double.parseDouble(userInput);
             }
             flag = true;
            }catch(NumberFormatException e) {
                System.out.println("Please enter a valid double (e.g. 3.14)");
            }  
        }while(flag == false);
        return num;
    }

    /*
     * Method: validateNMenu
     * takes prompt: String, the prompt to enter a number for the menu selection
     * takes in user input as num: int, selection from the menu
     * validates that num is an int and is within the bounds of the menu selection. Reprompts if error occurs
     * returns num: int, selection from the menu in bounds of the menu
     */
    public int validateMenu(String prompt){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        //flag to reprompt
        boolean flag = false;
        //input variable set to -1, an invalid return
        int num = -1;
        //get input from the user, validate that it is an integer, reprompt if not integer
        do {
            try {
             System.out.print(prompt);
             String userInput = scan.nextLine();
             //try to parse the input as an int 
             num = Integer.parseInt(userInput);
             //menuChoice validation, reprompt if choice is not contained within the list bounds (1-10)
             while(num < 1 || num > 10) {
                 System.out.print("Please select an option 1 to 10: ");
                 userInput = scan.nextLine();
                 num = Integer.parseInt(userInput);
             }
             //flag true to break if the int was parsed
             flag = true;
             //throw error if the input is not int
            }catch(NumberFormatException e) {
                System.out.println("Please enter a valid integer (e.g. 3)");
            }
        }while(flag == false);
        return num;
    }
    
    private Boolean validateExit(String prompt) {
        String userInput = "";
        //flag to return if the user decides to exit
        Boolean nextRound = false;
        @SuppressWarnings("resource")
        Scanner nextStr = new Scanner(System.in);
        while(nextRound == false) {
            //prompt if the user wants to exit
            System.out.print(prompt);
            userInput = nextStr.nextLine();
            //if the user enters 'y' in any case, return true continue the menu()
            if(userInput.equalsIgnoreCase("Y")) {
                nextRound = true;
            }
            //if the user enters 'n' in any case, call exit() to exit the application
            else if(userInput.equalsIgnoreCase("N")){
                exit();
            }
            //if the user does not enter 'y' or 'n' in any case, reprompt
            else {
                nextRound = validateExit("Please enter 'Y' to continue, or 'N' to exit: ");
            }
        }
        return nextRound;
    }


    /*
     * Method: exit()
     * Takes in no parameters
     * thanks the user for using the application
     * reports the date and time
     */
    private void exit() {
        //create calendar object
        Calendar c = Calendar.getInstance();
        //create time formatter
        DateFormat form = new SimpleDateFormat("hh:mm a");
        String time = form.format(new Date()).toString();
        //print thank you message with date and time
        System.out.println("Thank you for using the Shapes Application. Today is " + c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)+ " " + c.get(Calendar.DATE) + " at " + time);
        //TRY TO PUT THANK YOU STATEMENT IN THE EXIT()
        System.exit(0);
    }
    
    //main
    public static void main(String[] args) {
        System.out.println("***** Welcome to the Java OO Shapes Program *****\n");
        //create tester object
        ShapeTester s = new ShapeTester();
        //call the first menu
        s.menu();
    }

}
