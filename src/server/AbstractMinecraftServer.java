package server;

abstract class AbstractMinecraftServer implements MinecraftServer
{
	protected String dir;

	protected AbstractMinecraftServer()
	{ dir = ""; }

	protected AbstractMinecraftServer(final String toString)
	{
		dir = "";
	}

	@Override
	public final String toString()
	{ return this.getClass().getSimpleName() + ": "; }

}
