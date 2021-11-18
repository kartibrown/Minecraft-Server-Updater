package server;

abstract class AbstractMinecraftServer implements MinecraftServer
{
	protected String dir;

	protected AbstractMinecraftServer()
	{
		dir = "";

	}

	@Override
	public final String toString()
	{ return null; }
}
