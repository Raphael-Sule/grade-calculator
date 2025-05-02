// GradeCalculatorTest.java - JUnit tests for GradeCalculator

package com.example.gradecalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GradeCalculatorTest {

    @ParameterizedTest(name = "{0}")
    @MethodSource("letterGradeTestGenerator")
    public void testLetterGrade(String testName, double score, char expectedGrade) {
        assertEquals(expectedGrade, GradeCalculator.calculateLetterGrade(score), testName);
    }

    // Tests that show code can be used to teach ECT and BVT
    private static Stream<Arguments> letterGradeTestGenerator() {
        return Stream.of(

            // ECT
            
            Arguments.of("A range", 95.0, "A"),
            Arguments.of("B range", 85.0, "B"),
            Arguments.of("C range", 75.0, "C"),
            Arguments.of("D range", 65.0, "D"),
            Arguments.of("F range", 55.0, "F"),
            

            // weak normal BVT
            Arguments.of("just above A ", 90.1, "A"),
            Arguments.of("A to B boundary", 90.0, "A"),
            Arguments.of("just below A", 89.9, "B"),
            Arguments.of("just above B ", 80.1, "B"),
            Arguments.of("B to C boundary", 80.0, "B"),
            Arguments.of("just below B", 79.9, "C"),
            Arguments.of("just above C ", 70.1, "C"),
            Arguments.of("C to D boundary", 70.0, "C"),
            Arguments.of("just below C", 69.9, "D"),
            Arguments.of("just above D", 60.1, "D"),
            Arguments.of("D to F boundary", 60.0, "D"),
            Arguments.of("just below D", 59.9, "F")
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("letterGradeTestGeneratorExceptions")
    void testLetterGradeExceptions(String testName, double score, String expectedGrade) 
    {
        assertThrows(IllegalArgumentException.class, () -> GradeCalculator.calculateLetterGrade(score));
    }
    static Stream<Arguments> subtractDigitsTestGeneratorExceptions() {
        return Stream.of(
            Arguments.of("invalid max range", 105.0, new IllegalArgumentException()),
            Arguments.of("invalid min range", -55.0, new IllegalArgumentException())
        );
    }




}


