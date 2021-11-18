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
import javax.swing.JTextField;

import graphics.MyMenu;
import graphics.MyWindow;

public class AddServerMenu extends MyMenu
{
	public AddServerMenu(final JFrame frame)
	{
		super(frame);

		/*
		 * NAME LABEL
		 */

		final JPanel wPanel = new JPanel(new GridBagLayout());
		wPanel.setOpaque(false);

		final JLabel nameLabel = new JLabel("ServerName:");
		nameLabel.setForeground(Color.LIGHT_GRAY);
		nameLabel.setFont(font);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(5, 40, 5, 5);

		wPanel.add(nameLabel, gbc);

		/*
		 * NAME FIELD
		 */

		final JTextField nameField = new JTextField(10);
		nameField.setForeground(Color.LIGHT_GRAY);
		nameField.setFont(font);
		nameField.setCursor(textCursor);

		gbc.gridx = 1;
		gbc.gridy = 0;

		gbc.insets = new Insets(5, 5, 5, 5);

		wPanel.add(nameField, gbc);

		/*
		 * BUTTONS
		 */

		final JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.setOpaque(false);

		final JButton backButton = new JButton("Back");
		backButton.setFont(font);
		backButton.setCursor(buttonCursor);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(5, 5, 20, 5);

		buttonPanel.add(backButton, gbc);

		/*
		 * ACTION
		 */

		backButton.addActionListener(this);

		/*
		 * MAIN PANEL
		 */

		panel.add(wPanel, BorderLayout.WEST);
		panel.add(buttonPanel, BorderLayout.SOUTH);

		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public final void actionPerformed(final ActionEvent e)
	{
		if (e.getActionCommand().equals("Back"))
		{
			clearWindow();

			MyWindow.mainMenu();
		}
	}
}
