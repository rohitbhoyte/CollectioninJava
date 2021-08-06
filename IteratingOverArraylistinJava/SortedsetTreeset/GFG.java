package SortedsetTreeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class GFG {
	public static void main(String[] args) {
		
		SortedSet<Object> st=new TreeSet<Object>();
		st.add("Rohit");
		st.add('a');
		//st.add(11);
		
		for(Object x:st)
		{
			System.out.println(x);
		}
	}

}
