import java.io.*;
import java.util.*;
public class program11{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Put a letter");
		char grade = sc.next.CharAt();
		switch(grade)
		{
			case 'a' : System.out.println("Excellent");
			break;
			case 'b' : System.out.println("Good");
			break;
			case 'c' : System.out.println("Poor");
		}
	}
}