/**
 * @author Eugene Petrov
 */
public class isPalindromeInt {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int reversed = 0;
        int original = num;
        while (original > reversed) {
            int digit = num % 10;
            reversed = original * 10 + digit;
            reversed /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 12321;
        boolean isPalindrome = isPalindrome(num);
        System.out.println("The number " + num + " is Palindrome " + isPalindrome);
    }
}
