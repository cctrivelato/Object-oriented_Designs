import java.util.*;
/**
 * Counter
 * It adds and subtracts one unit from a value or resets it to 0
 * @author (Caique Trivelato)
 * @version (3/2/2024)
 */
public class Counter
{
    private int counter;
    
    public void Count(int score)
    {
        counter = score;
        System.out.println("The current count value is: " + counter);
        
    }

    public void CurrentCount()
    {
        System.out.println("The current count value is: " + counter);
    }
    
    public int Add()
    {
        counter++;
        System.out.println("We are adding one unit to the count value.");
        CurrentCount();
        return counter;
    }
    
    public int Subtract()
    {
        if(counter > 0)
        {
            System.out.println("We are subtracting one unit from the count value.");
            counter--;
            CurrentCount();
            return counter;
        } else
        {   
            System.out.println("The count value cannot be negative");
            counter = 0;
            CurrentCount();
            return counter;
        }
    }
    
    public int Restart()
    {
        System.out.println("We are setting the count value to 0.");
        counter = 0;
        CurrentCount();
        
        return counter;
    }
}

