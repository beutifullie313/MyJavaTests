
public class FindSecondSmallestInArray {
    public static int findSecondSmallest(int[] nums) {
//     if (nums.length < 2) {
//        System.out.println("Array should have at least two elements.");
//        return -1; // Return -1 to indicate failure
//    }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
        if (num < smallest) {
            secondSmallest = smallest;
            smallest = num;
        } else if (num < secondSmallest && num != smallest) {
            secondSmallest = num;
        }
    }
//        if (secondSmallest == Integer.MAX_VALUE) {
//        System.out.println("All elements in array are same.");
//        return -1;
//    }
                return secondSmallest;
            }
//
//
    public static void main(String[] args) {
        int[] nums = {5, 7, 6, 4, 4, 23, 4};
        int secondSmallest = findSecondSmallest(nums);
        System.out.println("The second smallest number is: " + secondSmallest);
    }


}