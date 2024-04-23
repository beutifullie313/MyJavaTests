/**
 * @author Eugene Petrov
 */
public class ReverseStringIntervals {
    public static String reverseStringInIntervals(String str, int[][] intervals) {
        char[] chars = str.toCharArray();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // Reverse the characters within the interval
            reverseSubstring(chars, start, end);
        }
            //and return a new reverted by intervals string
        return new String(chars);
    }
        // implement method for reverting intervals:
        // two-pointer approach to swap characters starting from the start and end indices
        // until they meet in the middle:
    private static void reverseSubstring(char[] chars, int start, int end) {
        while (start < end) {//until they meet in the middle
            char temp = chars[start];
            chars[start] = chars[end];//assigns the character at end index to the character at start index.
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        int[][] intervals = {{0, 4}, {5, 9}}; // Intervals: [0,4] and [5,9]

        String reversed = reverseStringInIntervals(input, intervals);
        System.out.println("Reversed String with intervals: " + reversed);
    }
}

