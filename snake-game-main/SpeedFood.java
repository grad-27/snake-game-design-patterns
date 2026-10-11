import java.awt.Color;
import java.awt.Point;

public class SpeedFood extends Food implements FoodItem {

    public SpeedFood(Point position) {
        super(position, Food.FoodType.SPEED);
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
    public boolean hasEffect() {
        return true;
    }

    @Override
    public String getDescription() {
        return "Speed Boost - Faster movement!";
    }
}