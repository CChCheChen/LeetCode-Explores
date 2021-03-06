package a_array;

import java.util.Arrays;

public class A_Array_Operations {

	public static void main(String[] args) {
		//1.Initialize Array
		int[] a0 = new int[5];
		int[] a1 = {1, 2, 3};
		
		//2.Get Array Length
		System.out.println("Array Size of a1 = " + a1.length);
		
		//3.Randomly Access Array Element
		System.out.println("First Element of a1 is " + a1[0]);
		
		//4.Iterate All Array Elements
		System.out.println("Method 1: ");
		for(int i=0; i<a1.length; i++) {
			System.out.print(" " + a1[i]);
		}
		System.out.println();
		System.out.println("Method 2: ");
		for(int i : a1) {
			System.out.print(" " + i);
		}
		System.out.println();
		
		//5.Modify Array Element
		a1[0] = 4;
		
		//6.Sort Array
		Arrays.sort(a1);
		System.out.println("After sorting: ");
		for(int i : a1) {
			System.out.print(" " + i);
		}

	}

}
