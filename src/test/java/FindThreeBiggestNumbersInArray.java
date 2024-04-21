
public class FindThreeBiggestNumbersInArray {
    public static int findThreeBiggestNumbersInArray(int [] numArr){

        if(numArr.length < 3){
            throw new IllegalArgumentException("Minimum number of elements is 3");

        }

        int firstBiggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;
        int thirdBiggest = Integer.MIN_VALUE;

        for(int num : numArr) {
            if (num > firstBiggest) {
                secondBiggest = firstBiggest;
                thirdBiggest = secondBiggest;
                firstBiggest = num;
            } else if (num > secondBiggest) {
                thirdBiggest = secondBiggest;
                secondBiggest = num;
            } else if (num > thirdBiggest) {
                thirdBiggest = num;
            }
        }
        return firstBiggest+secondBiggest+thirdBiggest;
    }

    public static void main(String[] args) {
        int [] numArr = {4,3,4,22,4,44,3,2};
       int product = findThreeBiggestNumbersInArray(numArr);
        System.out.println(product);
    }
}
