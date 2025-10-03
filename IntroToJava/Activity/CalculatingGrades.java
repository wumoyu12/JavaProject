package Activity;

import java.math.MathContext;
import java.util.Scanner;

public class CalculatingGrades
{

	public static void main(String[] args)
	{
		Scanner allinput = new Scanner (System.in);
		
		System.out.print("Enter a course name: ");
		String course = allinput.nextLine();
		
		System.out.print("Please enter average amount of time you spent on " + course + " per week in minutes: ");
		int time = allinput.nextInt();
		
		int hours = time / 60;
		int minutes = time % 60;
		
		System.out.print("Please enter the first homework grade(it should be a whole number that is between 0 and 100)");
		int hw1 = allinput.nextInt();
		
		System.out.print("Please enter the second homework grade(it should be a whole number that is between 0 and 100)");
		int hw2 = allinput.nextInt();
		
		System.out.print("Please enter the third homework grade(it should be a whole number that is between 0 and 100)");
		int hw3 = allinput.nextInt();
		
		System.out.print("Please enter the fourth homework grade(it should be a whole number that is between 0 and 100)");
		int hw4 = allinput.nextInt();
		
		int hwsum = hw1 + hw2 + hw3 + hw4;
		double hwaverage = hwsum / 4;
		
		System.out.print("Please enter the first quiz grade (it should be the number that is between 0 and 100)");
		double quiz1 = allinput.nextDouble();
		
		System.out.print("Please enter the second quiz grade (it should be the number that is between 0 and 100)");
		double quiz2 = allinput.nextDouble();
		
		double quizsum = quiz1 + quiz2;
		double quizaverage = quizsum / 2;
		
		System.out.print("Please enter the final exam grade (it should be the number that is between 0 and 100)");
		double exam = allinput.nextDouble();
		
		double average = (hwaverage*0.35) + (quizaverage*0.15) + (exam*0.5);
		int overall = (int) average;
		
		System.out.println("The average amount of time you spent on " + course + " per week is " + hours +  " hours "  + minutes + " minutes.");
		System.out.print("The overall grade you got in " + course + " is " + overall + ".");
		
	}

}

