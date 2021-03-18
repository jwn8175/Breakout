package Breakout;

import java.awt.*;

public class NormalBrick extends Rectangle implements Brick {
    private Color color;
    // Each normal brick only has 3 hit points.
    private int hitPoints = 3;

    /**
     * Initializes a normal brick with width of 75px and height of 35px.
     *
     * @param x The x-coordinate of this brick.
     * @param y The y-coordinate of this brick.
     */
    public NormalBrick(int x, int y) {
        super(x, y, Brick.WIDTH, Brick.HEIGHT);
        color = Color.magenta;
    }

    /**
     * This method is called when the brick is hit by something.
     * The brick loses one hit point and changes color. If the
     * brick's hit point reaches zero, it is destroyed.
     *
     * @return True if the brick is destroyed, false otherwise;
     */
    @Override
    public boolean hit() {
        hitPoints -= 1;
        if (getHitPoints() <= 0) {
            this.setSize(0 ,0);
            return true;
        } else if (getHitPoints() == 2) {
            color = Color.RED;
        } else {
            color = Color.YELLOW;
        }
        return false;
    }

    /**
     * Returns the color of this brick.
     *
     * @return The color object of this brick.
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Returns the remaining hit points of this brick.
     *
     * @return The current hit points of this brick.
     */
    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void draw(Graphics2D win) {
        win.setColor(getColor());
        win.fill(this);
    }
}