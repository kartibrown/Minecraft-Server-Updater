package graphics.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import graphics.MyMenu;
import graphics.MyWindow;

public class AddServerMenu extends MyMenu implements KeyListener
{
	private JTextField nameField;
	private JPasswordField passwordField;

	private JCheckBox paperBox, bukkitBox, vanillaBox;
	private JButton createButton, browseButton;

	private File importFile;

	public AddServerMenu(final JFrame frame)
	{
		super(frame);

		importFile = null;

		final JPanel nPanel = this.getNorthPanel();
		final JPanel ePanel = this.getEastPanel();
		final JPanel wPanel = this.getWestPanel();
		final JPanel sPanel = this.getSouthPanel();

		panel.add(nPanel, BorderLayout.NORTH);
		panel.add(ePanel, BorderLayout.EAST);
		panel.add(wPanel, BorderLayout.WEST);
		panel.add(sPanel, BorderLayout.SOUTH);

		frame.add(panel);
		frame.setVisible(true);

		/*
		 * LISTENERS
		 */
	}

	private final JPanel getNorthPanel()
	{
		/*
		 * NORTH PANEL
		 */

		final JPanel nPanel = new JPanel(new GridBagLayout());
		nPanel.setOpaque(false);

		// TITLE

		final JLabel title = new JLabel("Add A Server");
		title.setForeground(Color.LIGHT_GRAY);
		title.setFont(font);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.anchor = GridBagConstraints.PAGE_START;

		gbc.insets = new Insets(7, 7, 7, 7);

		nPanel.add(title, gbc);

		return nPanel;
	}

	private final JPanel getWestPanel()
	{

		/*
		 * WEST PANEL
		 */

		final JPanel wPanel = new JPanel(new GridBagLayout());
		wPanel.setOpaque(false);

		// LABEL FOR BROWSE

		final JLabel browseLabel = new JLabel("Add existing server:");
		browseLabel.setFont(font);
		browseLabel.setForeground(Color.LIGHT_GRAY);
		browseLabel.setLabelFor(browseButton);

		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.gridheight = 1;

		gbc.anchor = GridBagConstraints.PAGE_START;

		gbc.insets = new Insets(7, 40, 7, 7);

		wPanel.add(browseLabel, gbc);

		// BROWSE BUTTON

		browseButton = new JButton("Browse");
		browseButton.setFont(font);
		browseButton.setCursor(buttonCursor);
		browseButton.addActionListener(this);

		gbc.gridx = 1;
		gbc.gridy = 0;

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;

		gbc.insets = new Insets(7, 7, 40, 7);

		wPanel.add(browseButton, gbc);

		// NAME LABEL

		final JLabel nameLabel = new JLabel("ServerName:");
		nameLabel.setForeground(Color.LIGHT_GRAY);
		nameLabel.setFont(font);
		nameLabel.setLabelFor(nameField);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.gridheight = 1;

		gbc.anchor = GridBagConstraints.PAGE_END;
		gbc.insets = new Insets(7, 40, 7, 7);

		wPanel.add(nameLabel, gbc);

		// NAME FIELD

		nameField = new JTextField(10);
		nameField.setFont(font);
		nameField.setCursor(textCursor);
		nameField.addKeyListener(this);

		gbc.gridx = 1;
		gbc.gridy = 3;

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;

		gbc.insets = new Insets(7, 7, 7, 7);

		wPanel.add(nameField, gbc);

		// PASSWORD LABEL

		final JLabel passwordLabel = new JLabel("ServerPassword:");
		passwordLabel.setForeground(Color.LIGHT_GRAY);
		passwordLabel.setFont(font);
		passwordLabel.setLabelFor(passwordLabel);

		gbc.gridx = 0;
		gbc.gridy = 4;

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbc.gridheight = 1;

		gbc.insets = new Insets(7, 40, 7, 7);

		wPanel.add(passwordLabel, gbc);

		// PASSWORD FIELD

		passwordField = new JPasswordField(10);
		passwordField.setFont(font);
		passwordField.setCursor(textCursor);

		gbc.gridx = 1;
		gbc.gridy = 4;

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;

		gbc.insets = new Insets(7, 7, 7, 7);

		wPanel.add(passwordField, gbc);

		// PAPER CHECKBOX

		return wPanel;
	}

	private final JPanel getEastPanel()
	{
		/*
		 * EAST PANEL
		 */

		final JPanel ePanel = new JPanel(new GridBagLayout());
		ePanel.setOpaque(false);

		// PAPER CHECKBOX

		paperBox = new JCheckBox("Paper", true);
		paperBox.setFont(font);
		paperBox.setCursor(buttonCursor);
		paperBox.setOpaque(false);
		paperBox.setForeground(Color.LIGHT_GRAY);
		paperBox.addActionListener(this);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		ePanel.add(paperBox, gbc);

		// BUKKIT CHECKBOX

		bukkitBox = new JCheckBox("Bukkit");
		bukkitBox.setFont(font);
		bukkitBox.setCursor(buttonCursor);
		bukkitBox.setOpaque(false);
		bukkitBox.setForeground(Color.LIGHT_GRAY);
		bukkitBox.addActionListener(this);

		gbc.gridx = 1;
		gbc.gridy = 0;

		ePanel.add(bukkitBox, gbc);

		// VANILLA CHECKBOX

		vanillaBox = new JCheckBox("Vanilla");
		vanillaBox.setFont(font);
		vanillaBox.setCursor(buttonCursor);
		vanillaBox.setOpaque(false);
		vanillaBox.setForeground(Color.LIGHT_GRAY);
		vanillaBox.addActionListener(this);

		gbc.gridx = 2;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 20);

		ePanel.add(vanillaBox, gbc);

		return ePanel;
	}

	private final JPanel getSouthPanel()
	{
		/*
		 * SOUTH PANEL
		 */

		final JPanel sPanel = new JPanel(new GridBagLayout());
		sPanel.setOpaque(false);

		// BACK BUTTON

		final JButton backButton = new JButton("Back");
		backButton.setFont(font);
		backButton.setCursor(buttonCursor);
		backButton.addActionListener(this);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(7, 7, 7, 7);

		sPanel.add(backButton, gbc);

		// CREATE BUTTON

		createButton = new JButton("Create");
		createButton.setEnabled(false);
		createButton.setFont(font);
		createButton.setCursor(buttonCursor);
		createButton.addActionListener(this);

		gbc.gridx = 1;
		gbc.gridy = 0;

		sPanel.add(createButton, gbc);

		return sPanel;
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

		/*
		 * BROWSE BUTTON
		 */

		else if (e.getActionCommand().equals("Browse"))
		{
			final JFileChooser fc = new JFileChooser();
			fc.setFont(font);
			fc.setAcceptAllFileFilterUsed(false);
			fc.setDialogTitle("Import server");
			fc.setDialogType(JFileChooser.OPEN_DIALOG);
			fc.setDragEnabled(false);
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			fc.setPreferredSize(new Dimension(600, 500));

			fc.setVisible(true);

			final int result = fc.showOpenDialog(frame);

			if (result == JFileChooser.APPROVE_OPTION)
			{
				importFile = fc.getSelectedFile();
			}
		}

		/*
		 * CHECK BOXES
		 */

		else if (e.getActionCommand().equals("Paper"))
		{
			paperBox.setSelected(true);
			bukkitBox.setSelected(false);
			vanillaBox.setSelected(false);
		}
		else if (e.getActionCommand().equals("Bukkit"))
		{
			paperBox.setSelected(false);
			bukkitBox.setSelected(true);
			vanillaBox.setSelected(false);
		}
		else if (e.getActionCommand().equals("Vanilla"))
		{
			paperBox.setSelected(false);
			bukkitBox.setSelected(false);
			vanillaBox.setSelected(true);
		}

		/*
		 * JFileChooser
		 */

	}

	/**
	 * TEST IF THIS WORK, SHOULD RETURN THE SERVER TYPE THAT THE SERVER HAS
	 * 
	 * @param importedFile
	 */
	public final static String getDetailsFromImportedFile(final File importedFile)
	{
		final String[] names = importedFile.list();

		boolean vanilla = false, bukkit = false, paper = false;

		for (final String name : names)
		{
			if (name.toLowerCase().contains("vanilla"))
			{
				vanilla = true;
			}
			else if (name.toLowerCase().contains("bukkit"))
			{
				bukkit = true;
			}
			else if (name.toLowerCase().contains("paper"))
			{
				paper = true;
				break;
			}
		}

		return paper ? "paper"
				: bukkit ? "bukkit" : vanilla ? "vanilla" : null;
	}

	@Override
	public final void keyTyped(final KeyEvent e)
	{}	

	@Override
	public final void keyPressed(final KeyEvent e)
	{}

	@Override
	public final void keyReleased(final KeyEvent e)
	{ createButton.setEnabled(!nameField.getText().isBlank()); }

}
