
public class FindWordsAtEvenPositions {
    public static String findLargestSubstring(String input) {
        String largestSubstring = "";
        StringBuilder currentSubstring = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            // Check if current character is at an even position
            if (i % 2 == 0) {
                char currentChar = input.charAt(i);
                // Check if current character is a special character
                if (isSpecialCharacter(currentChar)) {
                    // Check if a meaningful word follows the special character
                    String followingWord = getFollowingWord(input, i + 1);
                    if (!followingWord.isEmpty()) {
                        // If the current substring is longer than the largest found so far, update it
                        if (currentSubstring.length() > largestSubstring.length()) {
                            largestSubstring = currentSubstring.toString();
                        }
                        // Reset current substring to start building the next potential substring
                        currentSubstring.setLength(0);
                    }
                }
            } else {
                // Append characters at even positions to the current substring
                currentSubstring.append(input.charAt(i));
            }
        }

        return largestSubstring;
    }

    public static boolean isSpecialCharacter(char c) {
        return !Character.isLetterOrDigit(c);
    }

    public static String getFollowingWord(String input, int startIndex) {
        StringBuilder word = new StringBuilder();
        for (int i = startIndex; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                word.append(currentChar);
            } else if (Character.isWhitespace(currentChar)) {
                break;
            } else {
                // If a non-letter character is encountered before a whitespace, the following word is not meaningful
                return "";
            }
        }
        return word.toString();
    }

    public static void main(String[] args) {
        String input = "HappyI%&&87Christmas %%$^%&NewYear";
        String largestSubstring = findLargestSubstring(input);
        System.out.println("Largest Substring: " + largestSubstring);
    }
}

