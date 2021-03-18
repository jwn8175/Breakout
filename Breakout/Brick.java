package Breakout;

import java.awt.*;

public interface Brick {
	int WIDTH = 75, HEIGHT = 35, BUFFER = 5;

	/**
	 * This method is called when the brick is hit by something.
	 *
	 * @return True if the brick is destroyed, false otherwise;
	 */
	boolean hit();

	/**
	 * Returns the color of this brick.
	 *
	 * @return The color object of this brick.
	 */
	Color getColor();

	/**
	 * Returns the remaining hit points of this brick.
	 *
	 * @return The current hit points of this brick.
	 */
	int getHitPoints();
	void draw(Graphics2D win);
}
