package Activity;

import java.util.Scanner;

public class GradeAverage
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first grade: ");
		double grade1 = input.nextDouble();
		
		System.out.print("Enter second grade: ");
		double grade2 = input.nextDouble();
		
		System.out.print("Enter third grade: ");
		double grade3 = input.nextDouble();
		
		System.out.print("Enter fourth grade: ");
		double grade4 = input.nextDouble();
		
		System.out.print("Enter fifth grade: ");
		double grade5 = input.nextDouble();
		
		double sum = grade1 + grade2 + grade3 + grade4 + grade5;
		double average = sum / 5;
		System.out.print("Average: " + average);
	}

}
