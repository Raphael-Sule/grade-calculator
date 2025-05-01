// GradeUtils.java - utility class for validation and other helpers

package com.example.gradecalculator;

public class GradeUtils {
    // TODO: Implement validation method to ensure scores are between 0 and 100

    // TODO: Add other helper methods as needed (e.g., rounding)
    
    public static boolean isPassing(char letterGrade) 
    {
        switch (Character.toUpperCase(letterGrade))
        {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                return true;
            case 'F':
                return false;
        }
        throw new IllegalArgumentException("Invalid letter grade: " + letterGrade);
    }

    public static double gpaConvert(char letterGrade) 
    {
        switch (Character.toUpperCase(letterGrade)) 
        {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;            
        }
        throw new IllegalArgumentException("Invalid letter grade: " + letterGrade);
    }
}   
