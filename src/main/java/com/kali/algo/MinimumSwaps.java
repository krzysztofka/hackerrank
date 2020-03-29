package com.kali.algo;

/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
 * You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
 * <p>
 */
public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {
        int minSwaps = 0;
        int[] indexes = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            indexes[arr[i] - 1] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int tmp = arr[i];
                arr[i] = arr[indexes[i]];
                arr[indexes[i]] = tmp;
                indexes[tmp - 1] = indexes[i];
                minSwaps++;
            }
        }
        return minSwaps;
    }
}
