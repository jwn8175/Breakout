package Breakout;

import java.awt.*;

public class Ball extends Rectangle {
    private int dx, dy;
    private static final int WIDTH = 20, HEIGHT = 20;
    private static final int START_X = 390, START_Y = 450;
    private final Color COLOR = Color.WHITE;

    public Ball() {
        super(START_X, START_Y, WIDTH, HEIGHT);
        dx = 0;
        dy = 0;
    }

    public void move() {
        this.translate(dx, dy);
    }

    public void setDx(int x) {
        dx = x;
    }

    public void setDy(int y) {
        dy = y;
    }

    public void draw(Graphics2D win) {
        win.setColor(COLOR);
        win.fill(this);
    }
}
