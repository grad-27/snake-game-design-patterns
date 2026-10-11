import java.awt.Color;
import java.awt.Point;

public interface FoodItem {
    Point getPosition();

    Food.FoodType getType();

    int getPoints();

    Color getColor();

    String getEmoji();

    boolean isExpired();

    long getRemainingTime();

    boolean hasEffect();

    String getDescription();
}