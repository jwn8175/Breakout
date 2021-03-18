package Breakout;

import java.awt.*;

public class WallBrick extends Rectangle implements Brick {
    private Color color = Color.GRAY;
    private static final int WIDTH = 75, HEIGHT = 35;

    @Override
    public Color getColor() {
        return color;
    }

    // Not used for a wall brick. Might be used later who knows.
    @Override
    public int getHitPoints() {
        return -1;
    }

    /**
     * This method is called when the brick is hit by something.
     * For a wall brick, the return value is always false since
     * since they cannot be destroyed.
     *
     * @return False, since a wall brick cannot be destroyed.;
     */
    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public void draw(Graphics2D win) {
        win.setColor(getColor());
        win.fill(this);
    }
}
