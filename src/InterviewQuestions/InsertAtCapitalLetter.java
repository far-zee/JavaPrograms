package InterviewQuestions;

public class InsertAtCapitalLetter {

	public static void main(String[] args) {
		
		
		String s ="ArchanaQaHyderabad";
		
		char ch[]= s.toCharArray();
				
		for (int i=1;i<ch.length;i++)
		{
			
			if(Character.isUpperCase(i))
			{
				char temp=ch[i];
				ch[i]='_';
				ch[i+1]=temp;
	
			}
			
					
		}
		String result= String.copyValueOf(ch);
		
		System.out.println("The new string is:" +result);
	}

}
