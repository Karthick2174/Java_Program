import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		int num =28;
		int sum =0;	//1,3,7,14,28
		int a=1;	//2,3,4,5,6,7,8,9,10,11,12,13,14,15
		while(a<=num/2){
			if(num%a==0){
				//28%14
				sum=sum+a;
			}
			a++;		//Incremebt the A value
		}
		if(sum==num)
			System.out.println("Perfect");
		else
			Sysytem.out.println("Not Perfect");
	}
}