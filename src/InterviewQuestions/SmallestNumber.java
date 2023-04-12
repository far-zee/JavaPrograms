package InterviewQuestions;

//import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {

		int size, temp;
				
		int a[]= {23,12,56,89,23,90,12};
		
		size=a.length;
		
		for(int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
				
		}
			
		//Arrays.sort(a);
		
		System.out.println("The smallest number is:: "+a[1]);
		

	}

}


