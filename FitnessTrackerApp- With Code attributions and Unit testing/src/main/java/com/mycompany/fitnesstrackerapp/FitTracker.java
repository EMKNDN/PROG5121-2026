
package com.mycompany.fitnesstrackerapp;


public class FitTracker {
    //Attributes
    String name;
    int age;
    int stepGoal=10000;//Hardcoded value
    
    //Constructor
    public FitTracker( String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    
    //Methods
    
    //Method with no parameters
    public void displayProfile()
    {
        System.out.println("----FITNESS TRACKING PROFILE----");
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
        System.out.println("Daily Step Goal " + stepGoal);
        System.out.println("----------------------------------");
        
    }
    
    //Method with a parameter
    public void welcomeUser(String personName)
    {
           System.out.println("Welcome back " + personName + "!"); 
    }
    
    //Method with a return value
    public int stepsRemaining( int stepsWalked)
    {
        return stepGoal-stepsWalked;
}
    
    //Boolean method
    public boolean reachedGoal( int stepsWalked)
    {
        return stepsWalked >= stepGoal;
        //5000 >= 10000= false
        //20000>= 10000= True
    }
}//End of class
