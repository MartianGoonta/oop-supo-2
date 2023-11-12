package src.main.java.guessingGame;

import java.util.ArrayList;

public class Leaderboard {
    private ArrayList<Player> leaderboard = new ArrayList<Player>();

    public void addScore(Player player)
    {
        leaderboard.add(player);
    }

    public ArrayList<Player> getLeaderboard()
    {
        return leaderboard;
    }

}
