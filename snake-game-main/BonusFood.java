import java.awt.Color;
import java.awt.Point;

public class BonusFood extends Food implements FoodItem {

    public BonusFood(Point position) {
        super(position, Food.FoodType.BONUS);
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
}