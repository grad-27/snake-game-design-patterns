import java.awt.Color;
import java.awt.Point;

public class NormalFood extends Food {

    public NormalFood(Point position) {
        super(position);
    }

    @Override
    public FoodType getType() {
        return FoodType.NORMAL;
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

    @Override
    public boolean hasGlow() {
        return false;
    }
}
