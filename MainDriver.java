class MainDriver{
	static int a;		//default data is there for static memeber in static variable
	public static void main(String[] args){
		MainDriver mainDriver = new MainDriver();
		System.out.println(a);
		System.out.println(MainDriver.a);
		System.out.println(MainDriver.a);
	}
}
		
		