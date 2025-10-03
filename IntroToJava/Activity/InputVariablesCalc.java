package Activity;

import java.util.Scanner;

public class InputVariablesCalc
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first whole number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second whole number: ");
		int num2 = input.nextInt();
		
		System.out.println("Sum: " + (num1 + num2));
		System.out.print("Product: " + (num1 * num2));
	}

}
