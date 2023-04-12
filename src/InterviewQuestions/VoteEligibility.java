package InterviewQuestions;

import java.util.Scanner;

public class VoteEligibility {
	
	public static void elig(int a)
	{
		if(a>18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible to vote");
	}
	

	public static void main(String[] args) {

		System.out.println("Enter the age: ");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		sc.close();
		elig(a);

	}

}
