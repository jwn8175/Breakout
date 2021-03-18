package Breakout;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Utilities.GDV5;
import Utilities.SoundDriverHo;

public class Breakout extends GDV5 {

	private Brick brick;
	private WallBrick brick2;
	private Level board;
	private Ball ball;
	private Paddle paddle;

	public Breakout() {
		brick = new NormalBrick(50, 50);
		brick2 = new WallBrick(100, 100);
		board = new Level();
		ball = new Ball();
		paddle = new Paddle();
	}

	@Override
	public void update() {
		paddle.move();
	}

	@Override
	public void draw(Graphics2D win) {
		board.draw(win);
		ball.draw(win);
		paddle.draw(win);
		// TextScreens.drawTitle(win);
		// brick.draw(win);
		// brick2.draw(win);
	}
}
