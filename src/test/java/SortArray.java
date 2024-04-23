import java.util.*;
public class SortArray {
    public static void alternateSort(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num >= 0)
                positive.add(num);
            else
                negative.add(num);
        }

        // Merge positive and negative numbers alternately
        int i = 0, j = 0, k = 0;
        while (i < positive.size() && j < negative.size()) {
            nums[k++] = positive.get(i++);
            nums[k++] = negative.get(j++);
        }

        // Add remaining positive numbers if any
        while (i < positive.size()) {
            nums[k++] = positive.get(i++);
        }

        // Add remaining negative numbers if any
        while (j < negative.size()) {
            nums[k++] = negative.get(j++);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 6, 9, -4, -10, -9, 8, 8, 4};
        alternateSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}


