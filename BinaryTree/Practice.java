package BinaryTree;

public class Practice {
   
	String name;
	Practice left;
	Practice right;
	
	public Practice() {
		// TODO Auto-generated constructor stub
	}
	
	public Practice(String name)
	{
		this.name=name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
}