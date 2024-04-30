/**
 * @author Eugene Petrov
 */
public class Practice {

    //given a string, count letters and output: a2b2c1

    public static int reverseNumber(int nums) {
        int reversedNum = 0;

        while (nums > 0) {
        int i = nums % 10;
            reversedNum = reversedNum * 10 + i;
            nums /= 10;

        }
        return reversedNum;
    }


    public static void main(String[] args) {
        int nums = 1234567;
        int reverseString = reverseNumber(nums);
        System.out.println(reverseString);
    }
}
