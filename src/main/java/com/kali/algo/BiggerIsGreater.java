package com.kali.algo;

/**
 * Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
 * <p>
 * It must be greater than the original word
 * It must be the smallest word that meets the first condition
 * For example, given the word , the next largest word is .
 */
public class BiggerIsGreater {

    static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        char lastChar = chars[chars.length - 1];
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] < lastChar) {
                String prefix = i > 0 ? w.substring(0, i) : "";
                String suffix = swapFirstBiggest(chars[i], w.substring(i + 1).toCharArray());
                return prefix + suffix;
            }
            lastChar = chars[i];
        }
        return "no answer";
    }

    private static String swapFirstBiggest(char c, char[] sortedArr) {
        int swapIndex = findFirstBiggestIndex(c, sortedArr);
        char swapChar = sortedArr[swapIndex];
        sortedArr[swapIndex] = c;

        return new StringBuilder().append(String.valueOf(sortedArr))
                .append(swapChar)
                .reverse()
                .toString();
    }

    private static int findFirstBiggestIndex(char c, char[] sortedArr) {
        for (int i = sortedArr.length - 1; i >= 0; i--) {
            if (sortedArr[i] > c) {
                return i;
            }
        }
        return -1;
    }
}
