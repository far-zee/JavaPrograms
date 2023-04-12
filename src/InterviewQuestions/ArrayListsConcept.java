package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListsConcept {

	public static void main(String[] args) {

		ArrayList<String> list1= new ArrayList<String>();
		//ArrayList<Character> list2= new ArrayList<Character>();
		
		String arr[]= new String[5];
		
		for(int i=0; i<5;i++)
		{
			list1.add(arr[i]);
		}
		
		
		
		list1.add(0, "India");
		list1.add(1, "Pakistan");
		list1.add(2, "Iraq");
		list1.add(3, "Nepal");
		list1.add(4, "Afghanistan");
		
		
		
		/*
		 * list2.add(0, 'Z'); list2.add(1, 'A'); list2.add(2, 't');
		 */
		
		/*
		 * System.out.println(list1); String ele= list1.get(0); System.out.println(ele);
		 */
		//list1.add(2, "Abc");
		Collections.sort(list1);
	System.out.println(list1);
		//Collections.sort(list2);
		
		for (int i=0;i<list1.size();i++)
			
		{
			
			System.out.println(list1.get(i));
		}
		
		/*
		 * for (int i=0;i<list2.size();i++)
		 * 
		 * {
		 * 
		 * System.out.println(list2.get(i)); }
		 */

	}

}
