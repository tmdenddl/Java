package GradeCalculator;

import java.util.ArrayList;

public class GradeCalculator {
    // Instance Variable
    public final String name;
    public final double currentScore;
    public final int currentCredit;

    private ArrayList<Course> courses = new ArrayList<>();

    // Constructor
    public GradeCalculator(String name, double currentScore, int currentCredit) {
        this.name = name;
        this.currentScore = currentScore;
        this.currentCredit = currentCredit;
    }

    // Methods
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void print() {
        System.out.println("직전 학기 성적: " + currentScore + " (총 " + currentCredit + "학점)");

        double scoreSum = 0;
        int creditSum = 0;
        for(Course course: courses) {
            scoreSum += course.getScore() * course.credit;
            creditSum += course.credit;
        }
        System.out.println("이번 학기 성적: " + (scoreSum/creditSum) + " (총 " + creditSum + "학점)");

        double totalScore = currentScore * currentCredit + scoreSum;
        int totalCredit = currentCredit + creditSum;
        System.out.println("전체 예상 학: " + (totalScore/totalCredit) + " (총 " + totalCredit + "학점)");
    }
}
