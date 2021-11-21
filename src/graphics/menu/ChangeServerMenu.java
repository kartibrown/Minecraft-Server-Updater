package graphics.menu;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public final class ChangeServerMenu extends AddServerMenu
{
	public ChangeServerMenu(final JFrame frame)
	{
		super(frame);

		super.browseButton.setEnabled(false);
		super.browseLabel.setEnabled(false);

		super.bukkitBox.setEnabled(false);
		super.paperBox.setEnabled(false);
		super.vanillaBox.setEnabled(false);

		super.nameField.setEnabled(false);
		super.passwordField.setEnabled(false);

		super.title.setText("Choose server");

		/*
		 * COMPONENT
		 */

		final JComboBox<String> chooseServer = new JComboBox<String>();
		chooseServer.setFont(font);
		chooseServer.setCursor(buttonCursor);

		chooseServer.addItem("There's no servers atm");
		chooseServer.setSelectedIndex(-1);

		gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 1;

		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(30, 7, 7, 7);

		super.nPanel.add(chooseServer, gbc);

		frame.setVisible(true);
	}

	@Override
	public final void actionPerformed(final ActionEvent e)
	{ super.actionPerformed(e); }
}
