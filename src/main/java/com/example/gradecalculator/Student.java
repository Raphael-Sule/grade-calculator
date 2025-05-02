// Student.java - represents a student and their assignment scores

package com.example.gradecalculator;

import java.util.Arrays;

public class Student {
    private final String name;
    private final String studentId;
    private final double[] grades;

public Student(String name, double[] grades, String studentId) {
            if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
       
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array must not be null or empty");
        }

        
        this.name = name;
        this.studentId = studentId;
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getName() 
    {
        return name;
    }

    public String getStudentId() 
    {
        return studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() 
    {
        return GradeCalculator.calculateAverage(grades);
    }

    public char getLetterGrade() 
    {
        return GradeCalculator.calculateLetterGrade(getAverage());
        
    }

    

}