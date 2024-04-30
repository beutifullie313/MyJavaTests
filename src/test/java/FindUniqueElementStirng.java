import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eugene Petrov
 */
public class FindUniqueElementStirng {
    //Write a program to print the first non-repeated char in a string. e.g.
    // A string “Is it your first company” returns ‘u’
    public static char findFirstRepeated(String str){
        //toCharArray
        //2 for:each cycles
        //to store chars and their number of occurencies, we need a map
        //tests: if the string is empty
        //if the string has several unique elements, it should return only the first one
        //if the string doesn't have any unique elements
        //if all elements are unique
//        if(str.length()<= 0){
//            return ' ';

        Map <Character, Integer> result = new HashMap<>();
        str = str.toLowerCase();
        for(char c: str.toCharArray()){
            result.put(c, result.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray()) {
            if (result.get(c) == 1) {
                return c;
            }
        }
            return ' ';

    }

    public static void main(String[] args) {
        String str = "1abc";
        char uniqueChar = findFirstRepeated(str);
        System.out.println("Unique element in a string is: " + uniqueChar);
    }
















}
//    public static char findFirstNonRepeatedChar(String str) {
//        // Create a map to store character counts
//        Map<Character, Integer> charCounts = new HashMap<>();
//        str = str.toLowerCase();
//
//        // Iterate through the string and count occurrences of each character
//        for (char c : str.toCharArray()) {
//            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
//        }
//
//        // Iterate through the string to find the first non-repeated character
//        for (char c : str.toCharArray()) {
//            if (charCounts.get(c) == 1) {
//                return c; // Found the first non-repeated character
//            }
//        }
//
//        // If no non-repeated character is found, return null or throw an exception
//        // Here, we return a default character as per the requirements
//        return ' '; // You can change this to null or throw an exception if needed
//    }
//
//    public static void main(String[] args) {
//        String str = "Is it your first company";
//        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
//        System.out.println("First non-repeated character: " + firstNonRepeatedChar); // Output: 'u'
//    }
//}