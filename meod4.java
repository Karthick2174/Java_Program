class meod4{
	static void test(){
		System.out.println("Test Starts");
		System.out.println("Test Stop");
	}
	static void disp(){
		System.out.println("disp starts");
		test();
		System.out.println("disp stop");
	}
	public static void main(String[] args){
		System.out.println("Main Strats");
		disp();
		System.out.println("Main Stop");
	}
}