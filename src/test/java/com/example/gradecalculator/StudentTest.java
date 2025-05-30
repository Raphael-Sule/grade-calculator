// StudentTest.java - JUnit tests for Student class

package com.example.gradecalculator;

import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class StudentTest {

    @ParameterizedTest(name ="{0}")
    @MethodSource("studentPerformanceTestsGenerator")
    public void testStudentPerformance(String description, String id, String name, double[] grades, double expectedAverage, char expectedLetter, boolean expectedPass) 
    {
        Student student = new Student(name, grades, id);
        assertEquals(id, student.getStudentId());
        assertEquals(name, student.getName());
        assertEquals(expectedAverage, student.getAverage(), 0.01);
        assertEquals(expectedLetter, student.getLetterGrade());
    }
    
    private static Stream<Arguments> studentPerformanceTestsGenerator() {
        return Stream.of(
            Arguments.of("Test 1", "001", "Axel", new double[]{90.0, 80.0, 85.0}, 85.0,'B', true),
            Arguments.of("Test 1", "002", "Brian", new double[]{100.0, 95.0, 92.0}, 95.67, 'A', true),
            Arguments.of("Test 1", "003", "Celine", new double[]{60.0, 58.0, 62.0}, 60.0, 'D', true),
            Arguments.of("Test 1", "004", "David", new double[]{50.0, 55.0, 52.0}, 52.33, 'F', false),
            Arguments.of("Boundary Test 1", "005", "Egan", new double[]{90.0, 90.0, 90.0}, 90.0, 'A', true)
            
        );
    }
}
