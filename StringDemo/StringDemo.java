public class StringDemo
{
public static void main(String [] args)
{
String s1="prottoy saha";
String s2=new String ("Prottoy saha");

int len=s1.length();
System.out.println("Length of s1=" +len);
if ( s1==s2 )
{
System.out.println("Equals");
}
else{
System.out.println("Not equals");
}
}
}