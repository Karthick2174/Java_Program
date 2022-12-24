import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		Scanner scn =  new Scanner(System.in);
		System.out.print("Input the value : ");
		int num = scn.nextInt();   //if 17.
		int a=2;			//2,3,4,5,6,7,8.
		while(a<=num/2){	//
			if(num%a==0)
				break;		//break when condition is not ok of num / a
			a++;			//Increament the value of A. -- 2,3,4,5,6,7,8
		}
		if (a>num/2)
			System.out.println("Pirme");
		else
			System.out.println("Not Prime");
	}
}