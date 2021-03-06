package a_array;

import java.util.Arrays;
import java.util.HashMap;

/*
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.

Example 1:

Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
 

Example 2:

Input: nums = [1, 2, 3, 4]
Output: -1
Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
 

Note:

nums will have a length in the range [1, 50].
Every nums[i] will be an integer in the range [0, 99].
 */

public class D_Largest_Number_At_Least_Twice_Of_Others {

	public static void main(String[] args) {
		int[] nums = {3, 6, 1, 0};
		System.out.println("Dominant Index = " + dominantIndex(nums));  
	}
	
	public static int dominantIndex(int[] nums) {
		if(nums.length == 1)
            return 0;
        
        int index = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(i, nums[i]);
            //System.out.println(i + "--" + nums[i]);
        }
        
        Arrays.sort(nums);
//        for(int i : nums) {
//        	System.out.print(i);
//        }
        
        if(nums[nums.length-1] >= (2*nums[nums.length-2])){
            for(int i=0; i<nums.length; i++){
                if(map.get(i) == nums[nums.length-1]){
                    index = i;
                    break;
                }
            }
        }else{
            index = -1; 
        }
        
        return index;
	}

}
