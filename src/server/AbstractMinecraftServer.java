package server;

abstract class AbstractMinecraftServer implements MinecraftServer
{
	protected String dir, name, encPassword, version;
	protected int ram;

	protected AbstractMinecraftServer()
	{ dir = ""; }

	protected AbstractMinecraftServer(final String toString)
	{ dir = ""; }

	@Override
	public final String toString()
	{
		return this.getClass().getSimpleName() + ": " + name + ", "
				+ encPassword + ", " + ram;
	}

	/*
	 * GETTERS & SETTERS
	 */

	@Override
	public final String getVersion()
	{ return this.version; }

	@Override
	public final void setVersion(final String version)
	{ this.version = version; }
	
	@Override
	public final String getServerDir()
	{ return dir; }
}