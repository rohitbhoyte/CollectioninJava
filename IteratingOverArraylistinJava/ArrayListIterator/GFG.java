package ArrayListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GFG {
	public static void main(String[] args) {
		//List<Object> s=new ArrayList<Object>();  //or
      List s=new ArrayList();
		  s.add("Rohit");
          s.add(2);
		  s.add(1);
		
// for collectionssorting      
//        s.add(2);
//		s.add(1);
//		Collections.sort(s);    // for same data type sorting
//		System.out.println(s);
		
		Iterator itr=s.iterator();  //An Iterator is an object that can be used to loop through collections, 
		                            //like ArrayList and HashSet.
		while(itr.hasNext())    //The hasNext() is a method of Java Scanner class which returns true 
			                    //if this scanner has another token in its input.
		{
			Object o=itr.next();  //The next() is a method of Java Scanner class which finds and 
			                      //returns the next complete token from the scanner which is in using
			
			System.out.println(o);
		}
		}

}
