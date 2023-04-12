package InterviewQuestions;

import java.util.Scanner;

public class GreaterofTwo {

	
	
	public static void printGreater(double num1, double num2) 
	{
		
		if(num1>num2)
		
			System.out.println("Greater number is: " + num1);
		else
			System.out.println("Greater number is: " +num2);
	}
	
	
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a=sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double b= sc.nextDouble();
		
		printGreater(a, b);
		sc.close();
	}

}
