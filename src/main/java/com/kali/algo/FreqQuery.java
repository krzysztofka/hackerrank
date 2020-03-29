package com.kali.algo;

import java.util.*;

public class FreqQuery {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        Map<Integer, Long> storedMap = new HashMap<>();
        Map<Long, Set<Integer>> freqMap = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for (List<Integer> q : queries) {
            int command = q.get(0);
            int val = q.get(1);
            if (command == 1) {
                add(val, storedMap, freqMap);
            } else if (command == 2) {
                remove(val, storedMap, freqMap);
            } else {
                result.add(freqExist(val, freqMap) ? 1 : 0);
            }
        }
        return result;
    }

    private static void add(int val, Map<Integer, Long> storedMap, Map<Long, Set<Integer>> freqMap) {
        long count = storedMap.getOrDefault(val, 0L);
        long newCount = count + 1;
        storedMap.put(val, newCount);
        freqMap.computeIfAbsent(newCount, c -> new HashSet<>());
        freqMap.get(newCount).add(val);
        if (count > 0) {
            freqMap.get(count).remove(val);
        }
    }

    private static void remove(int val, Map<Integer, Long> storedMap, Map<Long, Set<Integer>> freqMap) {
        long count = storedMap.getOrDefault(val, 0L);
        long newCount = count - 1;
        if (count > 0) {
            storedMap.put(val, newCount);
            freqMap.get(count).remove(val);
            if (newCount > 0) {
                freqMap.get(count - 1).add(val);
            }
        }
    }

    private static boolean freqExist(long val, Map<Long, Set<Integer>> freqMap) {
        Set<Integer> freqData = freqMap.get(val);
        return freqData != null && !freqData.isEmpty();
    }


}
