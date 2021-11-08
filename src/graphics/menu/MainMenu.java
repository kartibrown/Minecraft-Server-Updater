package graphics.menu;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import graphics.MyMenu;

public class MainMenu extends MyMenu
{
	public MainMenu()
	{
		final JPanel titlePanel = new JPanel(new GridBagLayout());
		titlePanel.setOpaque(false);

		super.addToPanel(titlePanel, title());

		final JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);

		super.panel.add(titlePanel);
	}

	private final List<Object> title()
	{
		final JLabel title = new JLabel("Minecraft Server Updater");

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.insets = new Insets(20, 5, 5, 5);

		return Arrays.asList(title, gbc);
	}

	private final List<JButton> buttons()
	{

		return null;
	}
}
