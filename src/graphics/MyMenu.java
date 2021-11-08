package graphics;

import java.util.List;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

public class MyMenu
{
	protected GridBagConstraints gbc;
	protected final JPanel panel;

	protected MyMenu()
	{
		panel = new JPanel(new BorderLayout());

		panel.setBackground(Color.DARK_GRAY);
	}

	protected void addToPanel(final JPanel panel, final List<Object> list)
	{
		for (int i = 0; i < list.size() - 1; i++)
		{
			// NOPE
		}
	}

	/*
	 * GETTERS & SETTERS
	 */

	public final JPanel getPanel()
	{ return panel; }
}
