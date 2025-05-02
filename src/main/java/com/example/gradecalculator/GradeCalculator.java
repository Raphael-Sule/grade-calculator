

package com.example.gradecalculator;
public class GradeCalculator 
{    
    public static double calculateAverage(double[] grades) 
    {
        if (grades == null || grades.length == 0) 
        {
             throw new IllegalArgumentException("Grades array cannot be null or empty");
        }

        double sum = 0.0;
        for (double grade : grades) 
        {
            if (grade < 0 || grade > 100) 
            {
                throw new IllegalArgumentException("Grade must be between 0 and 100");
            }
            sum += grade;
        }
        return sum / grades.length;  
    }

    public static char calculateLetterGrade(double average) 
    {
        if (average < 0 || average > 100) 
        {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (average >= 90.00) 
        {
            return 'A';
        } 
        else if (average >= 80.00) 
        {
            return 'B';
        } 
        else if (average >= 70.00) 
        {
            return 'C';
        } 
        else if (average >= 60.00) 
        {
            return 'D';
        } 
        else 
        {
            return 'F';
        }
    }

// can start by having average checks not being be inclusive, so a 90 would be a B i.e.
// should be >=: when running mutation tests or BVT it should be figured out.
}

