
/**

 @author Mark Crowe
 */
public class AnArrayIsAnObjectInJava
{

	public static void main(String[] args)
	{
		System.out.println("An Array Is An Object In Java");
		//
		//	declare and Initialize array
		//
		String[] programmingLanguages =
		{
			"Java", "C#", "PHP", "VB", "HTML"
		};

		System.out.println("Array Fields");
		System.out.println("programmingLanguages.length:" + programmingLanguages.length);
		System.out.println("");
		System.out.println("Array Methods");
		System.out.println("programmingLanguages.hashCode():" + programmingLanguages.hashCode());
		System.out.println("programmingLanguages.toString():" + programmingLanguages.toString());

	}
}
