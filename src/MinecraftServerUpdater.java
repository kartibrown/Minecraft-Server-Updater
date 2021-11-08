import graphics.MyWindow;
import graphics.menu.MainMenu;

public class MinecraftServerUpdater
{
	public final static void main(final String[] args)
	{
		final MyWindow window = new MyWindow();
		window.setMenu(new MainMenu());
	}
}
