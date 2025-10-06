package Info;

public class Person
{
	private String firstname;
	private String lastname;
	private int userbirthyr;
	
	public Person(String fname, String lname, int userdob)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.userbirthyr = userdob;
	}
	
	public String Fullname()
	{
		String completename;
		completename = firstname + " " + lastname;
		return completename;
	}
	
	public String FullnameUpper()
	{
		String uppername = Fullname().toUpperCase();
		return uppername;
	}
	
	public String FullnameLower()
	{
		String lowername = Fullname().toLowerCase();
		return lowername;
	}
	
	public int FullnameLength()
	{
		int fullnamelen = firstname.length() + lastname.length();
		return fullnamelen;
	}
	
	public int PersonAge()
	{
		int ageofperson;
		ageofperson = 2025 - userbirthyr;
		return ageofperson;
	}
	
}
