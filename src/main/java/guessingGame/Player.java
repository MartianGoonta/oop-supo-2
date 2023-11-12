package src.main.java.guessingGame;

public class Player {
    private String playerName;
    private int highScore;
    
    public Player(String name)
    {
        playerName = name;
        highScore = 100;
    }
    public void setScore(int score)
    {
        if (score < highScore)
        {
        this.highScore = score;
        }
    }

    public int getHighScore()
    {
        return highScore;
    }
}
