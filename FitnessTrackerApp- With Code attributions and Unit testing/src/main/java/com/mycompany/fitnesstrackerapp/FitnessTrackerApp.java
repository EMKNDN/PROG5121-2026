//Code attribution
//Title:Java constructors
//Author:geeksforgeeks
//Date:20 january 2026
//Version:1
//Availability: insert url

//Code attribution
//OpenAI. 2026.Chat-Gpt (Version 5.3). [Large language model]. 
//Available at:  https://chatgpt.com/share/69ba5671-8e64-8007-a7ea-b4a0af54bda2
//[Accessed: 17 March 2026].

package com.mycompany.fitnesstrackerapp;


public class FitnessTrackerApp {

    public static void main(String[] args) {
        //Create object
        FitTracker user1 = new FitTracker ("Keaan", 18);
         
        System.out.println("Default constructor");//Resource from internet
    
          String personName= user1.name;
        
          System.out.println("----------------------------------");
       
         user1.welcomeUser(personName);
        //Call whatever methods are necessary
        
         System.out.println("----------------------------------");
        user1.displayProfile();
       
        System.out.println("----------------------------------");
       
        int remaining=user1.stepsRemaining(3000);
        System.out.println("Steps remaining to reach goal: " + remaining);
    
     System.out.println("------------GOAL STATUS----------------------");
    int stepsWalked= 25000;
    
    boolean goalStatus=user1.reachedGoal(stepsWalked);
     System.out.println("Goal Reached : " + goalStatus);
    
    }
}//End of class
