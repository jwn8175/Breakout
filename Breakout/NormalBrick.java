package Breakout;

import java.awt.*;

public class NormalBrick implements Brick {
    private Color c;
    private int hitPoints;
    private int width, height;

    @Override
    public Color getColor() {
        return c;
    }

    @Override
    public int gitHitPoints() {
        return hitPoints;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void draw(Graphics2D win) {
        
    }
}
