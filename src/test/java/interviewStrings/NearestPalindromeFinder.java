package interviewStrings;

public class NearestPalindromeFinder {

        public static void main(String[] args) {
            int num = 123; // Change this to test different numbers
            int nearestPalindrome = findNearestPalindrome(num);
            System.out.println("Nearest palindrome to " + num + " is: " + nearestPalindrome);
        }

        public static boolean isPalindrome(int num) {
            int original = num;
            int reversed = 0;
            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return original == reversed;
        }

        public static int findNextPalindrome(int num) {
            while (true) {
                num++;
                if (isPalindrome(num)) {
                    return num;
                }
            }
        }

        public static int findPreviousPalindrome(int num) {
            while (true) {
                num--;
                if (isPalindrome(num)) {
                    return num;
                }
            }
        }

        public static int findNearestPalindrome(int num) {
            if (isPalindrome(num)) {
                return num;
            }

            int nextPalindrome = findNextPalindrome(num);
            int previousPalindrome = findPreviousPalindrome(num);

            int nextDistance = Math.abs(nextPalindrome - num);
            int previousDistance = Math.abs(previousPalindrome - num);

            return nextDistance < previousDistance ? nextPalindrome : previousPalindrome;
        }
    }

