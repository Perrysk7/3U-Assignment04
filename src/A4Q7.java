
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in); 
        
        // get user to enter the speed limit 
        System.out.println("Please enter the speed limit.");
        int speedL = input.nextInt(); 
        
        // get user to enter it's vehicle speed 
        System.out.println("Please enter the recorded speed of the car.");
        int speedC = input.nextInt(); 
        
        // create a value to determine if user is within or over the speed limit
        int speedV = speedC - speedL; 
        
        // if the user's car is in between 1km/h and 20km/h over the speed limit, give user the fine of $100
        if(speedV <= 20 && speedV >=1){
            System.out.println("You are speeding and your fine is $100.");
        }
        // if the user's car is in between 21km/h and 30km/h over the speed limit, give user the fine of $270
        if(speedV >= 21 && speedV <= 30){
            System.out.println("You are speeding and your fine is $270.");
        } 
        // if the user's car is above 31km/h over the speed limit, give user the fine of $500
        if(speedV >= 31){
            System.out.println("You are speeding and your fine is $500");
        }
        // if the user is not speeding, congratulate them
        if(speedV <= 0){
            System.out.println("Congratulations, your are within the speed limit.");
        }
    }
}
