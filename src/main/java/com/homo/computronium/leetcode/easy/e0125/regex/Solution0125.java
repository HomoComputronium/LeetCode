package com.homo.computronium.leetcode.easy.e0125.regex;

import com.homo.computronium.leetcode.easy.e0125.IsPalindrome;

public class Solution0125  implements IsPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
