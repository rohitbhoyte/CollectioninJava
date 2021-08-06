package Method3UsingIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GFG {
	public static void main(String[] args)
    {
        // initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 
                                       4, 5, 6, 7, 8);
  
        // Looping ArrayList using Iterator
        Iterator it = numbers.iterator();
        while (it.hasNext())
        	         //The hasNext() is a method of Java Scanner class which returns true 
        	         //if this scanner has another token in its input.
        	
            System.out.print(it.next() + " ");
                    //The next() is a method of Java Scanner class which finds and
                    //returns the next complete token from the scanner which is in using.
    }
}
