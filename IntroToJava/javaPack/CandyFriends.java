package javaPack;

import java.util.Scanner;

public class CandyFriends
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter total candies: ");
		int candies = input.nextInt();
		
		System.out.print("Enter number of friends: ");
		int firends = input.nextInt();
		
		int eachGets = candies/firends;
		int leftover = candies%firends;
		
		System.out.print("Enter your height in meters: ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double height = input.nextDouble();
		
		System.out.print("Enter your weight in kilorgams: ");
		double weight = input.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.print("Your BMI is " + bmi);
		System.out.print("Each friend gets " + eachGets + "candies");
		System.out.print("Leftover candies"  +  leftover);

	}

}
