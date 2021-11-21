package server;

public final class PaperServer extends AbstractMinecraftServer
{
	public PaperServer()
	{

	}

	@Override
	public final String getServerType()
	{ return "paper"; }

	@Override
	public final String getServerDir()
	{ return dir; }
}
