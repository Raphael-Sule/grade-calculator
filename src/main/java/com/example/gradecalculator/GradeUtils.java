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
}   
