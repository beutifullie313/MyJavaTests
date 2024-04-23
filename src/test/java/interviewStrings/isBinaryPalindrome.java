package interviewStrings;

public class isBinaryPalindrome {
    //Given a number find nearest palindrome. 12321

   // public static boolean findNearestPalindrome(String nums){

//        StringBuilder reversedString = new StringBuilder();
//
//        for(int i = nums.length()-1; i>=0; i--){
//            reversedString.append(i);
//        }
//
//    }
            public static void main(String[] args) {
                int num = 9; // Change this to test different numbers
                boolean isBinaryPalindrome = checkBinaryPalindrome(num);
                System.out.println("Binary representation of " + num + " is " + (isBinaryPalindrome ? "" : "not ") + "a palindrome.");
            }

            public static boolean checkBinaryPalindrome(int num) {
                // Convert the number to binary representation
                String binary = Integer.toBinaryString(num);

                // Check if the binary representation is a palindrome
                int left = 0;
                int right = binary.length() - 1;

                while (left < right) {
                    if (binary.charAt(left) != binary.charAt(right)) {
                        return false; // Not a palindrome if characters don't match
                    }
                    left++;
                    right--;
                }
                return true; // If loop completes, it's a palindrome
            }
        }


