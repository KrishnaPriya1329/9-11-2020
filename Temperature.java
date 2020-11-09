class Temperature
{
	public static float Celsius_to_Kelvin(float c)
	{
		return (float)(c+273.15);
	}
	public static void main(String args[])
	{
		float c=100;
		System.out.println("Tempertaure in Kelvin(K) = " +Celsius_to_Kelvin(c));
	}
}