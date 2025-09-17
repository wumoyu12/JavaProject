package Info;

public class General_Info
{

	public static void main(String[] args)
	{
		CollectInfo();
	}
	
	private static void CollectInfo()
	{
		Person personinfo = new Person("Moyu", "Wu", 2007);
		System.out.println("Hello " + personinfo.Fullname() + ".");
		System.out.println("HELLO " + personinfo.FullnameUpper() + ".");
		System.out.println("hello " + personinfo.FullnameLower() + ".");
		System.out.println("Your name has " + personinfo.FullnameLength() + " letters.");
		System.out.println("You are " + personinfo.PersonAge() + " yeas old.");
	}

}




package Info;

public class Person
{
	private String firstname;
	private String lastname;
	private int year;
	
	public Person(String fname, String lname, int year)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.year = year;
	}
	
	public String Fullname()
	{
		String completename;
		completename = firstname + " " + lastname;
		return completename;
	}
	
	public String FullnameUpper()
	{
		String uppername;
		uppername = Fullname().toUpperCase();
		return uppername;
	}
	
	public String FullnameLower()
	{
		String lowername;
		lowername = Fullname().toLowerCase();
		return lowername;
	}
	
	public int FullnameLength()
	{
		int length;
		int flength;
		int llength;
		flength = firstname.length();
		llength = lastname.length();
		length = flength + llength;
		return length;
	}
	
	public int PersonAge()
	{
		int age;
		age = 2025 - year;
		return age;
	}
	
}
