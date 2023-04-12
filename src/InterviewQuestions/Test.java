package InterviewQuestions;
public class Test {

	// Java Program to Convert a String to Character Array
	// Using Naive Approach
	  
    // Main driver method
	    public static void main(String args[])
	    {
	  
	        // Custom input string
	        String str = "Geeks For Geeks";
	  
	        // Creating array of string length
	        // using length() method
	        char[] ch = new char[str.length()];
	  
	        // Copying character by character into array
	        // using for each loop
	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        
	            	if (ch[i]== '\s') {
	            		
	        }
	        // Printing the elements of array
	        // using for each loop
	        for (char c : ch) {
	            System.out.println(c);
	        }
	    }
	    }
}