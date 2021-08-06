package ListsizemethodinJava;

import java.util.ArrayList;
import java.util.List;

public class GFG2 {
	
	 public static void main(String[] args)
	    {
	 
	        // Creating object of List<Integer>
	        List<String> list = new ArrayList<String>();
	 
	        // Populating List
	        list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	 
	        // print list
	        System.out.println("Before operation: "
	                           + list);
	 
	        // getting total size of list
	        // using size() method
	        int size = list.size();
	 
	        // print the size of list
	        System.out.println("Size of list = "
	                           + size);
	    }
}


