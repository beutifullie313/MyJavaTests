import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Eugene Petrov
 */
public class RemoveDuplicates {
    //Remove all the duplicate characters present in the given string aabbdjghdnnn
    //If we have aabb, do we remove all letters a or we leave one, not duplicated?
    public static String removeDuplicates(String str) {
        Set<Character> result = new HashSet<>();// to store unique characters encountered.
        StringBuilder stringBuilder = new StringBuilder();//to construct the result string without duplicates.

        for (char ch : str.toCharArray()) {//to iterate through a string
            if (!result.contains(ch)) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccdjgjdhnnn";
        String result = removeDuplicates(str);
        System.out.println("String without duplicates: " + str);
    }

}
