class array11{
	public static void main(String[] args){
		int[] arr = {12,13,11,17,16,15};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				System.out.println("Even number : " + arr[i]);
			else
				System.out.println("There are odd number : "+ arr[i]);
		}
	}
}