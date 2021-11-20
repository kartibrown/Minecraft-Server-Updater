package graphics.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

		gbc.insets = new Insets(7, 40, 7, 7);

		wPanel.add(nameLabel, gbc);

		/*
		 * NAME FIELD
		 */

		final JTextField nameField = new JTextField(10);
		nameField.setFont(font);
		nameField.setCursor(textCursor);

		gbc.gridx = 1;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		wPanel.add(nameField, gbc);

		/*
		 * PASSWORD LABEL
		 */

		final JLabel passwordLabel = new JLabel("ServerPassword:");
		passwordLabel.setForeground(Color.LIGHT_GRAY);
		passwordLabel.setFont(font);

		gbc.gridx = 0;
		gbc.gridy = 1;

		gbc.insets = new Insets(7, 40, 7, 7);

		wPanel.add(passwordLabel, gbc);

		/*
		 * PASSWORD FIELD
		 */

		final JPasswordField passwordField = new JPasswordField(10);
		passwordField.setFont(font);
		passwordField.setCursor(textCursor);

		gbc.gridx = 1;
		gbc.gridy = 1;

		gbc.insets = new Insets(7, 7, 7, 7);

		wPanel.add(passwordField, gbc);

		/*
		 * PAPER CHECKBOX
		 */

		final JPanel ePanel = new JPanel(new GridBagLayout());
		ePanel.setOpaque(false);

		final JCheckBox paperBox = new JCheckBox("Paper", true);
		paperBox.setFont(font);
		paperBox.setCursor(buttonCursor);
		paperBox.setOpaque(false);
		paperBox.setForeground(Color.LIGHT_GRAY);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		ePanel.add(paperBox, gbc);

		/*
		 * BUKKIT CHECKBOX
		 */

		final JCheckBox bukkitBox = new JCheckBox("Bukkit");
		bukkitBox.setFont(font);
		bukkitBox.setCursor(buttonCursor);
		bukkitBox.setOpaque(false);
		bukkitBox.setForeground(Color.LIGHT_GRAY);

		gbc.gridx = 1;
		gbc.gridy = 0;

		ePanel.add(bukkitBox, gbc);

		/*
		 * VANILLA CHECKBOX
		 */

		final JCheckBox vanillaBox = new JCheckBox("Vanilla");
		vanillaBox.setFont(font);
		vanillaBox.setCursor(buttonCursor);
		vanillaBox.setOpaque(false);
		vanillaBox.setForeground(Color.LIGHT_GRAY);

		gbc.gridx = 2;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 20);

		ePanel.add(vanillaBox, gbc);

		/*
		 * BACK BUTTON
		 */

		final JPanel sPanel = new JPanel(new GridBagLayout());
		sPanel.setOpaque(false);

		final JButton backButton = new JButton("Back");
		backButton.setFont(font);
		backButton.setCursor(buttonCursor);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		sPanel.add(backButton, gbc);

		/*
		 * CREATE BUTTON
		 */

		final JButton createButton = new JButton("Create");
		createButton.setEnabled(false);
		createButton.setFont(font);
		createButton.setCursor(buttonCursor);

		gbc.gridx = 1;
		gbc.gridy = 0;

		sPanel.add(createButton, gbc);

		/*
		 * MAIN PANEL
		 */

		panel.add(ePanel, BorderLayout.EAST);
		panel.add(wPanel, BorderLayout.WEST);
		panel.add(sPanel, BorderLayout.SOUTH);

		frame.add(panel);
		frame.setVisible(true);

		/*
		 * LISTENERS
		 */

		backButton.addActionListener(this);
		createButton.addActionListener(this);

		nameField.addKeyListener(new KeyListener()
		{
			@Override
			public final void keyTyped(final KeyEvent e)
			{}

			@Override
			public final void keyPressed(final KeyEvent e)
			{}

			@Override
			public final void keyReleased(final KeyEvent e)
			{ createButton.setEnabled(!nameField.getText().isBlank()); }
		});
	}

	@Override
	public final void actionPerformed(final ActionEvent e)
	{
		if (e.getActionCommand().equals("Back"))
		{
			clearWindow();

			MyWindow.mainMenu();
		}
		else if (e.getActionCommand().equals("Create"))
		{
			JOptionPane.showMessageDialog(
					frame, "Server was not created!\nThis is just a test"
			);
		}
	}
}
