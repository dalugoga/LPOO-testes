
public class FileSystem 
{
	private String type;
	private Folder root;
	private Folder parent;
	
	public FileSystem(String type)
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}

	public Folder getRoot() 
	{
		return root;
	}
	
	public Folder getParent()
	{
		return null;
	}

	
}
