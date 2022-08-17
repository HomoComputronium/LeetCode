package com.homo.computronium.leetcode.easy.e0125.manual;

import com.homo.computronium.leetcode.easy.e0125.IsPalindrome;

import java.util.Arrays;

// https://leetcode.com/problems/valid-palindrome/
// 125. Valid Palindrome
public class Solution0125 implements IsPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = removeNonAlphanumeric(s);

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private String removeNonAlphanumeric(String str) {
        char[] chars = str.toCharArray();
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

        return new String(Arrays.copyOfRange(alphaNumChars, 0, pointer));
    }

    private boolean isInAlphanumericRange(int integer) {
        return (integer >= 97 && integer <= 122) ||
                (integer >= 48 && integer <= 57);
    }
}
