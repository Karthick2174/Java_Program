//find a smallst value
class small1
{
	public static void main(String[] args)
	{
		int[]  arr = {13,12,11,15,14,10};
		int small = arr[0];				
		for(int i=1;i<arr.length;i++)	//start from 1 bcuz of already assing 1
		{
			if(arr[i]<small)			//compare
				small=arr[i];			//value assign the smallst value
		}
		System.out.println(small);
	}
}