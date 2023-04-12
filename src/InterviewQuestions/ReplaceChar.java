package InterviewQuestions;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {

			
		  System.out.println("Enter any string below: "); 
		  Scanner sc= new Scanner(System.in); 
		  String ip= sc.next(); 
		  sc.close(); 
		  
		  String result= ip.replace('e', 'i'); //replace a single character
		  
		  System.out.println("New String is: " +result);
		 
		 
	}

}
