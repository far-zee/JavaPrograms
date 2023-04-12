package InterviewQuestions;

import java.util.Scanner;

public class countPNZ {

	
	public static void main(String[] args) {

		
		int countPos=0;
		int countZero=0;
		int countNeg=0;
		
		
		System.out.println("How many numbers you want to enter? ");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " numbers: " );
		
		
		for (int i=0;i<n;i++)
		{
		
			arr[i]= sc.nextInt();
			
				if(arr[i] == 0)
						{
							countZero= countZero+1;
							
						}
						else if (arr[i]>0)
						{
							countPos= countPos+1;
						}
						else
							countNeg= countNeg+1;
			}
		
		sc.close();
		System.out.println("No. of positive integers is: " +countPos);
		System.out.println("No. of negative integers is: " +countNeg);
		System.out.println("No. of Zeros is: " +countZero);
	}
}
