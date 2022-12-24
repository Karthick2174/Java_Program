class large2{  //second largest number
	public static void main(String[] args){
	int [] arr ={14,12,15,13,16,11,15};
	int large = arr[0];		//14,15,16
	int slarge =  arr[1];	//12,14,15
	for(int i=0;i<arr.length;i++){
		if(arr[i]>large){		//11>16
		slarge =large;
		large = arr[i];
	}
	else if (arr[i]>large)	//11>15
	{
		slarge = arr[i];
	}
	}
		System.out.println(large);
		System.out.println(slarge);
	}
}