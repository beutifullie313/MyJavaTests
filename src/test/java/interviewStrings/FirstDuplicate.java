package interviewStrings;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    //Write a code to detect the first number having duplicate in below mentioned Array.
    // Array = [4 1 2 5 8 1 3] Output would be 1.
    // Note : You can use any coding or scripting language.


//1.iterate through array of integers  to find duplicate numbers and store them in a separate list or set //or map?? (Set because we need only unique elements),
//2. Iterate throuhg the duplicate list and find first duplicate.
//3.return int
//test: if duplicate- return num, if no duplicates, return -1;

    public static int findFirstDuplicate (int [] nums) {
        Set<Integer> duplicates = new HashSet<>();
        int firstDuplicate = -1;//no duplicates

        for (int n : nums) {
            if (duplicates.contains(n)) {//if contains, then it's the firstDuplicate
                firstDuplicate = n;
                break; // Found the first duplicate, exit the loop
            } else {
                duplicates.add(n);
            }
        }

        return firstDuplicate;
    }

    public static void main(String[] args) {
        int [] nums= {4, 1, 2, 5, 8 ,1, 3};
        int firstDuplicate = findFirstDuplicate(nums);
        System.out.println(firstDuplicate);
    }






}
