import java.util.Arrays;


public class FindTheElementInArray {
    //Given an array , find the element (say X) that has all the elements less that it to its left side and all the elements greater to it on its right side.
    //The left and right elements of X need not be in sorted form.
    public static int findElement(int[] nums) {
        int n = nums.length;

        // Initialize two arrays to keep track of the maximum element
        // from the left and the minimum element from the right
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];

        // Initialize the first element of maxLeft and the last element of minRight
        maxLeft[0] = Integer.MIN_VALUE;
        minRight[n - 1] = Integer.MAX_VALUE;

        // Fill the maxLeft array with the maximum element from the left side
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i - 1]);
        }

        // Fill the minRight array with the minimum element from the right side
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], nums[i + 1]);
        }

        // Check for elements where the element itself is greater than all elements to its left
        // and less than all elements to its right
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxLeft[i] && nums[i] < minRight[i]) {
                return i; // Found the element
            }
        }

        return -1; // No such element found
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 9, 10};

        int result = findElement(nums);

        if (result != -1) {
            System.out.println("Element found: " + nums[result]);
        } else {
            System.out.println("No such element found");
        }
    }
}