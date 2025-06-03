import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		FinalAttributeDemo ob1 = new FinalAttributeDemo(6);
		//ob1.a = 100;
		System.out.println(ob1.SetA());
		FinalAttributeDemo ob2 = new FinalAttributeDemo();
		System.out.println(ob2.getA());
		

		//System.out.println(ob1.getA());
	}
}