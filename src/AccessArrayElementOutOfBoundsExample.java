
/**

 @author Mark Crowe
 */
public class AccessArrayElementOutOfBoundsExample
{

	public static void main(String[] args)
	{
		System.out.println("Access Array Element: Out Of Bounds Example");
		//
		//	declare and Initialize array
		//
		String[] programmingLanguages =
		{
			"Java", "C#", "PHP", "VB", "HTML"
		};

		String programmingLanguageAtIndex4 = programmingLanguages[4];
		System.out.println("programmingLanguageAtIndex4: " + programmingLanguageAtIndex4);

		String programmingLanguageAtIndex5 = programmingLanguages[5];
		System.out.println("programmingLanguageAtIndex5: " + programmingLanguageAtIndex5);
	}
}
