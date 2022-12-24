//Write first 5 element in fibonaaci series
class fic{
	public static void main(String [] args){
		int n=5;						//5,4,3,2,1,0
		int fic1 =0;					//0,1,1,2,3,5
		int fic2=1;						//1,2,3,5,8
		int fic3=fic2+fic1;				//1,2,3,5,8,13
		while(n>0){
			System.out.print(fic1+"	");
			fic1=fic2;
			fic2=fic3;
			fic3=fic1+fic2;
			n--;						//decrement the value
		}
	}
}