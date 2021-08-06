package workingofaHashSet;

/*Java HashSet class is used to create a collection that uses a hash table for storage.
It inherits the AbstractSet class and implements Set interface.
The important points about Java HashSet class are: HashSet stores the elements by using a mechanism called hashing.
*/
import java.util.HashSet;
import java.util.Iterator;

public class GFG {
	 public static void main(String args[])
	    {
	        // Creating HashSet and
	        // adding elements
	        HashSet<String> hs = new HashSet<String>();
	        /*
	         Few important features of HashSet are: 

Implements Set Interface.
The underlying data structure for HashSet is Hashtable.
As it implements the Set Interface, duplicate values are not allowed.
Objects that you insert in HashSet are not guaranteed to be inserted in the same order.
Objects are inserted based on their hash code.
NULL elements are allowed in HashSet.
HashSet also implements Serializable and Cloneable interfaces.
	         */
	  
	        hs.add("Geeks");
	        hs.add("For");
	        hs.add("Geeks");
	        hs.add("Is");
	        hs.add("Very helpful");
	        
	        //System.out.println(hs.toString());
	        //System.out.println(hs);

	        // Traversing elements
	        Iterator<String> itr = hs.iterator();
	        
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	    }

}
