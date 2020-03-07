
/**
 @author Mark Crowe
 */
public class PrintArrayWithFiveNumbersUsingLength
{
	public static void main(String[] args)
	{
		System.out.println("Print Array With Five Numbers using Arrat.Length field");
		//
		//	declare and Initialize array
		//
		int[] numbers =
		{
			10, 20, 30, 40, 50
		};
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.println(numbers[index]);

		}
	}
}
