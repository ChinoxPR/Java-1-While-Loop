/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4program3;
import javax.swing.JOptionPane; // import the users input
import java.util.Random; // import the random variable for program
/**
 *
 * @author John Hernandez 06/12/24
 */
public class Assignment4program3 
{

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) 
    {
        
        //Declaring variables
        int userNumber;
        int randNumber;
        String str;
        String loop = "Y"; //start and control the loop
    
        //Creating random Object 
        Random randNumberObject = new Random();
      
        System.out.println("Welcome to my guessing game");
      
        //While loop for start of program
        while(loop.equalsIgnoreCase("y"))// loop will be true even if I assign a lower case y or uppercase Y
        {
            str = JOptionPane.showInputDialog("Enter any Number from (1-10) for guessing what number the machine is going to print out");
            randNumber = randNumberObject.nextInt(10); //Computer creates random variable
            userNumber = Integer.parseInt(str);
            
            //Decides what statement to print out base on user input and computer input
            if(userNumber > randNumber) // IF ELSE-IF statement to direct statement output 
            {
                System.out.println("The number is too high. You Entered: " + userNumber + " Machine Entered: " + randNumber +" Try Again");
            }
            else if(userNumber < randNumber)
            {
                System.out.println("The number is too Low. You Entered: " + userNumber + " Machine Entered: " + randNumber + " Try Again");
            }
            else if (userNumber == randNumber)
            {
                System.out.println("Number's Match!!! " +userNumber+" is the matching number" );
                loop = "N"; // breaks out of the while loop 
            }
        }
        System.out.println("Thank you for playing");
    }
}

