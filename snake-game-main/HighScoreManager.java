import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Singleton that loads and saves the high score.
 * One instance is required because all code must share the same score
 * and the same file.
 */
public class HighScoreManager {

    private static final String HIGH_SCORE_FILE = "highscore.dat";

    private static HighScoreManager instance = null;

    private int highScore;

    private HighScoreManager() {
        loadHighScore();
    }

    /** Lazy, thread-safe access to the single instance. */
    public static synchronized HighScoreManager getInstance() {
        if (instance == null) {
            instance = new HighScoreManager();
        }
        return instance;
    }

    private void loadHighScore() {
        Path path = Paths.get(HIGH_SCORE_FILE);
        try {
            if (Files.exists(path)) {
                highScore = Integer.parseInt(Files.readString(path).trim());
            }
        } catch (IOException | NumberFormatException e) {
            highScore = 0;
        }
    }

    private void saveHighScore() {
        try {
            Files.writeString(Paths.get(HIGH_SCORE_FILE), String.valueOf(highScore));
        } catch (IOException e) {
            System.err.println("Failed to save high score: " + e.getMessage());
        }
    }

    public int getHighScore() {
        return highScore;
    }

    /**
     * @return true if newScore beat the stored high score (and was saved)
     */
    public boolean updateHighScore(int newScore) {
        if (newScore <= highScore) {
            return false;
        }
        highScore = newScore;
        saveHighScore();
        return true;
    }
}
