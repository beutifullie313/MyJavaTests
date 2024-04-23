package interviewStrings;

/**
 * @author Eugene Petrov
 */
public class LongestPalindromeString {
    public static void main(String[] args) {
        String input = "babad"; // Change this to test different strings
        String longestPalindrome = findLongestPalindrome(input);
        System.out.println("Longest palindrome in \"" + input + "\" is: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // dp[i][j] indicates whether s.substring(i, j+1) is a palindrome

        String longestPalindrome = "";

        // Base case: single characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            longestPalindrome = s.substring(i, i + 1);
        }

        // Base case: two consecutive identical characters are palindromes
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                longestPalindrome = s.substring(i, i + 2);
            }
        }

        // Check for palindromes of length >= 3
        for (int len = 3; len <= n; len++) {
            for (int start = 0; start + len - 1 < n; start++) {
                int end = start + len - 1;
                if (s.charAt(start) == s.charAt(end) && dp[start + 1][end - 1]) {
                    dp[start][end] = true;
                    longestPalindrome = s.substring(start, end + 1);
                }
            }
        }

        return longestPalindrome;
    }
}

