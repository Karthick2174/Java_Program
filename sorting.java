class sorting{
	static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
}
	public static void main(String[] args){
	int[] arr={13,12,15,14,16};
	System.out.println("Before sorting");
		display(arr);
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		display(arr);
}
}

		