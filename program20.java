class program20{
	public static void main(String[] args){
	int n=21;
	int val =1;
	for(int i=0;i<n;i++){
		System.out.print(val+"	");
		if(i<n/2)
			val++;
		else
			val--;
	}
	}
}