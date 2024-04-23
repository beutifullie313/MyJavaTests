import java.util.HashMap;
import java.util.Map;

public class AnagramVerification {
    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for characters in str1
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Increment frequency for characters in str1
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Decrement frequency for characters in str2
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                // Character not present in str1, hence not an anagram
                return false;
            }
            int frequency = frequencyMap.get(c) - 1;
            if (frequency == 0) {
                frequencyMap.remove(c);
            } else {
                frequencyMap.put(c, frequency);
            }
        }

        // If all characters in str2 have been matched with characters in str1
        // and frequencyMap is empty, then str2 is an anagram of str1
        return frequencyMap.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILNT";

        if (areAnagrams(str1, str2)) {
            System.out.println(str2 + " is an anagram of " + str1);
        } else {
            System.out.println(str2 + " is not an anagram of " + str1);
        }
    }
}

