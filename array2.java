import java.util.Scanner;
class array2{
	public static void main(String[] aqrgs){
	Scanner scn = new Scanner(System.in); 
	char[] ch={'a','e','i','o','u'};
	ch[2]='C';						//Changing the assigned value index of 2
	ch[4]='$';
	System.out.println(ch[0]);		//if want use loop also to print and scan
	System.out.println(ch[1]);
	System.out.println(ch[2]);
	System.out.println(ch[3]);
	System.out.println(ch[4]);
	}
}
