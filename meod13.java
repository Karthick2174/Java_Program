class meod13{
	public static void main(String[] args){
		for(int i=1;i<5;i++){
			int res=factorial(i);
			System.out.println(i+" Factorial : "+res);
		}
	}
	static int factorial(int n){
		int fact=1;
		while(n>0){
			fact=fact*n;	//fact = 1*n; -- fact = 2*n;
			n--;			//dec.
		}
		return fact;
	}
}