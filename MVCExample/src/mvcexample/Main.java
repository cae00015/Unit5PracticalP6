package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1("First Controller", model, 40, 100); // Create first controller
        Controller2 c2 = new Controller2("Second Controller", model, 390, 100); // Create second controller

        Controller2 c2_1 = new Controller2("Third Controller", model, 740, 100); // Create another Controller2
        Controller2 c2_2 = new Controller2("Forth Controller", model, 90, 300); // Create another Controller2
        Controller2 c2_3 = new Controller2("Fifth Controller", model, 440, 300); // Create another Controller2
        
    } // main
  
} // Main
