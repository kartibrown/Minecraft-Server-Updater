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

public final class MainMenu extends MyMenu
{
	public MainMenu(final JFrame frame)
	{
		super(frame);

		final JPanel nPanel = this.getNorthPanel();
		final JPanel cPanel = this.getCenterPanel();

		panel.add(nPanel, BorderLayout.NORTH);
		panel.add(cPanel, BorderLayout.CENTER);

		frame.add(panel);
		frame.setVisible(true);
	}

	private final JPanel getNorthPanel()
	{
		/*
		 * NORTH PANEL
		 */

		final JPanel nPanel = new JPanel(new GridBagLayout());
		nPanel.setOpaque(false);

		// TITLE LABEL

		final JLabel title = new JLabel("Minecraft Server Updater");
		title.setForeground(Color.LIGHT_GRAY);
		title.setFont(font.deriveFont(25f));

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(20, 7, 7, 7);
		nPanel.add(title, gbc);

		return nPanel;
	}

	private final JPanel getCenterPanel()
	{
		/*
		 * CENTER PANEL
		 */

		final JPanel cPanel = new JPanel(new GridBagLayout());
		cPanel.setOpaque(false);

		// ADD SERVER BUTTON

		final JButton addServerButton = new JButton("Add a server");
		addServerButton.setFont(font);
		addServerButton.setCursor(buttonCursor);
		addServerButton.addActionListener(this);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		cPanel.add(addServerButton, gbc);

		// CHANGE SERVER BUTTON

		final JButton changeServerButton = new JButton("Change a server");
		changeServerButton.setFont(font);
		changeServerButton.setCursor(buttonCursor);
		changeServerButton.addActionListener(this);

		gbc.gridx = 0;
		gbc.gridy = 1;

		cPanel.add(changeServerButton, gbc);

		return cPanel;
	}

	@Override
	public final void actionPerformed(final ActionEvent e)
	{
		if (e.getActionCommand().equals("Add a server"))
		{
			clearWindow();

			MyWindow.AddServerMenu();
		}
		else if (e.getActionCommand().equals("Change a server"))
		{
			clearWindow();
			
			MyWindow.changeServerMenu();
		}
	}
}
