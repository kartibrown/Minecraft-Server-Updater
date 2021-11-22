package server;

public interface MinecraftServer
{
	public String getServerType();
	
	public String getServerDir();
	
	public String getVersion();
	public void setVersion(final String version);
}
