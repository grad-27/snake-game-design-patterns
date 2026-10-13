import java.awt.Color;
import java.awt.Point;

public class BonusFood extends Food {

    private static final long DURATION_MS = 5000;

    private final long spawnTime = System.currentTimeMillis();

    public BonusFood(Point position) {
        super(position);
    }

    @Override
    public FoodType getType() {
        return FoodType.BONUS;
    }

    @Override
    public int getPoints() {
        return 3;
    }

    @Override
    public Color getColor() {
        return new Color(138, 43, 226);
    }

    @Override
    public String getEmoji() {
        return "💎";
    }

    @Override
    public String getDescription() {
        return "Bonus Diamond - 3 Points!";
    }

    @Override
    public boolean isTimed() {
        return true;
    }

    @Override
    public boolean isExpired() {
        return getRemainingTime() == 0;
    }

    @Override
    public long getRemainingTime() {
        long elapsed = System.currentTimeMillis() - spawnTime;
        return Math.max(0, DURATION_MS - elapsed);
    }
}
