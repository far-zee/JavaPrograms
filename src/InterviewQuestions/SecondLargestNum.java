package InterviewQuestions;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {


		int a[]={5,22,13,38,20};
		int size;
		size =a.length;
		
		Arrays.sort(a);
		
		int res= a[size-2];
		
		System.out.println("The second largest number is:: "+res);

		/*
		 * for (int i=0;i<size;i++) { for (int j =i+1; j<size;j++) {
		 * 
		 * if(a[i]>=a[j]) {
		 * 
		 * temp=a[i]; a[i]=a[j]; a[j]=temp; } }
		 * 
		 * } System.out.println("The second largest number is:: "+a[size-2]);
		 */
	}

}
