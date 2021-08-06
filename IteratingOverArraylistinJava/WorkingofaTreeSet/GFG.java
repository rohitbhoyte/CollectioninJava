package WorkingofaTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class GFG {
	
		public static void main(String args[])
		{
			// Creating TreeSet and
			// adding elements
			TreeSet<String> ts
				= new TreeSet<String>();
			/*
			 The TreeSet class uses a Tree for storage.
			  The ordering of the elements is maintained by a set 
			  using their natural ordering whether or not an explicit comparator is provided.
			  This must be consistent with equals if it is to correctly implement the Set interface.
			 */

			ts.add("Geeks");
			ts.add("For");
			ts.add("Geeks");
			ts.add("Is");
			ts.add("Very helpful");

			// Traversing elements
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

/*
 TreeSet implements the SortedSet interface. So, duplicate values are not allowed.
Objects in a TreeSet are stored in a sorted and ascending order.
TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
If we are depending on the default natural sorting order, 
the objects that are being inserted into the tree should be homogeneous and comparable. 
TreeSet does not allow the insertion of heterogeneous objects.
It will throw a classCastException at Runtime if we try to add heterogeneous objects.
The TreeSet can only accept generic types which are comparable.
For example, the StringBuffer class implement the Comparable interface.
 
 
 * 
 */



