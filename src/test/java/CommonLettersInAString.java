/**
 * @author Eugene Petrov
 */
public class CommonLettersInAString {
    public static String findCommonLettersInAString (String str1, String str2) {
                StringBuilder common = new StringBuilder();

                // Iterate over each character in the first string
                for (int i = 0; i < str1.length(); i++) {
                    char ch = str1.charAt(i);

                    // If the character is present in the second string and not already in the common string
                    if (str2.indexOf(ch) != -1 && common.indexOf(Character.toString(ch)) == -1) {
                        common.append(ch);
                    }
                }

                return common.toString();
            }

            public static void main(String[] args) {
                String str1 = "string";
                String str2 = "strong";

                String commonAlphabets = findCommonLettersInAString(str1, str2);
                System.out.println("Common alphabets: " + commonAlphabets);
            }
        }


