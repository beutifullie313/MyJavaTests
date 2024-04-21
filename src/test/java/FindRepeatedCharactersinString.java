
public class FindRepeatedCharactersinString {
    public static String removeConsecutiveDuplicates(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            return str; // Return the input string itself
        }

        StringBuilder result = new StringBuilder();
        char prevChar = str.charAt(0);
        result.append(prevChar);

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // If current character is different from the previous character, append it to result
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar; // Update previous character
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdddeee";
        String result = removeConsecutiveDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing consecutive duplicates: " + result);
    }
}

