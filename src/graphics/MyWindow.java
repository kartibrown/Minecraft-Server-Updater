package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MyWindow
{
	private final JFrame frame;

	public MyWindow()
	{
		frame = new JFrame("Minecraft Server Updater");

		frame.setAlwaysOnTop(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.pack();

		frame.setLocationRelativeTo(null);
	}

	public void setMenu(final MyMenu menu)
	{
		frame.add(menu.getPanel());
		frame.setVisible(true);
	}

	/*
	 * GETTERS & SETTERS
	 */

	public final JFrame getFrame()
	{ return frame; }
}
