import java.io.*;
class BRRead
{
public static void main ( String args []) throws IOException
{
char c;
BufferedReader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter characters,'q' to quit.");
do 
{
c= (char) br.read();
System.out.println(c);
}
while(c !='q');
}
}