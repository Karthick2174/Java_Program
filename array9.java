class array9{
	public static void main(String[] args){
		double[] values = {7.5,3.4,4.6,6.2};
		double sum=0;
		for(int i=0;i<values.length;i++){
			//sum = sum +arr[i];
			sum+=values[i];
		}
		double avg=sum/values.length;
		System.out.println("Average values"+avg);
	}
}

















