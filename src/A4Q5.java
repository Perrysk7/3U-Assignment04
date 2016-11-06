
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the user's name 
        System.out.println("Please enter your name");
        String name = input.nextLine(); 
        
        // calculate the user's average on the first test 
        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble(); 
        // get the user's achieved mark on test1 
        System.out.println("What was your achieved mark in this test?");
        double mark1 = input.nextDouble(); 
        // average of the test 
        double average1 = (mark1 / test1) * 100; 
        
        // calculate the user's average on the second test 
        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble(); 
        // get the user's achieved mark on test2 
        System.out.println("What was your achieved mark in this test?");
        double mark2 = input.nextDouble(); 
        // average of the test 
        double average2 = (mark2 / test2) * 100; 
        
        // calculate the user's average on the third test 
        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble(); 
        // get the user's achieved mark on test3 
        System.out.println("What was your achieved mark in this test?");
        double mark3 = input.nextDouble(); 
        // average of the test 
        double average3 = (mark3 / test3) * 100; 
        
        // calculate the user's average on the forth test 
        System.out.println("What was the forth test out of?");
        double test4 = input.nextDouble(); 
        // get the user's achieved mark on test4 
        System.out.println("What was your achieved mark in this test?");
        double mark4 = input.nextDouble(); 
        // average of the test 
        double average4 = (mark4 / test4) * 100; 
        
        // calculate the user's average on the fifth test 
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble(); 
        // get the user's achieved mark on test5 
        System.out.println("What was your achieved mark in this test?");
        double mark5 = input.nextDouble(); 
        // average of the test 
        double average5 = (mark5 / test5) * 100; 
        
        // give the user averags for all tests 
        
        // name of the user 
        System.out.println("Test scores of " + name + ":");
        
        // test 1 
        System.out.println("Test 1: " + average1 + "%"); 
        
        // test 2 
        System.out.println("Test 2: " + average2 + "%"); 
        
        // test 3
        System.out.println("Test 3: " + average3 + "%"); 
        
        // test 4
        System.out.println("Test 4: " + average4 + "%");
        
        // test 5
        System.out.println("Test 5: " + average5 + "%");
        
        // calculate the total average of all tests
        double finalaverage = (average1 + average2 + average3 + average4 + average5) / 5;
        System.out.println("Your total average is:" + finalaverage + "%");  
    }
}
