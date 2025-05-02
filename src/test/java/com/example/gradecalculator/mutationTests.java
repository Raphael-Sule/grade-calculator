// targeted tests after BVT and ECT are formatted and written in here
package com.example.gradecalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

public class mutationTests {

    @ParameterizedTest(name="{0}")
    @MethodSource("calculateLetterGradeMutationTestGenerator")
    public void test_CalculateLetterGrade_MutationKilling(String description, double score, char expectedGrade) {
        assertEquals(expectedGrade, GradeCalculator.calculateLetterGrade(score), description);
    }

    private static Stream<Arguments> calculateLetterGradeMutationTestGenerator() {
        return Stream.of(
            Arguments.of("t1_line 31", 90.0, 'A'),
            Arguments.of("t1_line_34", 80.0, "B"),
            Arguments.of("t1_line_39", 70.0, "C"),
            Arguments.of("t1_line_43", 60.0, "D")
        );
    }
}
