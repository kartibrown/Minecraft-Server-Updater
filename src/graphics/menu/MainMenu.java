package graphics.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import graphics.MyMenu;
import graphics.MyWindow;

public class MainMenu extends MyMenu
{
	public MainMenu(final JFrame frame)
	{
		super(frame);

		/*
		 * TITLE
		 */

		final JPanel titlePanel = new JPanel(new GridBagLayout());
		titlePanel.setOpaque(false);

		final JLabel title = new JLabel("Minecraft Server Updater");
		title.setForeground(Color.LIGHT_GRAY);
		title.setFont(font.deriveFont(25f));

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(20, 5, 5, 5);
		titlePanel.add(title, gbc);

		/*
		 * BUTTONS
		 */

		final JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.setOpaque(false);

		final JButton addServerButton = new JButton("Add a server");
		addServerButton.setFont(font);
		addServerButton.setCursor(buttonCursor);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(5, 5, 5, 5);

		buttonPanel.add(addServerButton, gbc);

		/*
		 * ACTION
		 */

		addServerButton.addActionListener(this);

		/*
		 * MAIN PANEL
		 */

		panel.add(titlePanel, BorderLayout.NORTH);
		panel.add(buttonPanel, BorderLayout.CENTER);

		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public final void actionPerformed(final ActionEvent e)
	{
		if (e.getActionCommand().equals("Add a server"))
		{
			clearWindow();

			MyWindow.AddServerMenu();
		}
	}
}
