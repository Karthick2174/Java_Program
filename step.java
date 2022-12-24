class step{
	public static void main(String[] args){
		int x=6;
		int y=3;
		int z=12;
		int w = method1(x,y,z);
		System.out.println("w = " +w);
	}
	static void method1(int y,int z, int x){
		return(x*z)/y;
	}
}