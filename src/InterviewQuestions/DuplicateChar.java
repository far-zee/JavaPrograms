package InterviewQuestions;

public class DuplicateChar {

	public static void main(String[] args) {


		String s="aaBbBcCddeEff";
		int count;
		String ns = null;
		char ch[] = s.toCharArray();
		
		System.out.println("Duplicate characters in string: ");
		
		for (int i=0;i<ch.length;i++)
		{
			count=1;
			for (int j=i+1;j<ch.length;j++)
			{
				if (ch[i] == ch[j] && ch[j] !=' ')
				{
					count++;
					ch[j]=0;
				}
			}
					
			if(count>1 && ch[i]!='0')
			{
				
				System.out.println(ch[i]);		//prints duplicate characters in string
				ns= String.valueOf(ch);			//assigns remaining characters to new string
			}
			
		}	
		System.out.println("New String is:");
		System.out.println(ns); 		
}

	}

