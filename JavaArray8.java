
package javaarray8;

import java.util.ArrayList; 
import java.util.Arrays; 

class JavaArray8 
{ 
public static void main(String args[]) 
	{ 
//		 Normal Array */
		int[] arr = new int[2]; 
		arr[0] = 1; 
		arr[1] = 2; 
		System.out.println(arr[0]); 

		/*............ArrayList..............*/
		
		ArrayList<Integer> arrL = new ArrayList<Integer>(2); 

		// Add elements to ArrayList 
		arrL.add(12); 
		arrL.add(2); 

		// Access elements of ArrayList 
		System.out.println(arrL.get(0)); 
	} 
} 
