import java.io.*;
import java.util.*;
public class program15{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input intial  : ");
		int j = sc.nextInt();
		System.out.print("Level  : ");
		int z = sc.nextInt();
		System.out.print("Input a output  : ");
		String b = sc.next();
		System.out.println("Program Start");
		for(int i=j;i>z;i-=3)
		{
			System.out.println(i+"\t"+b);
		}
		System.out.println("Program Ends");
	}
}