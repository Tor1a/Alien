package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class UFO {
	Image image = new ImageIcon("images/ufo.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height  = image.getHeight(null);
	public int speedX = 10;
	public int speedY = 10;
	public int hp = 20;
	
	public UFO(int x,int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	public void moveY() {
		y +=speedY;
	}
}
