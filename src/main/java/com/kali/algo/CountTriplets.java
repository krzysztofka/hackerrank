package com.kali.algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given an array and you need to find number of tripets of indices (i, j, k)
 * such that the elements at those indices are in geometric progression for a given common ratio r and i < j < k.
 *
 * For example, [1,4,16,64] has [1,4,16] and [4,16,64]
 */
public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        long result = 0;

        Map<Long, Long> counterR1 = new HashMap<>();
        Map<Long, Long> counterR2 = new HashMap<>();

        for (Long l : arr) {
            result += counterR2.getOrDefault(l, 0L);
            long r1 = counterR1.getOrDefault(l, 0L);
            increaseCounter(counterR1, l * r, 1L);
            increaseCounter(counterR2, l * r, r1);
        }
        return result;
    }

    static void increaseCounter(Map<Long, Long> counterR1, Long l, Long w) {
        long c = counterR1.getOrDefault(l, 0L);
        counterR1.put(l, c + w);
    }
}
