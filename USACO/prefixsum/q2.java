
/*
Problem Description

Farmer John has N cows standing in a row. Each cow has a distinct integer ID.

Farmer John wants to take a photo of a contiguous group of cows, but he only wants to take a picture if the sum of the cows’ IDs in the group is divisible by 7.

Write a function that returns the size of the largest contiguous group whose sum of IDs is divisible by 7.

Constraints

1 <= N <= 50,000

0 <= cows[i] <= 1,000,000

IDs are distinct integers

cows = [3, 5, 1, 6, 2, 14, 10]  o/p=5
The subarray [5, 1, 6, 2, 14] has a sum of 28, which is divisible by 7.

Its length is 5, which is the largest possible.
*/
import java.util.*;

class Solution {

    public static int largestGroupDivisibleBy7(int[] cows) {
        // TODO: Implement the solution using prefix sums modulo 7
        int n = cows.length;

        Map<Integer, Integer> map = new HashMap<>();

        int psum = 0, maxlen = 0;
        for (int i = 0; i < n; i++) {
            psum += cows[i];
            int rem = (int) psum % 7;
            if (!map.containsKey(rem)) {
                map.put(rem, i + 1);
            } else {
                maxlen = Math.max(maxlen, i + 1 - map.get(rem));
            }

        }
        return maxlen;
    }

    // Optional: main to test
    public static void main(String[] args) {

        int[] cows = { 3, 5, 1, 6, 2, 14, 10 };
        System.out.println(largestGroupDivisibleBy7(cows)); // Expected output: 5
    }
}
