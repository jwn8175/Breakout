package Breakout;

import java.awt.*;

public interface Brick {
	/**
	 * This method is called when the brick is hit by something.
	 *
	 * @return True if the brick is destroyed, false otherwise;
	 */
	public boolean hit();

	/**
	 * Returns the color of this brick.
	 *
	 * @return The color object of this brick.
	 */
	public Color getColor();

	/**
	 * Returns the remaining hit points of this brick.
	 *
	 * @return The current hit points of this brick.
	 */
	public int getHitPoints();
    public void draw(Graphics2D win);
}
