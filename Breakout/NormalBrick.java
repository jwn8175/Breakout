package Breakout;

import java.awt.*;

public class NormalBrick extends Rectangle implements Brick {
    private Color color;
    private int hitPoints;
    private static final int WIDTH = 75, HEIGHT = 35;

    public NormalBrick(int x, int y, int hitPoints) {
        super(x, y, WIDTH, HEIGHT);
        this.hitPoints = hitPoints;
        color = Color.magenta;

    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int gitHitPoints() {
        return hitPoints;
    }

    @Override
    public void draw(Graphics2D win) {
        win.setColor(this.color);
        win.fill(this);
    }
}
