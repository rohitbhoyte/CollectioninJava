package ArraysasListmethodinJava;

import java.util.Arrays;
import java.util.List;

public class GFG {
	 public static void main(String[] argv) throws Exception
	    {
	 
	        try {
	        	//The asList() method of java.util.Arrays class is used
	        	//to return a fixed-size list backed by the specified array. 
	 
	            // creating Arrays of String type
	            String a[]
	                = new String[] { "A", "B", "C", "D" };
	 
	            // getting the list view of Array
	            List<String> list = Arrays.asList(a);
	 
	            // printing the list
	            System.out.println("The list is: " + list);
	        }
	 
	        catch (NullPointerException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	    }

}
