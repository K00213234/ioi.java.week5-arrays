
/**
 @author Mark Crowe
 */
public class SetArrayElementExample
{

	public static void main(String[] args)
	{
		System.out.println("Set Array Element Example");
		//
		//	declare and Initialize array
		//
		String[] programmingLanguages = new String[5];

		programmingLanguages[0] = "Java";
		programmingLanguages[1] = "C#";
		programmingLanguages[2] = "PHP";
		programmingLanguages[3] = "VB";
		programmingLanguages[4] = "HTML";

		for(int index = 0; index < 5; index++)
		{
			System.out.println(programmingLanguages[index]);

		}
	}
}
