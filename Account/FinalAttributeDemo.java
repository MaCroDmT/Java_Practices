import java.lang.*;

public class FinalAttributeDemo
{
	public final int a;
	

	public FinalAttributeDemo()
	{
		a = 5;
	}

	public FinalAttributeDemo(int i)
	{
		//this();
		a = i;
	} 
	
	public void setA(int a){this.a = a;}
	
	public int getA(){return a;}
}