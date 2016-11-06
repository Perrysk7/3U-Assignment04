
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the daytime minutes from the user
        System.out.println("Please enter the number of daytime minutes.");
        double daytimeM = input.nextDouble(); 
        
        // get the evening minutes form the user
        System.out.println("Please enter the number of evening minutes.");
        double eveningM = input.nextDouble(); 
        
        // get the weekend minutes from the user
        System.out.println("Please enter the number of weekend minutes.");
        double weekendM = input.nextDouble(); 
        
        // Calculate the cost of plan A when minutes are less than or equal to the limit (100 minutes) 
        double planA = 0; 
        if(daytimeM <= 100){
            planA = (daytimeM * 0) + (eveningM * 0.15) + (weekendM * 0.2); 
            // round the cost of plan A to 2 decimal places
            planA = Math.round(planA * 100) / 100.0; 
            // give user the total cost for plan A
            System.out.println("Plan A costs $" + planA + ".");
            
            // give user the cost for plan A when minutes are greater than the limit (100 minutes)
        } else {
            planA = ((daytimeM - 100) * 0.25) + (eveningM * 0.15) + (weekendM * 0.2); 
            // round the cost of plan A to 2 decimal places 
            planA = Math.round(planA * 100) / 100.0;
            // give user the total cost foe plan A
            System.out.println("Plan A costs $" + planA + ".");
        }
        
        // Calculate the cost of plan B when minutes are less than or equal to the limit (250 minutes)
        double planB = 0;
        if(daytimeM <= 250){
            planB = (daytimeM * 0) + (eveningM * 0.35) + (weekendM * 0.25); 
            // round the cost of plan B to 2 decimal places
            planB = Math.round(planB * 100) / 100.0; 
            // give user the total cost for plan A
            System.out.println("Plan B costs $" + planB + ".");
            
            // give user the cost for plan B when minutes are greater than the limit (250 minutes)  
        } else {
            planB = ((daytimeM - 250) * 0.45) + (eveningM * 0.35) + (weekendM * 0.25); 
            // round the cost of plan B to 2 decimal places 
            planB = Math.round(planB * 100) / 100.0;
            // give user the total cost foe plan B
            System.out.println("Plan B costs $" + planB + "."); 
        }
        // when plan B is cheaper
        if(planA > planB){
            System.out.println("Plan B is cheaper.");
        }
        // when plan A is cheaper 
        if(planA < planB){ 
            System.out.println("Plan A is cheaper.");
        }
        // when both plans are the same price 
        if(planA == planB){
            System.out.println("Plan A and Plan B are the same price.");
        }  
    }
}
