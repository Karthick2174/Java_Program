class array10{
	public static void main(String[] args){
		String[] name = {"Priya","Kokila","Anusha","Ramya"};
		double[] values = {7.2,7.8,8.1,6.7};
		double sum=0;
		for(int i=0;i<values.length;i++){
			//sum = sum +arr[i];
			sum+=values[i];
		}
		for (int i=0;i<values.length;i++){
		System.out.println("Name : "+name[i]+" CGPA : "+values[i]);}
		double avg=sum/values.length;
		System.out.println("Average values : "+avg);
	}
}