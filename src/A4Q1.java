
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input 
        Scanner input = new Scanner(System.in);
        
        // ask the user's name 
        System.out.println("Please enter your name");
        
        // find out the user's name 
        String name = input.nextLine();
        
        System.out.println("Hello " + name + ". How are you today?");  
    }
}
