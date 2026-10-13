import java.awt.Color;
import java.awt.Point;

public class SpeedFood extends Food {

    public SpeedFood(Point position) {
        super(position);
    }

    @Override
    public FoodType getType() {
        return FoodType.SPEED;
    }

    @Override
    public int getPoints() {
        return 1;
    }

    @Override
    public Color getColor() {
        return new Color(0, 191, 255);
    }

    @Override
    public String getEmoji() {
        return "⚡";
    }

    @Override
    public String getDescription() {
        return "Speed Boost - Faster movement!";
    }

    @Override
    public boolean hasEffect() {
        return true;
    }
}
