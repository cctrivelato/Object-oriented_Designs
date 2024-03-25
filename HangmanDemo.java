import java.util.*;
/**
 * Write a description of class HangmanDemo here.
 * It tests the Hangman game class
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanDemo
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Hangman game = new Hangman();
        game.initialize("Happiness");
        game.playGame();
        
        System.out.println("Enter a word to be added");
        String extraWord = keyboard.nextLine();
        game.initialize(extraWord);
        System.out.println("Lets play a round of hangman.");
        game.playGame();
        
        game.initialize("I'll be back.");
        System.out.println("\nLets play a second round of hangman.");
        game.playGame();
    }
}
