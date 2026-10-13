import java.awt.Point;

/**
 * Base class for all foods. Holds what every food shares (its position)
 * and sensible defaults; each concrete food defines its own values.
 */
public abstract class Food implements FoodItem {

    private final Point position;

    protected Food(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public boolean hasEffect() {
        return false;
    }

    @Override
    public boolean hasGlow() {
        return true;
    }

    @Override
    public boolean isTimed() {
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public long getRemainingTime() {
        return 0;
    }
}
