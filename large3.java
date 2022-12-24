class large3{  //third8 largest number
	public static void main(String[] args){
	int [] arr ={14,12,15,13,16,11};
	int large = arr[0];		//14,15,16
	int slarge =  arr[1];	//12,14,15
	int tlarge = arr[2];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>large){		//11>16
		tlarge
		slarge =large;
		large = slarge;
		tlarge = arr[i];
	}
	else if (arr[i]>large)	//11>15
	{
		slarge = tlarge;
		tlarge = arr[i];
	}
	}
		System.out.println(large);
		System.out.println(slarge);
		System.out.println(tlarge);
	}
}