package InterviewQuestions;

import java.util.Scanner;

public class StringsLength {

	public static void main(String[] args) {


		int length=0;
		System.out.println("How many strings do you want to enter? ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		
		String arr[]= new String[size];
		
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.next();
			length+= arr[i].length();
		}
		sc.close();
		
		System.out.println("Total length of the strings is: " +length);
		
		

	}

}
