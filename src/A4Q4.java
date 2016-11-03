
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the cost of food from the user for the prom
        System.out.println("How much does the food cost for the prom?");
        double food = input.nextDouble(); 
        
        // get the cost of dj from the user for the prom
        System.out.println("How much does the dj cost for the prom?");
        double dj = input.nextDouble(); 
        
        // get the cost to rent a hall from the user for the prom
        System.out.println("How much does it cost to rent a hall for the prom?");
        double rent = input.nextDouble(); 
        
        // get the cost of decorations from the user for the prom
        System.out.println("How much does the decorations cost for the prom?");
        double decoration = input.nextDouble(); 
        
        // get the cost of staff from the user for the prom
        System.out.println("How much does the staff cost for the prom?");
        double staff = input.nextDouble(); 
        
        // get the cost of miscellaneous from the user for the prom
        System.out.println("what are the miscellaneous costs for the prom?");
        double miscellaneous = input.nextDouble(); 
        
        // get the total cost for the prom 
        double total = food + dj + rent + decoration + staff + miscellaneous; 
        
        // divide the total cost by 35 to determine how many people are needed to break even
        double answer = total/35; 
        answer = Math.ceil(answer); 
        
        // give user the final answer 
        System.out.println("The total cost is $" + total + "." + " You will need to sell " + answer + 
        "tickets to break even.");   
    }
}
