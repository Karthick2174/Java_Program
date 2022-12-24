class tri6{
	public static void main(String[] args){
		int n=5;
		int a=1;	//triangle 2 from patten exercise
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<=j){	
				System.out.print(a+" ");
				a++;
				}
				else{
			    System.out.print(" "+" ");
			a=1;
				}
			}
			System.out.println();
			//+*;
		}
	}
}