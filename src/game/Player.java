package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	public Image image = new ImageIcon("Images/space-ship.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getHeight(null);
	public int speedX = 10;
	public int speedY = 10;
	public int hp = 100;
	public Player(int x,int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
}
