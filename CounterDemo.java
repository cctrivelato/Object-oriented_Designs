import java.util.*;
/**
 * CounterDemo
 * Tests the class that adds and subtracts one unit or resets to 0
 * @author (Caique Trivelato)
 * @version (3/4/2024)
 */
public class CounterDemo
{
    public static void main(String []args)
    {
        Counter counting = new Counter();
        
        counting.Count(0);
        
        for(int i = 0; i < 10; i++)
        {
            counting.Add();
        }
        
        counting.Restart();
               
        for(int i = 0; i < 10; i++)
        {
            counting.Add();
        }
        
        for(int i = 0; i < 10; i++)
        {
            counting.Subtract();
        }
    }
}
