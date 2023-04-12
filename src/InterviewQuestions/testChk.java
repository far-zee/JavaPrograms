package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testChk {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
	    list.add("java");
	    list.add("Java");
	    list.add("javascript");
	    list.add("c");
	    list.add("C#");
	    
		Map<String, Long> counter = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			System.out.println(counter);
		
	}

}
