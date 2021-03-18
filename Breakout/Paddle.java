package Breakout;

import Utilities.GDV5;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
    private int dx;
    final int SPEED = 5;
    static final int WIDTH = 100, HEIGHT = 30;
    static final int START_X = 350, START_Y = 600;
    final Color FILL_COLOR = Color.BLUE;
    final Color OUTLINE_COLOR = Color.WHITE;

    public Paddle() {
        super(START_X, START_Y, WIDTH, HEIGHT);
    }

    public void move() {
        dx = 0;
        if (GDV5.KeysPressed[KeyEvent.VK_RIGHT]) dx = SPEED;
        if (GDV5.KeysPressed[KeyEvent.VK_LEFT]) dx = -SPEED;
        if (this.getMinX() < 0) this.x = 2;
        if (this.getMaxX() > 785) this.x = 684;

        this.translate(dx, 0);
    }

    public void draw(Graphics2D win) {
        win.setColor(FILL_COLOR);
        win.fill(this);
        win.setColor(OUTLINE_COLOR);
        win.draw(this);
    }
}
