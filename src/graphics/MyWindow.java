package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

import graphics.menu.*;

public final class MyWindow
{
	private final static JFrame frame = new JFrame("Minecraft Server Updater");

	public MyWindow()
	{
		frame.setResizable(true);
		frame.setAlwaysOnTop(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.pack();

		frame.setLocationRelativeTo(null);
		
		mainMenu();
	}

	/*
	 * MENUS
	 */

	public final static void mainMenu()
	{ new MainMenu(frame); }

	public final static void AddServerMenu()
	{ new AddServerMenu(frame); }

	public final static void changeServerMenu()
	{ 
		new ChangeServerMenu(frame);
	 }
}
