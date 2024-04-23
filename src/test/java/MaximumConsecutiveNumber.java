
public class MaximumConsecutiveNumber {

    //Find the maximum consecutive 1's in an array of 0's and 1's.
    //Example:
    //a) 00110001001110 - Output :3 [Max num of consecutive 1's is 3]
    //b) 1000010001 - Output :1 [Max num of consecutive 1's is 1]

    // Method to find the maximum consecutive 1's in a binary string
    public static int findConsecutive(String binaryString) {
        int maxCount = 0; // Max number of consecutive 1s;
        int count = 0; // Current count of consecutive 1s, which hasn't started yet;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++; // Increment count if current character is '1'
            } else {
                if (count > maxCount) {
                    maxCount = count; // Update maxCount if the current count is greater
                }
                count = 0; // Reset count to start counting next segment of 1s
            }
        }

        // Final check to compare the last count with maxCount
        if (count > maxCount) {
            maxCount = count;
        }

        return maxCount; // Return the maximum count found
    }

    public static void main(String[] args) {
        String binaryString = "0001111001011";
        System.out.println("Max number of consecutive 1s is: " + findConsecutive(binaryString));
    }
}
