
public class FindDistance {
    public static int findDistance(String sentence, char char1, char char2) {
        // Check if the sentence is null or empty
        if (sentence == null || sentence.isEmpty()) {
            return -1; // Return -1 if the sentence is invalid
        }

        int index1 = -1; // Index of first character, -1 means it's not located yet
        int index2 = -1; // Index of second character

        // Iterate through the sentence to find the indices of the characters
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar == char1) {
                index1 = i; // Update index of first character
            } else if (currentChar == char2) {
                index2 = i; // Update index of second character
            }

            // If both characters are found, break the loop
            if (index1 != -1 && index2 != -1) {
                break;
            }
        }

        // Check if both characters are found in the sentence
        if (index1 == -1 || index2 == -1) {
            return -1; // Return -1 if any character is not found
        }

        // Calculate the distance between the indices of the characters
        return Math.abs(index1 - index2);
    }

    public static void main(String[] args) {
        // Test the findDistance method with sample input
        String sentence = "Ajay is here";
        char char1 = 'A';
        char char2 = 'h';
        int distance = findDistance(sentence, char1, char2);
        System.out.println("Distance between '" + char1 + "' and '" + char2 + "': " + distance);
    }
}

