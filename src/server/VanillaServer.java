package server;

public class VanillaServer extends AbstractMinecraftServer
{
	public VanillaServer()
	{

	}

	@Override
	public final String getServerType()
	{ return "bukkit"; }

	@Override
	public final String getServerDir()
	{ return dir; }
}
