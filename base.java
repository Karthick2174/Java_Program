//Question is 2^5
class base{
	public static void main(String[] args){
		int base =2;	//
		int power = 5;	//4,3,2,1,0 --number is reduce
		int res = 1;	//2,4,8,16,32 -- power is increase, how many time we give
		while(power>0){
			res = res* base;
			power--;
			//System.out.println(res);	//for trace
		}
		System.out.println("Result of : "+res);
	}
}