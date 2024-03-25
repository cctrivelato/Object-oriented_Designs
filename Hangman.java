import java.util.*;
/**
 * Hangman
 * basic game setup
 * @author (Caique Trivelato)
 * @version (3/1/2024)
 */
public class Hangman
{
    //class variablees defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    private int guessesMade;
    private int incorrectGuesses;
    
    //this method is void but expects a string to be sent in and does basic setup
    public void initialize(String word){
        secretWord = word.toLowerCase().trim();
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
    }
    
    //This method returns a hidden word and takes in a string that is changed to said hidden word.
    public String createDisguisedWord(String word){
        word.toLowerCase();
        
        word = word.replace('a', '?');
        word = word.replace('b', '?');
        word = word.replace('c', '?');
        word = word.replace('d', '?');
        word = word.replace('e', '?');
        word = word.replace('f', '?');
        word = word.replace('g', '?');
        word = word.replace('h', '?');
        word = word.replace('i', '?');
        word = word.replace('j', '?');
        word = word.replace('k', '?');
        word = word.replace('l', '?');
        word = word.replace('m', '?');
        word = word.replace('n', '?');
        word = word.replace('o', '?');
        word = word.replace('p', '?');
        word = word.replace('q', '?');
        word = word.replace('r', '?');
        word = word.replace('s', '?');
        word = word.replace('t', '?');
        word = word.replace('u', '?');
        word = word.replace('v', '?');
        word = word.replace('w', '?');
        word = word.replace('x', '?');
        word = word.replace('y', '?');
        word = word.replace('z', '?');
        
        return word;
    }
    
    //This method is void and takes in a character this is the letter guess and checking to see if correct.
    public void makeGuess(Character c){
        if (Character.isLetter(c)){
            String guess = "" + c;
            guess = guess.toLowerCase();
            int letterPosition = lettersRemaining.indexOf(guess);
            boolean goodGuess = letterPosition > -1;
            while(letterPosition > -1){
                String before = lettersRemaining.substring(0, letterPosition);
                String after = lettersRemaining.substring(letterPosition+1);
                lettersRemaining = before + "#" + after;
                
                before = disguisedWord.substring(0, letterPosition);
                after = disguisedWord.substring(letterPosition+1);
                disguisedWord = before + guess + after;
                
                letterPosition = lettersRemaining.indexOf(guess);
            }
            
            guessesMade++;
            
            if(!goodGuess)
                incorrectGuesses++;
        }else
            System.out.println("Sorry, your guess must be an alphabet character from a to z");
                
        if(incorrectGuesses >=5)
        {
            System.out.println("You lose");
            System.exit(99999999);
        }
    }
    
    //accessor method for the hidden word
    public String getDisguisedWord(){
        return disguisedWord;
    }
    
    //accessor method for the secret word
    public String getSecretWord(){
        return secretWord;
    }
    
    //accessor method for the guess
    public int getGuessCount(){
        return guessesMade;
    }
    
    //this method returns a boolean based on the hidden word being correct
    public boolean isFound(){
        return secretWord.equals(disguisedWord);
    }
    
    //This is a void method that starts the game
    public void playGame(){
        if(!isFound()){
            System.out.println("We are playing hangman");
            while(!isFound()){
                System.out.println("\nThe disguised word is <" + disguisedWord + ">");
                System.out.println("Guess a letter");
                Scanner reader = new Scanner(System.in);
                String guess = reader.next();
                if(guess.length()!=1)
                    System.out.println("Sorry, bad guess. Need a single letter.");
                else{
                    makeGuess(new Character(guess.charAt(0)));
                }
                System.out.println("Guess made " + guessesMade + " with " + incorrectGuesses + " wrong");
            }
            System.out.println("Congratulations, you found the secret word: " + secretWord);
        }
    }
}

