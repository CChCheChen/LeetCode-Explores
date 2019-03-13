package a_array;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

public class E_Plus_One {

	public static void main(String[] args) {
		int[] digits = {9,9,9,9};
		int[] result = plusOne(digits);
		System.out.println("Plus One -->");
		for(int i : result)
		    System.out.print(" " + i);
	}
	
	public static int[] plusOne(int[] digits) {
		if(null == digits || digits.length == 0) {
			return new int[] {1};
		}
		
		List<Integer> list = new ArrayList<>();
		
		int overflow = 0;
		
		//Last Digit + 1, to determine overflow
		int lastDigit = digits[digits.length-1] + 1;
		if(lastDigit > 9) {
			overflow = 1;
			list.add(0);
		}else {
			list.add(lastDigit);
		}
		
		//for each digits in digits[], check overflow and add into list
		for(int i=digits.length-2; i>=0; i--) {
			int temp = digits[i] + overflow;
			if(temp > 9) {
				list.add(0);
				overflow = 1;
			}else {
				list.add(temp);
				overflow = 0;
			}
		}
		
		//after all digits checked, if overflow>0, add overflow into list
		if(overflow > 0) {
			list.add(overflow);
		}
		
		//reversely add list element into result[] and return result[]
		int size = list.size();
		int[] result = new int[size];
		for(int i=size-1; i>=0; i--) {
			System.out.println(i);
			result[size-1-i] = list.get(i);
		}
		
		return result;
	}

}
