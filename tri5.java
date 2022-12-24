class tri5{
	public static void main(String[] args){
		int n=5;
		int a=1; //triangle 1 from patten exercise
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>=j)	
				System.out.print(a+" ");
				else
			    System.out.print(" "+" ");
			}
			System.out.println();
			a++;
		}
	}
}













/*
output
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/