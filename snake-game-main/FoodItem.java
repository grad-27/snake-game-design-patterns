import java.awt.Color;
import java.awt.Point;

/**
 * Product interface of the Factory pattern: every food the game can
 * spawn is used through this type, never through a concrete class.
 */
public interface FoodItem {

    Point getPosition();

    FoodType getType();

    int getPoints();

    Color getColor();

    String getEmoji();

    String getDescription();

    /** @return true if eating this food triggers a special effect. */
    boolean hasEffect();

    /** @return true if this food is drawn with a glow around it. */
    boolean hasGlow();

    /** @return true if this food disappears after some time. */
    boolean isTimed();

    boolean isExpired();

    /** @return milliseconds left before expiry, or 0 if not timed. */
    long getRemainingTime();
}
