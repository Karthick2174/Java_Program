class array5{
	public static void main(String[] args){
		char ch[]={'a','b','c','d','e'};
		for(int i=ch.length-1;i>=0;i--){		//size-1 if 5 but index is 4
			System.out.println(ch[i]);
		}
	}
}