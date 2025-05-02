package com.example.gradecalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

public class mutationTests {

    @ParameterizedTest(name="{0}")
    @MethodSource("mutationTestGenerator")
    public void test_CalculateLetterGrade_MutationKilling(String description, double score, String expectedGrade) {
        assertEquals(expectedGrade, GradeCalculator.calculateLetterGrade(score), description);
    }

    private static Stream<Arguments> mutationTestGenerator() {
        return Stream.of(
            Arguments.of("Mutation ≥ vs > at A boundary", 90.0, "A"),
            Arguments.of("Mutation ≥ vs > at B boundary", 80.0, "B"),
            Arguments.of("Mutation ≥ vs > at C boundary", 70.0, "C"),
            Arguments.of("Mutation ≥ vs > at D boundary", 60.0, "D"),
        );
    }
}
