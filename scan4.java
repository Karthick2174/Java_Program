import java.util.Scanner;
class scan4{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Entre String");
		String str =scn.next();
		
		System.out.println("Entre Boolean");
		boolean bool = scn.nextBoolean();
		
		System.out.println("Entre Double");
		double val = scn.nextDouble();
		
		System.out.println("  	String "+str+" Boolean "+bool+" Double "+val);
	}
}
		