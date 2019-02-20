/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray9;
import java.util.Arrays; 
class JavaArray9 
{ 
	public static void main (String[] args) 
	{ 
		int arr1[] = {1, 2, 3}; 
		int arr2[] = {1, 2, 4}; 
		if (Arrays.equals(arr1, arr2)) 
			System.out.println("Same"); 
		else
			System.out.println("Not same"); 
	} 
}
