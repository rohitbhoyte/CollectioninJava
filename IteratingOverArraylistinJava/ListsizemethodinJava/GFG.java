package ListsizemethodinJava;

import java.util.ArrayList;
import java.util.List;

public class GFG {
	
	    public static void main(String[] arg)
	    {
	        // Creating object of ArrayList<Integer>
	        List<Integer> list = new ArrayList<Integer>();
	        
	 
	        // Populating List
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	 
	        // print List
	        System.out.println("Before operation: "
	                           + list);
	 
	        // getting total size of list
	        // using size() method
	        int a = list.size();
	        //The size() method of List interface in Java is used to get the number of elements in this list.
	 
	        // print the size of list
	        System.out.println("Size of list = "
	                           + a);
	    }
}


