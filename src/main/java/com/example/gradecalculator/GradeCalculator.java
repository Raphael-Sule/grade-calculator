

package com.example.gradecalculator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import
public class GradeCalculator {
    // TODO: Implement method to calculate final numeric grade from a list of scores

    // TODO: Implement method to convert numeric grade into letter grade

    // TODO: Include boundary conditions (e.g., 89.9 vs 90.0) for A, B, C, etc.
    
    public static double calculateAverage(double[] grades) {
        if (grades == null || grades.length == 0) 
        {
             throw new IllegalArgumentException("Grades array cannot be null or empty");
        }

        double sum = 0.0;
        for (double grade : grades) {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100");
            }
            sum += grade;
        }
        return sum / grades.length;  
    }

    public static char calculateLetterGrade(double average) {
        return 'F'; 
    }
}
