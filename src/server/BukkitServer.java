package server;

public final class BukkitServer extends AbstractMinecraftServer
{
	public BukkitServer()
	{

	}

	@Override
	public final String getServerType()
	{ return "bukkit"; }

	@Override
	public final String getServerDir()
	{ return dir; }
}
