package Method2Usingforeachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
	 public static void main(String[] args)
	    {
	        // initializing ArrayList
	        List<Integer> numbers = Arrays.asList(1, 2, 3,
	                                      4, 5, 6, 7, 8);
	  
	        // For Each Loop for iterating ArrayList
	        for (Integer i : numbers)
	            System.out.print(i + " ");
	    }
	

}

/*For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. 


It starts with the keyword for like a normal for-loop.
Instead of declaring and initializing a loop counter variable, 
you declare a variable that is the same type as the base type of the array, 
followed by a colon, which is then followed by the array name.
In the loop body, you can use the loop variable you created rather than using an indexed array element. 
 
It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
 

 
Syntax: 

for (type var : array) 
{ 
    statements using var;
}
is equivalent to: 
 

for (int i=0; i<arr.length; i++) 
{ 
    type var = arr[i];
    statements using var;
}
*/
