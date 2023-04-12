package InterviewQuestions;

public class DuplicateWords {

	public static void main(String[] args) {
		
		
		String s="java, javascript, C, C#, Java";
		
		String words[] = s.split(", ");
		
		int count;
		
		
		System.out.println("Duplicate words in string are: ");
		
		for (int i=0;i<words.length;i++)
		{
			count=1;
			
			for (int j=i+1;j<words.length;j++) 
			{
				
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
					
				}
			}
		if (count>1 && words[i]!="0")
			System.out.println(words[i]);
		
		}
		
	}

}
