package com.example.maven_github_demo;


public class GradeCalculator {

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1, m2, m3) / 3.0;
    }

    public static char calculateGrade(double average) {

        if (average >= 80) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public static void main(String[] args) {

        int m1 = 75;
        int m2 = 68;
        int m3 = 82;

        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(m1, m2, m3);
        char grade = calculateGrade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
