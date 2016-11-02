
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user for input measurement
        System.out.println("Please enter the measurement in inches"); 
        
        // record the number 
        double inch = input.nextDouble(); 
        
        // convert inches into centimeters 
        double cm = inch * 2.54; 
        
        // give user the converted value 
        System.out.println(inch + "inches is the same as" + cm + "cm");    
    }
}
