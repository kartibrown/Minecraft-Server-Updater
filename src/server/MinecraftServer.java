package server;

public interface MinecraftServer
{
	
	/*
	 * GETTERS & SETTERS
	 */

	public String getServerType();

	public String getServerDir();

	public void setServerDir(final String dir);

	public String getVersion();

	public void setVersion(final String version);
}
