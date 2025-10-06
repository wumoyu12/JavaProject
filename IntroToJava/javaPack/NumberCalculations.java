package javaPack;

import java.util.Scanner;

public class NumberCalculations
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = input.nextDouble();
		
		System.out.print("Sum = " + (num1 + num2));
		System.out.print("Difference = " + (num1 - num2));
		System.out.print("Product = " + (num1 * num2));
		System.out.print("Quotient = " + (num1 / num2));

	}

}
