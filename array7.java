class array7{
	public static void main(String[] args){
		int[] arr={12,13,11,17,16,15};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			//sum = sum +arr[i];
			sum+=arr[i];
		}
		System.out.println("Sum of value : "+sum);
	}
}