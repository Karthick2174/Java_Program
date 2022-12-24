class test2
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		int b= a[4];
				System.out.println("output"+a[4]);
		int c= a[0];
				System.out.println("output"+a[0]);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Check"+a[i]);
		}
		a[0]=b;
				System.out.println("Wheather"+a[0]);
		a[4]=c;
				System.out.println("wherather"+a[4]);
		for(int j=0;j<a.length;j++)
		{
		System.out.println("output"+a[j]);
		}
	}
}	