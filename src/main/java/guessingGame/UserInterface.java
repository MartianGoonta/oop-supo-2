package src.main.java.guessingGame;

import java.util.Scanner;

public class UserInterface {


    public int inputGuess()
    {
        Scanner guessScanner = new Scanner(System.in);
        System.out.println("input guess");
        int guess = guessScanner.nextInt();
        return guess;
    }

    public boolean evaluateGuess(GuessResult playerGuessResult)
    {
        if (playerGuessResult == GuessResult.SUCCESS)
        {
            System.out.println("you win!");
            return true;
        }
        else if (playerGuessResult == GuessResult.GREATER_THAN)
        {
            System.out.println("too high");
            return false;
        }
        else if (playerGuessResult == GuessResult.LESS_THAN)
        {
            System.out.println("too low");
            return false;
        }
        else
        {
            System.out.println("out of guesses, game over");
            return true;
        }
    }

    public String inputName()
    {
        System.out.println("please enter your name");
        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();
        return name;
    }

    public int endgame()
    {
        System.out.println("would you like to play again? 1:yes, 2:no");
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();
    }

    public int mainMenu()
    {
        System.out.println("1:new player, 2: leaderboard, 3: exit");
        Scanner inputScanner = new Scanner(System.in);
        int choice = inputScanner.nextInt();
        if (choice == 1)
        {
            return 1;
        }
        else if (choice == 2)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public Difficulty selectDifficulty()
    {
        Difficulty difficulty = Difficulty.NOT_INITIALISED;
        boolean selected = false;
        Scanner inputScanner = new Scanner(System.in);
        while (selected == false)
        {
            System.out.println("select difficulty: 1 for easy, 2 for difficult, 3 for hard");
            int result = inputScanner.nextInt();
            if (result == 1)
            {
                selected = true;
                difficulty = Difficulty.EASY;
            }
            else if (result==2)
            {
                selected = true;
                difficulty = Difficulty.MEDIUM;
            }
            else if (result == 3)
            {
                selected = true;
                difficulty = Difficulty.HARD;
            }

        }
        return difficulty;
    }

    public void outputLeaderboard(Leaderboard leaderboard)
    {
            for (int i = 0; i < leaderboard.getLeaderboard().size(); i++) 
            System.out.println(leaderboard.getLeaderboard().get(i).getName() + " " + leaderboard.getLeaderboard().get(i).getHighScore());        
        }
    }

