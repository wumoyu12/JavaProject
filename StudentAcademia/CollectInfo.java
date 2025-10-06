package StudentInfo;

import java.util.Scanner;

public class CollectInfo
{
	String sfname, slname, ans;
	int grade = 0;
	int lgrade = 0;
	int tgrade = 0;
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		System.out.println("Enter your first name: ");
		sfname = allinput.nextLine(); 
		System.out.println("Enter your last name: ");
		slname = allinput.nextLine(); 
		System.out.println("Enter your grade level: ");
		grade = allinput.nextInt();
		System.out.println("Enter your average grade from last year(0-100): ");
		lgrade = allinput.nextInt();
		System.out.println("Enter your average grade from this year(0-100): ");
		tgrade = allinput.nextInt();
		
		PersonInfo studentinfo = new PersonInfo(sfname, slname, grade, lgrade, tgrade);
		
		System.out.println("Student Name:" + studentinfo.GetName());
		System.out.println("Grade Level:" + grade);
		
		System.out.println("Average from last year:");
		System.out.println("100 scale-" + lgrade);
		System.out.println("4 scale-" + studentinfo.GetGPA());
		
		System.out.println("Average from this year:");
		System.out.println("100 sacle-" + tgrade);
		System.out.println("4 sacle-" + studentinfo.GetGPA());
		
		System.out.println("Current GPA:" );
		System.out.println("100 scale-" + studentinfo.updateGPA100());
		System.out.println("4 scale-" + studentinfo.updateGPA());
		
	
	
	if (studentinfo.isHonorRoll() == true)
	{
		System.out.println("Congratulations! You are in Honor Roll!");
	}
	
	if (studentinfo.promote() == true)
	{
		System.out.println("You are going to grade " + studentinfo.GetGrade() + ".");
	}
	
	else
	{
		System.out.println("You are still in grade " + grade + ", because your GPA is below the 65.");
	}
	
	}
}
