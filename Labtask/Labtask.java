public class Labtask{

public static void main(String args[]){

	String s1=new String("java");
	String s2=new String("java");
	String s3 ="java";
	String s4 =" class";
	String s5 ="Hello";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);


System.out.println(s1+s2);
System.out.println(s3.concat(s4));
System.out.println(s3.length());
System.out.println(s4.indexOf('a'));
System.out.println(s4.charAt(2));


if(s4==s5){
   System.out.println("yes");

}else {
System.out.println("No");
}
System.out.println(s1.equals(s2));
	}

}