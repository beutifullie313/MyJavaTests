
public class MergeSortedArrays {

        public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
            // Initialize indices for arrays firstArray, B, and C
            int i = 0, j = 0, k = 0; //starting positions for 3 arrays

            // Calculate the lengths of arrays firstArray and secondArray
            int m = firstArray.length;
            int n = secondArray.length;

            // Initialize array C with length equal to the sum of lengths of firstArray and B
            int[] resultArray = new int[m + n];

            // Merge arrays firstArray and secondArray into array resultArray while maintaining sorted order
            while (i < m && j < n) {
                if (firstArray[i] < secondArray[j]) {
                    resultArray[k++] = firstArray[i++];
                } else {
                    resultArray[k++] = secondArray[j++];
                }
            }

            // Copy remaining elements of array firstArray, if any
            while (i < m) {
                resultArray[k++] = firstArray[i++];
            }

            // Copy remaining elements of array B, if any
            while (j < n) {
                resultArray[k++] = secondArray[j++];
            }

            return resultArray;
        }

        public static void main(String[] args) {
            int[] A = {1, 3, 5, 7};
            int[] B = {2, 4, 6, 8};

            int[] C = mergeArrays(A, B);

            System.out.println("Merged Sorted Array:");
            for (int num : C) {
                System.out.print(num + " ");
                //Merged Sorted Array:
                //1 2 3 4 5 6 7 8
            }
        }
    }


