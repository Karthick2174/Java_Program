class factorial{
	public static void main(String[] args){
		int num=10;
		int fact = 1;
		while(num>0){
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	}
}