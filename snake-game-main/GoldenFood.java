import java.awt.Color;
import java.awt.Point;

public class GoldenFood extends Food {

    public GoldenFood(Point position) {
        super(position);
    }

    @Override
    public FoodType getType() {
        return FoodType.GOLDEN;
    }

    @Override
    public int getPoints() {
        return 5;
    }

    @Override
    public Color getColor() {
        return new Color(255, 215, 0);
    }

    @Override
    public String getEmoji() {
        return "⭐";
    }

    @Override
    public String getDescription() {
        return "Golden Apple - 5 Points!";
    }
}
