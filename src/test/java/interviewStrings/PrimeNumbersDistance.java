package interviewStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersDistance {
    //You are given an array of integers. Find the minimum difference between two prime numbers(Positive or negative) in the array when present with minimum time complexity and provide the test data to test the this code. {2,42,4,54,2,34,5,3,2,343453453}
    //1. find all prime numbers in int[]:
    //what do we return?
    //where to we store the result?
    //loop to iterate through the given array of numbers with for:each cycle
    //if boolean isPrime, add to the list (we need a helper method isPrime)
    //2. sort the result array
    //3.find the minimum difference between them (number)


    public static void main(String[] args) {
        // Test data
        int[] arr = {10, 9, 3, 33, 13, 19, 5, 23};

        int minDiff = findMinPrimeDifference(arr);
        System.out.println("Minimum difference between two prime numbers: " + minDiff);
    }

    public static int findMinPrimeDifference(int[] arr) {
        // Find all prime numbers in the array
        ArrayList<Integer> primes = new ArrayList<>();//here we store prime numbers found
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);//add numbers from array to new list
                System.out.println(primes);
            }
        }

        // Sort the list of primes
        int[] primeArray = new int[primes.size()];//create new array with the size of list of prime numbers
        for (int i = 0; i < primes.size(); i++) {
            primeArray[i] = primes.get(i);//and every number in new array will get the number from List
        }
        Arrays.sort(primeArray);//now sort the array

        // Calculate the minimum difference between adjacent primes
        int minDiff = Integer.MAX_VALUE;//starting point of the difference
        for (int i = 1; i < primeArray.length; i++) {
            int diff = primeArray[i] - primeArray[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
