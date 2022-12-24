import java.util.Scanner;
class scan1{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			System.out.println(i);
		Scanner scn = new Scanner(System.in);
		System.out.print("Input the value : ");
		int val = scn.nextInt();
		System.out.println("Output the value : "+val);
		//String
		System.out.print("Input the WORD : ");
		String word = scn.next();
		System.out.println("Output the WORD : "+word);
		}
	}
}