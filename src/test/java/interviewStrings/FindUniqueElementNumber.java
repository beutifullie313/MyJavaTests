package interviewStrings;

import java.util.HashSet;

import java.util.Set;

/**
 * @author Eugene Petrov
 */
public class FindUniqueElementNumber {
    //Write a code to detect the first number having duplicate in below mentioned Array.
    // Array = [4 1 2 5 8 1 3]
    // Output would be 1. Note : You can use any coding or scripting language.

    //iterate through array of ints
    //store into list, if list containsthis element, return it
    public static int findFirstDuplicate(int[] nums) {
       Set<Integer> result = new HashSet<>();
        for(int n:nums){
            if(!result.add(n)){
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {4, 1, 2, 5 ,8 ,1 ,3};
        int firstDuplicate = findFirstDuplicate(nums);
        System.out.println("The first duplicate is " + firstDuplicate);
    }
}
