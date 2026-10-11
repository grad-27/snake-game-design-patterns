import java.awt.Point;

public class FoodFactory {

    public FoodItem getFood(Food.FoodType type, Point position) {
        if (type == null) {
            throw new IllegalArgumentException(
                "Food type must not be null"
            );
        }

        switch (type) {
            case NORMAL:
                return new NormalFood(position);

            case GOLDEN:
                return new GoldenFood(position);

            case BONUS:
                return new BonusFood(position);

            case SPEED:
                return new SpeedFood(position);

            default:
                throw new IllegalArgumentException(
                    "Unsupported food type: " + type
                );
        }
    }
}