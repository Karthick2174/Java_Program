import java.io.*;
import java.util.*;
class work {
	public static void main(String[] args){
    Scanner sc = new Scanner();
    System.out.print("Input value 1 : ");
		int x = sc.nextInt();
    System.out.print("Input value 2: ");
		int y = sc.nextInt();
		x = x * y; 
		y = x / y; 
		x = x / y;
		System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
	}
}
