package javaPack;

public class NumericCasts
{

	public static void main(String[] args)
	{
		int wholeNumber = 25;
		double decimalNumber = wholeNumber;
		System.out.println("Int to double: " + decimalNumber);
		
		double pi = 3.14159;
		int approxPi = (int) pi;
		System.out.println("Double to int: " + approxPi);
		
		int a = 7;
		int b = 2;
		
		int intDivision = a / b;
		double realDivision = (double) a/b;
		
		System.out.println("Interger division 7/2 = " + intDivision);
		System.out.println("Real division 7/2 = " + realDivision);
		
		long bigValue = 123456789L;
		int smallValue = (int) bigValue;
		System.out.println("Long to int: " + smallValue);
	}

}
