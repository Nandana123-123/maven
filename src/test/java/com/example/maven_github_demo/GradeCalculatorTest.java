
package com.example.maven_github_demo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testTotal() {
        assertEquals(225,
            GradeCalculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            GradeCalculator.calculateAverage(75, 68, 82));
    }

    @Test
    void testGradeA() {
        assertEquals('A',
            GradeCalculator.calculateGrade(90));
    }

    @Test
    void testGradeB() {
        assertEquals('B',
            GradeCalculator.calculateGrade(75));
    }

    @Test
    void testGradeC() {
        assertEquals('C',
            GradeCalculator.calculateGrade(50));
    }
}
