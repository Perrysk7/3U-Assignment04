
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // create a starting value 
        int square = 1; 
        
        // make a loop that will run untill the value equals a 100 or the player quits 
        while(square != 100){ 
           // get the user to role the dice 
            System.out.println("Enter  the sum of dice rolled.");
            // create a value of each role of the dice 
            int dice = input.nextInt(); 
            // total value of the square 
            square = square + dice; 
            
            // if the dice role is in between 2 and 12, quit game 
            if(dice < 2 && dice > 12){ 
                System.out.println("You Quit!");
                break;
            }
            // make the ladders on the board
            
            // first ladder 
            if(square == 9){
                square = 34;
            }
            
            // second ladder 
            if(square == 40){
                square = 64;
            }
            
            // third ladder
            if(square == 67){
                square = 86; 
            }
            
            // make the snakes on the board 
            
            // first snake 
            if(square == 54){
                square = 19;
            }
            
            // second snake 
            if(square == 90){
                square = 48;
            }
            
            // third snake 
            if(square == 99){
                square = 77; 
            }
            
            // when a user reaches the 100th square, they win
            if(square == 100){
                System.out.println("YOU WIN!");
                break;
            }
            if(square > 100){
                square = square - dice;
            }
            
            
            // tell user the square that they are on 
            System.out.println("You are on square " + square);    
        }
    }
}
