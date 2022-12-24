import java.io.*;
import java.util.*;
public class program13{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input intial high value : ");
		int j = sc.nextInt();
		System.out.print("Level low value : ");
		int z = sc.nextInt();
		System.out.print("Input a output : ");
		String b = sc.next();
		System.out.println("Program Start");
		for(int i=j;i>z;i--)
		{
			System.out.println(i+"\t"+b);
		}
		System.out.println("Program Ends");
	}
}