package Method1Usingforloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
	public static void main(String[] args)
    {
  
        // initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3,
                                       4, 5, 6, 7, 8);
  
        // For Loop for iterating ArrayList
        for (int i = 0; i < numbers.size(); i++)
        	//The line for(int i = 0; i < number. length; i++) is your clue.
        	//A for-loop, which you are declaring here, specifies three parameters*:
        		//An initialization variable, when to continue the loop, and what to do after each iteration:
        			//int i = 0 is the initialization variable.
        	
            System.out.print(numbers.get(i) + " ");        
    }

	

}
