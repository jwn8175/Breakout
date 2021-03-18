package Breakout;

import java.awt.*;

public interface Brick {
	public Color getColor();
	public int gitHitPoints();
	public int getWidth();
	public int getHeight();
    public void draw(Graphics2D win);
}
