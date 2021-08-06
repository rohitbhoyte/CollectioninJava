package Arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class GFG {
	public static void main(String[] args) {
		List<Object> s=new ArrayList<Object>();
		s.add("Rohit");
		s.add('a');
		s.add(1);
		s.add(1);

		
		for(Object x:s)
		{
			System.out.println(x);
		}
			
	}

}
