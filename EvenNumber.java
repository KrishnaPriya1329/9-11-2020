class EvenNumber
{
	public static int EvenInArray()
	{
		int number[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
			{
				System.out.println(number[i]);
			}
		}
		return number.length;
	}
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		EvenNumber.EvenInArray();
	}
}
		