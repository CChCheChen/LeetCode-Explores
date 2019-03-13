package a_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Dynamic Array is ArrayList in Java
 */
public class B_Dynamic_Array_Operations {

	public static void main(String[] args) {
		//1.Initialize ArrayList
		List<Integer> l0 = new ArrayList<>();
		List<Integer> l1;
		
		//2.Cast Array to ArrayList
		Integer[] a = {0, 1, 2, 3, 4};
		l1 = new ArrayList<>(Arrays.asList(a));
		
		//3.Make a copy of ArrayList
		List<Integer> l2 = l1;//---------------------Make another reference of l1
		List<Integer> l3 = new ArrayList<>(l1); //---Make an actual copy if l1
		
		//4.ArrayList size
		System.out.println("ArrayList size of l1 = " + l1.size());
		
		//5.Randomly access element
		System.out.println("First element of l1 is " + l1.get(0));
		
		//6.Iterate ArrayList
		System.out.println("Method 1: ");
		for(int i=0; i<l1.size(); i++) {
			System.out.print(" " + l1.get(i));
		}
		System.out.println();
		System.out.println("Method 2: ");
		for(int i : l1) {
			System.out.print(" " + i);
		}
		System.out.println();
		
		//7.Modify element
		l2.set(0, 5);//modify l2 actually modifies l1
		System.out.println("First element of l1 is " + l1.get(0));
		l3.set(0, -5);//modify l3 not modify l1
		System.out.println("First element of l1 is " + l1.get(0));
		
		//8.Sort ArrayList
		Collections.sort(l1);
		
		//9.Add new elements at the END of ArrayList
		l1.add(9);
		print(l1);
		//9.Add new element at index, Shifts the element currently at that position(if any) and any subsequent elements to the right (adds one to theirindices). 
		l1.add(2, 7);
		print(l1);
		
		//10.Delete element at specific index
		l1.remove(l1.size()-1);
		print(l1);
	}
	
	public static void print(List<Integer> l1) {
		System.out.println();
		System.out.println("ArrayList: ");
		for(int i : l1) {
			System.out.print(" " + i);
		}
	}

}
