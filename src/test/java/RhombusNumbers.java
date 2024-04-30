/**
 * @author Eugene Petrov
 */
public class RhombusNumbers {
        public static void main(String[] args) {
            int n = 3; // Number of rows in the upper half of the rhombus

            // Upper half of the rhombus
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print left half of the row
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Print right half of the row
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }

                System.out.println();
            }

            // Lower half of the rhombus
            for (int i = n - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print left half of the row
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Print right half of the row
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }
