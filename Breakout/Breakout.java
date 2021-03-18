package Breakout;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Utilities.GDV5;
import Utilities.SoundDriverHo;

public class Breakout extends GDV5 {

	private Brick brick;

	public Breakout() {
		brick = new NormalBrick(50, 50);
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics2D win) {
		// TextScreens.drawTitle(win);
		brick.draw(win);
	}
}




