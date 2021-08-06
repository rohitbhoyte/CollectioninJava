package Method3UsingForEachMethodofJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
	 public static void main(String[] args)
	    {
	        // initializing ArrayList
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 
	                                       4, 5, 6, 7, 8);
	  
	           //lambda
	        numbers.forEach(number->System.out.println(number));
	  
	    }
}