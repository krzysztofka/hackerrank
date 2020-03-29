package com.kali.algo;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {
        int pairs = 0;
        Map<String, Integer> index = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            String newS = "";
            for (int j = i; j >= 0; j--) {
                char c = s.charAt(j);
                newS = appendChar(newS.toCharArray(), c);
                int count = index.getOrDefault(newS, 0);
                pairs += count;
                index.put(newS, count + 1);
            }
        }
        return pairs;
    }

    private static String appendChar(char[] s, char c) {
        int i = indexToAppendChar(s, c, 0, s.length);
        return new StringBuilder().append(s).insert(i, c).toString();
    }

    private static int indexToAppendChar(char[] s, char c, int start, int end) {
        int range = end - start;

        if (range == 0) {
            return start;
        } else if (range == 1) {
            return s[start] > c ? start : end;
        } else {
            int half = range / 2;
            if (s[start + half] == c) {
                return half + start;
            } else if (s[half + start] > c) {
                return indexToAppendChar(s, c, start, start + half);
            } else {
                return indexToAppendChar(s, c, start + 1 + half, end);
            }
        }
    }
}
