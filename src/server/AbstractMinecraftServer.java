package server;

abstract class AbstractMinecraftServer implements MinecraftServer
{
	protected String dir, name, password, version;
	protected int ram;

	protected AbstractMinecraftServer()
	{ dir = ""; }

	protected AbstractMinecraftServer(final String toString)
	{

	}

	/*
	 * GETTERS & SETTERS
	 */

	@Override
	public final String getServerDir()
	{ return dir; }

	@Override
	public final void setServerDir(final String dir)
	{ this.dir = dir; }

	@Override
	public final String getVersion()
	{ return this.version; }

	@Override
	public final void setVersion(final String version)
	{ this.version = version; }
}