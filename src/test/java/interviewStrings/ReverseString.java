package interviewStrings;

import org.testng.annotations.Test;

/**
 * @author Eugene Petrov
 */
public class ReverseString {
//    //reverse a string keeping special characters at same position ie as$d% to ds$a%
//    public static String reverseString(String str){
//        StringBuilder newString = new StringBuilder();//in this string we will store result
//        for(int i = str.length()-1; i>=0; i--){//start with end of the str, while string comes to 0; i--
//            newString.append(str.charAt(i));
//        }
//        return newString.toString();
//    }
//
//    public static void main(String[] args) {
//        String str = "as$d%";
//        String newString = reverseString(str);
//        System.out.println("Reversed string: " + newString);
//
//
//    }

    public static String reverseStringLeaveSpecialChars(String str) {
        char[] arr = str.toCharArray();
        //create 2 pointers for start and for end

        int start = 0; // index of string start
        int end = str.length() - 1; //index of string end

        //find letters in a string from start
        for (char currentLetter : arr) {
            if (!Character.isLetter(arr[start])) {
                start++;
                //find letters from the end
            } else if (!Character.isLetter(arr[end])) {
                end--;
                //swap the letters
            } else {
                char current = arr[start];
                arr[start] = arr[end];
                arr[end] = current;
                start++;
                end--;
            }
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        String str = "as$d%";
        String reversed = reverseStringLeaveSpecialChars(str);
        System.out.println("Reversed string: " + reversed);
    }
}
