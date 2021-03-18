package Breakout;

import java.awt.*;
import java.util.ArrayList;

public class Level {
    private ArrayList<WallBrick> walls = new ArrayList<>(30);
    private ArrayList<NormalBrick> normals = new ArrayList<>();

    public Level() {
        generateLevelOne();
    }

    /**
     * Populates normals and walls with bricks for level one.
     */
    private void generateLevelOne() {
        clear();
        for (int i = 0; i < 8; i ++) {
            normals.add(new NormalBrick(75 + i * (Brick.WIDTH + Brick.BUFFER), 50));
        }
    }

    /**
     * Empties all of the existing normal and wall bricks.
     */
    public void clear() {
        walls.clear();
        normals.clear();
    }

    public void draw(Graphics2D win) {
        for (Brick b : normals) {
            b.draw(win);
        }
    }
}
