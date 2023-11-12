package src.main.java.guessingGame;

public class GameManager {
    public static void main(String[] args)
    {

        boolean exit = false;
        UserInterface userInterface = new UserInterface();
        while (exit == false)
        {
            int action = userInterface.mainMenu();
            if (action == 1)
            {
                String name = userInterface.inputName();
                Player player = new Player(name);
                boolean newGame = true;
                while (newGame == true)
                {
                    Difficulty selectedDifficulty = Difficulty.NOT_INITIALISED;
                    selectedDifficulty = selectedDifficulty.selectDifficulty();
                    Game game = new Game(selectedDifficulty,player);
                    boolean game_ended = false;
                    while (game_ended == false)
                    {
                        game_ended = userInterface.evaluateGuess(game.makeGuess(userInterface.inputGuess()));
                    }
                    if (userInterface.endgame() == 2)
                    {
                        newGame = false;
                    }
                }
            }
            else if (action == 2)
            {
                //leaderboard
            }
            else
            {
                exit = true;
            }
        }
    }
}
