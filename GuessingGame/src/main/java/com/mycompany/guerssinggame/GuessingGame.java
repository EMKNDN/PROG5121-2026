
package com.mycompany.guerssinggame;

import java.util.Random;
import java.util.Scanner;

//OR import java.util.*;//Wildcard
public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(11);
        //generate a random number between 0 and 10
        //(inclusive of 0 and exclusive of 11)
        
        int userGuess;
        int attempts= 0;
        
        System.out.println("Welcome to the Guessing Game!");
        
        do
        {
            System.out.println("Enter your number (Between 1 and 10) :");
            userGuess=input.nextInt();
            attempts++;
            
            if (userGuess < randomNumber)
            {
                System.out.println("Your guess is to low, try again"); 
            }
            else if (userGuess > randomNumber )
            {
                 System.out.println("Your guess is to high, try again");
            }
        }//end of do
        while (userGuess != randomNumber);
        System.out.println("Well Done!!!, the correct number was: " +randomNumber);
          System.out.println("Number of attempts:" +attempts);
          input.close();
    }
}
