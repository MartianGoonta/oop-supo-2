package src.main.java.guessingGame;

import java.util.Scanner;

enum Difficulty {
    EASY,
    MEDIUM,
    HARD,
    NOT_INITIALISED;

    public Difficulty selectDifficulty()
    {
        boolean selected = false;
        Difficulty difficulty = NOT_INITIALISED;
        Scanner inputScanner = new Scanner(System.in);
        while (selected == false)
        {
            System.out.println("select difficulty: 1 for easy, 2 for difficult, 3 for hard");
            int result = inputScanner.nextInt();
            if (result == 1)
            {
                selected = true;
                difficulty = EASY;
            }
            else if (result==2)
            {
                selected = true;
                difficulty = MEDIUM;
            }
            else if (result == 3)
            {
                selected = true;
                difficulty = HARD;
            }
            //probably handle NOT_INITIALISED

        }
        return difficulty;
    }
}
