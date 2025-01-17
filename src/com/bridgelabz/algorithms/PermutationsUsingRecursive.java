
package com.bridgelabz.algorithms;

/** *****************************************************************************
 * 1. Write static functions to return all permutations of a String using iterative method and Recursion method.
 *  Check if the arrays returned by two string functions are equal. 
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Algorithms;
import utility.Utility;

public class PermutationsUsingRecursive {
	public static void main(String[] args) {
		String str;
		str = Utility.inputString();
		Algorithms.permutations(str.toCharArray(), 0);
	}
}