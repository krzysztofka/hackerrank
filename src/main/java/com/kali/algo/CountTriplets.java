package com.kali.algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
