package ListgetmethodinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG2 {
	  public static void main(String[] args)
	    {
	        // creating an Empty Integer List
	        List<Integer> arr = new ArrayList<Integer>(4);
	  
	        // using add() to initialize values
	        // [10, 20, 30, 40]
	        arr.add(10);
	        arr.add(20);
	        arr.add(30);
	        arr.add(40);
	  
	        try {
	            // Trying to access element at index 8
	            // which will throw an Exception
	        	//IndexOutofBoundException Demonstration
	            int element = arr.get(8);
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }

}
