import java.io.*;
class GFG {
	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;
		// Code to swap 'x' and 'y'
		x = x * y; // x now becomes 50
		System.out.println(x);
				System.out.println(y);
		y = x / y; // y becomes 10
				System.out.println(y);
		x = x / y; // x becomes 5
				System.out.println(x);
		System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
	}
}