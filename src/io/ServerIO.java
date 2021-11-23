package io;

import java.io.File;

public final class ServerIO
{
	public final static boolean isServer(final File f)
	{
		final File[] filesInServer = f.listFiles();

		for (final File file : filesInServer)
		{
			if (file.getName().toLowerCase().contains("spigot") || file.getName().toLowerCase().contains("paper")
					|| file.getName().toLowerCase().contains("vanilla"))
			{ return true; }
		}
		return false;
	}
}
