class SumElements
{
	public static int SumOfArray()
	{
		int[] array={20,40,60,80,100};
		int sum=0;
		for(int number:array)
		{
			sum=sum+number;
		}
		System.out.println("Sum of array elements : " + sum);
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println("Inside main");
		SumElements.SumOfArray();
	}
}
