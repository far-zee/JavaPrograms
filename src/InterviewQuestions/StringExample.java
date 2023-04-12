package InterviewQuestions;

public class StringExample {

	public static void main(String[] args) {
		
		String s1="java";
		char ch[]= {'s','t','r','i','n','g','s'};
		
		String s2= new String(ch);
		String s3= new String("example");
		String s4[] = {"Afghanistan", "India", "Iraq", "Nepal", "Pakistan"};
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s4);
		//find a substring using begin index and end index
		System.out.println(s1.substring(1,3));
		
	}

}
