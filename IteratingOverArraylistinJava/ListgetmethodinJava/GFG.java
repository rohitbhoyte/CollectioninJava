package ListgetmethodinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
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
  
        System.out.println("List: " + arr);
  
        // element at index 2
        //The get() method of List interface in Java is used to get the element present in this list at a given specific index.
        int element = arr.get(2);
  
        System.out.println("The element at index 2 is " + element);
    }

	

}
