import java.util.*;
/**
 * Grades
 * Calculates the input of grades
 * @author (Caique Trivelato)
 * @version (3/2/2024)
 */
public class Grades
{
    //instance variables
    private double quiz1;
    private double quiz2;
    private double midTerm;
    private double finalExam;
    private double finalGrade;
    private String letterGrade;
    
    //this method will place the score that the user input in the instance variables created in this class
    public void Scores(double quiz1score, double quiz2score, double midTermScore, double finalExamScore)
    {
        quiz1 = CalculationQuiz(quiz1score);
        quiz2 = CalculationQuiz(quiz2score);
        midTerm = CalculationMidTerm(midTermScore);
        finalExam = CalculationFinal(finalExamScore);
    }
    
    //methods that will convert the quiz scores into the percentage
    public double CalculationQuiz(double score1)
    {
        quiz1 = score1 * 10 * 0.125;
        return quiz1;
    }
    
    //methods that will convert the mid term scores into the percentage
    public double CalculationMidTerm(double score2)
    {
        midTerm = score2 * 0.25;
        return midTerm;
    }
    
    //methods that will convert the final exam scores into the percentage 
    public double CalculationFinal(double score3)
    {
        finalExam = score3 * 0.5;
        return finalExam;
    }
    
    //methods that will get the letter grade that corresponds to their final grade
    public String finalLetterGrade(double finalGrade)
    {
        if(finalGrade >= 0 && finalGrade < 60)
            letterGrade = "F";
        else if(finalGrade >= 60 && finalGrade < 70)
            letterGrade = "D";
        else if(finalGrade >= 70 && finalGrade < 80)
            letterGrade = "C";
        if(finalGrade >= 80 && finalGrade < 90)
            letterGrade = "B";
        else if(finalGrade >= 90 && finalGrade <= 100)
            letterGrade = "A";
        return letterGrade;
    }
    
    //this method will calculate the total final grade percentage and give the final information about all the grades
    public void CourseGrade()
    {
        finalGrade = quiz1 + quiz2 + midTerm + finalExam;
        String averageLetterGrade = finalLetterGrade(finalGrade);
        
        System.out.println("Final Student's Records:");
        System.out.println("Student's Quiz 1 Score: " + quiz1);
        System.out.println("Student's Quiz 2 Score: " + quiz2);
        System.out.println("Student's Mid Term Score: " + midTerm);
        System.out.println("Student's Final Exam Score: " + finalExam);
        System.out.println("Student's Final Total Score: " + finalGrade);
        System.out.println("Student's Final Letter Grade: " + letterGrade);
    }
}