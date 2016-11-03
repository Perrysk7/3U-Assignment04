
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // input the 1st number
        double one = input.nextDouble(); 
        
        // input the 2nd number 
        double two = input.nextDouble(); 
        
        // input the 3rd number 
        double three = input.nextDouble(); 
        
        // input the 4th number
        double four = input.nextDouble(); 
        
        // display all the numbers in the same row 
        System.out.println("your numbers are " + one + ", " + two + ", " + three + ", " + four);
   
    }
}
