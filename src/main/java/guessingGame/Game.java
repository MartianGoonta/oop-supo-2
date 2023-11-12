package src.main.java.guessingGame;
import java.util.Random;
import java.util.Scanner;


public class Game {
    private int guessNum;
    private int intToGuess;
    private int numOfGuesses;
    private Player player;

    public Game(Difficulty diff, Player player)
    {
        switch (diff){
            case EASY:
                numOfGuesses = 10;
                break;
            case MEDIUM:
                numOfGuesses = 5;
                break;
            case HARD:
                numOfGuesses = 3;
                break;
            //should handle NOT_INITIALISED case            
        }
        Random rand = new Random();
        intToGuess = rand.nextInt(100) + 1;
        this.player = player;
        guessNum = 0;
    }

    public int getGuessNum()
    {
        return guessNum;
    }

    public GuessResult makeGuess(int guess)
    {
        guessNum ++;
        if (guess == intToGuess)
        {
            player.setScore(getGuessNum());
            return GuessResult.SUCCESS;
        }
        else if (guessNum == numOfGuesses)
        {
            return GuessResult.OUT_OF_GUESSES;
        }
        else if (guess < intToGuess)
        {
            return GuessResult.LESS_THAN;
        } 
        else if (guess > intToGuess)
        {
            return GuessResult.GREATER_THAN;
        }
        return null;
    }
}
