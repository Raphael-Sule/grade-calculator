// GradeCalculatorTest.java - JUnit tests for GradeCalculator

package com.example.gradecalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GradeCalculatorTest {

    @ParameterizedTest
    @MethodSource("letterGradeTestGenerator")
    public void testLetterGrade(String testName, double score, String expectedGrade) {
        assertEquals(expectedGrade, GradeCalculator.calculateLetterGrade(score), testName);
    }

    // Tests that show code can be used to teach ECT and BVT
    private static Stream<org.junit.jupiter.params.provider.Arguments> letterGradeTestGenerator() {
        return Stream.of(

            // ECT
            org.junit.jupiter.params.provider.Arguments.of("A range", 95.0, "A"),
            org.junit.jupiter.params.provider.Arguments.of("B range", 84.0, "B"),
            org.junit.jupiter.params.provider.Arguments.of("C range", 74.0, "C"),
            org.junit.jupiter.params.provider.Arguments.of("D range", 63.0, "D"),
            org.junit.jupiter.params.provider.Arguments.of("F range", 50.0, "F"),

            // BVT
            org.junit.jupiter.params.provider.Arguments.of("A to B boundary", 90.0, "A"),
            org.junit.jupiter.params.provider.Arguments.of("just below A", 89.9, "B"),

            org.junit.jupiter.params.provider.Arguments.of("B to C boundary", 80.0, "B"),
            org.junit.jupiter.params.provider.Arguments.of("just below B", 79.9, "C"),

            org.junit.jupiter.params.provider.Arguments.of("C to D boundary", 70.0, "C"),
            org.junit.jupiter.params.provider.Arguments.of("just below C", 69.9, "D"),

            org.junit.jupiter.params.provider.Arguments.of("D to F boundary", 60.0, "D"),
            org.junit.jupiter.params.provider.Arguments.of("just below D", 59.9, "F")
        );
    }
}
