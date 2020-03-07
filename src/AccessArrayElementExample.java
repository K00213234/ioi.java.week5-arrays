
/**
 @author Mark Crowe
 */
public class AccessArrayElementExample
{

	public static void main(String[] args)
	{
		System.out.println("Access Array Element Example");
		//
		//	declare and Initialize array
		//
		String[] programmingLanguages =
		{
			"Java", "C#", "PHP", "VB", "HTML"
		};

		String element1 = programmingLanguages[0];
		String element4 = programmingLanguages[3];

		System.out.println("element 1: " + element1);
		System.out.println("element 4: " + element4);
	}
}
