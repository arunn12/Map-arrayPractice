
package list2;

/**
 *
 * @author USER
 */
import java.util.*; 

public class List2 
{ 
	public static void main(String[] args) 
	{ 
		// Type safe array list, stores only string 
		List<String> l = new ArrayList<String>(5); 
		l.add("hai"); 
		l.add("hello"); 
		l.add("bye"); 

		// Using indexOf() and lastIndexOf() 
		System.out.println("first index:" + 
								l.indexOf("hello")); 
		System.out.println("last index:" + 
							l.lastIndexOf("hello")); 
		System.out.println("Index of element"+ 
			" not present : " + l.indexOf("bye")); 
	} 
} 
