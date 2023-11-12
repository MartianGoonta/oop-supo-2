package src.main.java.guessingGame;

public class GameManager {
    public static void main(String[] args)
    {

        boolean exit = false;
        UserInterface userInterface = new UserInterface();
        Leaderboard leaderboard = new Leaderboard();
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
                    Difficulty selectedDifficulty = userInterface.selectDifficulty();
                    Game game = new Game(selectedDifficulty,player);
                    boolean game_ended = false;
                    while (game_ended == false)
                    {
                        game_ended = userInterface.evaluateGuess(game.makeGuess(userInterface.inputGuess()));
                    }
                    leaderboard.addScore(player);
                    if (userInterface.endgame() == 2)
                    {
                        newGame = false;
                    }
                }
            }
            else if (action == 2)
            {
                userInterface.outputLeaderboard(leaderboard);
            }
            else
            {
                exit = true;
            }
        }
    }
}
