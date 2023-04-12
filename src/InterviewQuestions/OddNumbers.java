package InterviewQuestions;

import java.util.Scanner;

public class OddNumbers {

	public static int oddNumSum(int num) 
	{
		int sum=0;
			
			for (int i=1; i<=num;i++) 
			{
				if(i%2 != 0)	//to check if number is odd
					sum=sum+i;
			}
		
			return sum;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Enter the value of n:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int totalSum= oddNumSum(n);
		System.out.println("The sum of first " + n + " odd numbers is: " +totalSum);
	
	}

}
