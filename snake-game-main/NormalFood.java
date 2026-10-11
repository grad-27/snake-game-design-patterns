import java.awt.Color;
import java.awt.Point;

public class NormalFood extends Food implements FoodItem {

    public NormalFood(Point position) {
        super(position, Food.FoodType.NORMAL);
    }

    @Override
    public int getPoints() {
        return 1;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String getEmoji() {
        return "🍎";
    }

    @Override
    public String getDescription() {
        return "Apple - 1 Point";
    }
}