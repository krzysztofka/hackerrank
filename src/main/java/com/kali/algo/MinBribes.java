package com.kali.algo;

public class MinBribes {

    public static String minimumBribes(int[] q) {
        int minBribes = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            int shift = q[i] - i - 1;
            if (shift > 2) {
                return "Too chaotic";
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    minBribes++;
                }
            }
        }
        return String.valueOf(minBribes);
    }


}
