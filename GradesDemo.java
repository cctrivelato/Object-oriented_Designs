import java.util.*;
/**
 * GradesDemo
 * Tests the class that calculate grades
 * @author (Caique Trivelato)
 * @version (3/2/2024)
 */
public class GradesDemo
{
    public static void main(String []args)
    {
        Scanner keyboard = new Scanner(System.in);
        Grades gradebook = new Grades();
        
        boolean scores = false;
        while (scores == false)
        {
            System.out.print("Enter here quiz 1 score (0-10): ");
            int quiz1Score = keyboard.nextInt();
            
            System.out.print("Enter here quiz 2 score (0-10): ");
            int quiz2Score = keyboard.nextInt();
            
            System.out.print("Enter here midterm score (0-100): ");
            int midTermScore = keyboard.nextInt();
            
            System.out.print("Enter here final exam score (0-100): ");
            int finalExamScore = keyboard.nextInt();
        
            if(quiz1Score > 10 || quiz1Score < 0)
            {
                System.out.println("Error. The score entered is not valid.");
                scores = false;
            } 
            else if(quiz2Score > 10 || quiz2Score < 0)
            {
                System.out.println("Error. The score entered is not valid.");
                scores = false;
            }             
            else if(midTermScore > 100 || midTermScore < 0)
            {
                System.out.println("Error. The score entered is not valid.");
                scores = false;
            } 
            else if(finalExamScore > 100 || finalExamScore < 0)
            {
                System.out.println("Error. The score entered is not valid.");
                scores = false;
            } 
            else
            {
                gradebook.Scores(quiz1Score, quiz2Score, midTermScore, finalExamScore);
                gradebook.CourseGrade();
                scores = true;
            }
        }
    }
}