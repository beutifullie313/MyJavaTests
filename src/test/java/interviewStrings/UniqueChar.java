package interviewStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueChar {
    // I was asked to write an algorithm to find 1st unique letter in a string.
    // For example, str = "Google", it should return “l”.
    public static char findFirstUniqueChar(String str) {

        //Set<Character> uniqueSet = new HashSet<>();
        Map<Character, Integer> frequencyMap = new HashMap<>();//we need map as we need to count number of repeated characters
        String lowercased = str.toLowerCase();
        for (char ch : lowercased.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : lowercased.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }


    public static void main(String[] args) {
        String str = "Googllee";
        char firstUnique = findFirstUniqueChar(str);
        System.out.println(firstUnique);
    }
}


