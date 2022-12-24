class meod3{
	static void read(){
		System.out.println("Executing read().........");
	}
	static void play(){
		System.out.println("Executing play().........");
	}
	static void verify(){
		System.out.println("Executing verify.........");
	}
	public static void main(String[] args){
		System.out.println("Program start........");
		verify();
		read();
		play();
		System.out.println("Program ends........");
	}
}
