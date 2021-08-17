package game;

import java.awt.Container;

import javax.swing.JFrame;

public class ShootingGame extends JFrame{
	public ShootingGame() {
		this.setTitle("Shooting Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		GamePanel gamePanel = new GamePanel();
		Container contentPane = this.getContentPane();
		contentPane.add(gamePanel);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ShootingGame();
	}
}
