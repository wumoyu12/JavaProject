package StudentInfo;

public class PersonInfo
{
	private String firstname, lastname;
	private int grade, lastgrade, thisgrade;
	
	public PersonInfo(String fname, String lname, int grade, int cGPA, int pGPA)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.grade = grade;
		this.lastgrade = pGPA;
		this.thisgrade = cGPA;
	}
	
	public String GetName()
	{
		String fullname = firstname + " " + lastname;
		return fullname;
	}
	
	public Double GetGPA()
	{
		double fourScale = thisgrade / 100 * 4;
		return fourScale;
	}
	
	public Double updateGPA100()
	{
		double avgerage = (thisgrade + lastgrade) / 2;
		return avgerage;
	}
	
	public Double updateGPA()
	{
		double averageGPA = updateGPA100() / 100 * 4;
		return averageGPA;
	}
	
	public Boolean promote()
	{
		boolean ifPromote = false;
		if (GetGPA() >= 2.6)
		{
			ifPromote = true;
		}
		return ifPromote;
	}
	
	public int GetGrade()
	{
		grade = grade + 1;
		return grade;
	}
	
	public Boolean isHonorRoll()
	{
		boolean ifHoorRoll = false;
		if (updateGPA() >= 3.5)
		{
			ifHoorRoll = true;
		}
		
		return ifHoorRoll;
		
	}

}
