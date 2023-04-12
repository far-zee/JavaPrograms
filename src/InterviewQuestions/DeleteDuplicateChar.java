package InterviewQuestions;

public class DeleteDuplicateChar {

	public static void main(String[] args) {
	
		
		String s="java";
		String result="";
		int count=1;
		char[] c=s.toCharArray();
		
		
		for(int i=0;i<c.length;i++)
		{
			for (int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j] && c[j]!=' ')
				{
					count++;
					c[j]=0;
				}
				
				if(count>1 && c[i] !='0')
				{
					result=String.valueOf(c);
				}
			}
				
					
		}
	System.out.println(result);

	}

}
