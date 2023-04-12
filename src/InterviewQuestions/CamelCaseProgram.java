package InterviewQuestions;

public class CamelCaseProgram {

	public static void main(String[] args) {

//Input: "i Love Orange"
//Output: "I Love Orange"
		
		String s="i Love orange";
		String output="";
		
		String[] sp = s.split(" ");
		
		  
		 for (String word : sp ) 
		   { 
			 String temp=""; 
		   			
			 	for(int i=0;i<word.length();i++) 
		   			{
		   					if (i==0) 
		   					{ 
		   						temp+=(word.charAt(i)+"").toUpperCase();
		   						}
		  
		   					else 
		   					{ 
		   						temp+=(word.charAt(i)+"").toLowerCase();
		   						} 
		   					
		   					 
		   				} 
			 	output+=temp+" ";
		   		}
		  
		 System.out.println(output.trim());
		 
	}

}
