package InterviewQuestions;

import java.util.Scanner;

public class UIAverage {

	
	
	public static float average(float num1,float num2, float num3)
	{
		
		float avg= (num1+num2+num3)/3;
		return avg;
		
	}
	public static void main(String[] args) {
		
		int a,b,c;
		
		System.out.println("Enter first number: ");
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();

		System.out.println("Enter second number: ");
		b=sc.nextInt();
		
		System.out.println("Enter third number: ");
		c=sc.nextInt();
		
		sc.close();
		
		float av= average(a,b,c); // calling the Average function
		
		System.out.println("Average is:" +av);	
	
	}

}
