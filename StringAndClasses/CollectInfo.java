package Info;

import java.util.Scanner;

public class CollectInfo
{
	String fname, lname;
	int birthyear = 0 ;
	Scanner allintput = new Scanner(System.in);

	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		System.out.print("Enter your first name: ");
		fname = allintput.nextLine();
		
		System.out.print("Enter your middle initial: ");
		String midinit = allintput.nextLine();
		
		System.out.print("Enter your last name: ");
		lname = allintput.nextLine();
		
		System.out.print("Enter your year of birth: ");
		birthyear = allintput.nextInt();
		
		Person collectpers = new Person(fname, lname, birthyear);
		String fullname = collectpers.Fullname();
		int persdob = collectpers.PersonAge();
		
		System.out.println("Hello " + collectpers.Fullname() + "." + "I see you are " + persdob + " years old.");
	}
}
