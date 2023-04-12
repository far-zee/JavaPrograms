package InterviewQuestions;

import java.util.Scanner;

public class DeleteChar {

	public static void main(String[] args) {
		
	
		System.out.println("Enter your email address: ");
		Scanner sc= new Scanner(System.in);
		String email=sc.next();
		sc.close();
		String userName= "";
		
		for (int i=0;i<email.length();i++)
		{
			if (email.charAt(i) == '@') 
			{
					break;
			}	
			else
			{
				userName+= email.charAt(i);
			}
		}
		System.out.println("Username is: " +userName);
}

}