// Student.java - represents a student and their assignment scores

package com.example.gradecalculator;

public class Student {
    // TODO: Add fields for student name, ID, and list of grades

    // TODO: Add constructor to initialize student object

    // TODO: Add getters and setters for the fields

    // TODO: Optionally add method to compute average score for this student
    
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }
}