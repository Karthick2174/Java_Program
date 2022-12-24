//find a largest value
class large1
{
	public static void main(String[] args)
	{
		int[]  arr = {13,12,11,15,14,10};
		int large = arr[0];				//13,15 assign. value
		for(int i=1;i<arr.length;i++)	//start from 1 bcuz of already assing 1
		{
			if(arr[i]>large)			//compare
				large=arr[i];			//value assign the largest value
		}
		System.out.println(large);
	}
}