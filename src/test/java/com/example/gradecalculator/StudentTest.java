// StudentTest.java - JUnit tests for Student class

package com.example.gradecalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @ParameterizedTest
    @MethodSource("studentProvider")
    public void testStudentPerformance(String id, String name, double[] grades, double expectedAverage, char expectedLetter, boolean expectedPass) 
    {
        Student student = new Student(name, grades, id);
        assertEquals(id, student.getStudentId());
        assertEquals(name, student.getName());
        assertEquals(expectedAverage, student.getAverage(), 0.01);
        assertEquals(expectedLetter, student.getLetterGrade());
    }
    
    private static Stream<org.junit.jupiter.params.provider.Arguments> studentProvider() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of("S001", "Alice", new double[]{90.0, 80.0, 85.0}, 85.0, 'B', true),
            org.junit.jupiter.params.provider.Arguments.of("S002", "Bob", new double[]{100.0, 95.0, 92.0}, 95.67, 'A', true),
            org.junit.jupiter.params.provider.Arguments.of("S003", "Charlie", new double[]{60.0, 58.0, 62.0}, 60.0, 'D', true),
            org.junit.jupiter.params.provider.Arguments.of("S004", "Dana", new double[]{50.0, 55.0, 52.0}, 52.33, 'F', false)
        );
    }
}
