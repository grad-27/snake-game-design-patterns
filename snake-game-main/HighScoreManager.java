import java.io.*;
import java.nio.file.*;

/**
 * Manages high score persistence
 */
public class HighScoreManager {

    // Singleton (1): static variable that holds the one and only instance.
    // It is static so it belongs to the class itself, not to any object.
    // It starts as null because the instance is not created yet (lazy initialization).
    private static HighScoreManager instance = null;

    private static final String HIGH_SCORE_FILE = "highscore.dat";
    private int highScore;

    // Singleton (2): PRIVATE constructor.
    // No other class can write "new HighScoreManager()" anymore.
    // Only this class itself can create the object.
    private HighScoreManager() {
        loadHighScore();
    }

    // Singleton (3): public static method - the ONLY way to get the instance.
    // First call: instance is null, so the object is created.
    // Every call after that: the SAME object is returned.
    public static HighScoreManager getInstance() {
        if (instance == null) {
            instance = new HighScoreManager();
        }
        return instance;
    }

    /**
     * Load high score from file
     */
    private void loadHighScore() {
        try {
            Path path = Paths.get(HIGH_SCORE_FILE);
            if (Files.exists(path)) {
                String content = Files.readString(path);
                highScore = Integer.parseInt(content.trim());
            } else {
                highScore = 0;
            }
        } catch (IOException | NumberFormatException e) {
            highScore = 0;
        }
    }

    /**
     * Save high score to file
     */
    private void saveHighScore() {
        try {
            Files.writeString(Paths.get(HIGH_SCORE_FILE), String.valueOf(highScore));
        } catch (IOException e) {
            System.err.println("Failed to save high score: " + e.getMessage());
        }
    }

    /**
     * Get current high score
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     * Update high score if new score is higher
     * @return true if new high score was set
     */
    public boolean updateHighScore(int newScore) {
        if (newScore > highScore) {
            highScore = newScore;
            saveHighScore();
            return true;
        }
        return false;
    }

    /**
     * Reset high score
     */
    public void resetHighScore() {
        highScore = 0;
        saveHighScore();
    }
}