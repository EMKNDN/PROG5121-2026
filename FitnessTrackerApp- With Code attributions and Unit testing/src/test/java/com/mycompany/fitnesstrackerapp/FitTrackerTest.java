
package com.mycompany.fitnesstrackerapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FitTrackerTest {
    
     
    @Test
    public void testStepsRemaining()
    {
        FitTracker user= new FitTracker("Denzyl",25);
        assertEquals(5000,user.stepsRemaining(5000));
    }
    
      @Test
    public void testReachedGoal()
    {
        FitTracker user= new FitTracker("Denzyl",25);
        assertTrue(user.reachedGoal(12000));
    }
    
       @Test
    public void testReachedGoalFailed()
    {
        FitTracker user= new FitTracker("Denzyl",25);
        assertFalse(user.reachedGoal(5000));
    }
}
