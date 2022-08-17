package com.homo.computronium.leetcode.easy.e0125.array;

import com.homo.computronium.leetcode.easy.e0125.IsPalindrome;

import java.util.Arrays;

public class Solution0125 implements IsPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        char[] chars = s.toCharArray();
        char[] alphaNumChars = new char[chars.length];

        char emptyChar = 0;
        Arrays.fill(alphaNumChars, emptyChar);

        int pointer = 0;
        for (int i = 0; i < chars.length; i++) {
            int currCharInt = (int) chars[i];
            if (isInAlphanumericRange(currCharInt)) {
                alphaNumChars[pointer] = chars[i];
                pointer++;
            }
        }

        pointer--;

        for (int i = 0, j = pointer; i <= pointer; i++, j--) {
            if (alphaNumChars[i] != alphaNumChars[j]) {
                return false;
            }
        }

        return true;
    }

    private boolean isInAlphanumericRange(int integer) {
        return (integer >= 97 && integer <= 122) ||
                (integer >= 48 && integer <= 57);
    }
}
