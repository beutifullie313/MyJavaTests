
public class FindCommonPrefixInArrayOfStrings {

    public static String findCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the array is null or empty
        }

        // Initialize prefix with the first string in the array
        String prefix = strs[0];


        // Iterate through the array starting from the second string
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            // Compare characters of the current string with the prefix
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            // Update prefix to contain only the common prefix found so far
            prefix = prefix.substring(0, j);
            // If the prefix becomes empty, there's no common prefix
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = findCommonPrefix(strs);
        System.out.println("Common Prefix: " + commonPrefix);
    }
}

