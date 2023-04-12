package InterviewQuestions;

import java.util.Scanner;

public class Circle {

	
	
	public static double circumference (double r) 
	{
		double cf= 2*3.14*r;
		return cf;
		
	}
	
	public static double area (double r) 
	{
		double ar= 3.14*r*r;
		return ar;
		
	}
	
	public static void main(String[] args) {


		System.out.println("Enter the radius of circle: ");
		Scanner sc= new Scanner(System.in);
		double rad=sc.nextDouble();
		sc.close();
		
		double c= circumference(rad);
		System.out.println("The circumference of circle is: " +c);
		
		double a= area(rad);
		System.out.println("The area of circle is: " +a);

	}

}
