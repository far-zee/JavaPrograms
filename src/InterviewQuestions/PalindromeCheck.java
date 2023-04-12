package InterviewQuestions;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		System.out.println("Enter any poistive number: ");
		Scanner ip= new Scanner(System.in);
		int num=ip.nextInt();
		ip.close();
		int rev=0;
		while(num!=0)
		{
			int rem= num%10; //121
			rev= rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println("The reverse of the number is:"+rev);
		
		

	}

}
