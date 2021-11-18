package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class MyMenu implements ActionListener
{
	protected GridBagConstraints gbc;

	protected final JFrame frame;
	protected final JPanel panel;

	protected final Font font;

	protected final Cursor buttonCursor, textCursor;

	protected MyMenu(final JFrame frame)
	{
		this.frame = frame;

		font = new Font(Font.DIALOG, Font.BOLD, 20);

		buttonCursor = new Cursor(Cursor.HAND_CURSOR);
		textCursor = new Cursor(Cursor.TEXT_CURSOR);

		panel = new JPanel(new BorderLayout());

		panel.setBackground(Color.DARK_GRAY);
	}

	protected final void clearWindow()
	{
		frame.remove(panel);

		panel.removeAll();
		panel.revalidate();
	}

	/*
	 * GETTERS & SETTERS
	 */

	public final JPanel getPanel()
	{ return panel; }
}
