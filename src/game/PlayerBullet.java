package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayerBullet {
	Image image = new ImageIcon("images/bullet01.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int power = 10;
	public int speedY = 15;
	public PlayerBullet(int x,int y, int power) {
		this.x = x;
		this.y = y;
		this.power = power;
	}
	public void shoot() {
		y -=speedY;
	}
}
